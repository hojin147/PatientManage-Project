package Hospital001;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

public class PatientDBA implements Hospital {
	String url ,user, passwd;
	
	//오라클 드라이버 연결 생성자
	public PatientDBA() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			url = "jdbc:oracle:thin:@localhost:1521:xe";
			user = "hospital";
			passwd = "0000";
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없음.");
		}
	}
	
	//닫는 메소드
	private void closeConnection(Connection con, PreparedStatement ps, Statement st, ResultSet rs) {
		try {
			if(rs!=null) rs.close();
			if(st!=null) st.close();
			if(ps!=null) ps.close();
			if(con!=null) con.close();
		} catch(SQLException e) {
			System.out.println("close 오류");
		}	
	}
	
	//환자 데이터 추가 메소드
	public void insert(PatientInfo p) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DriverManager.getConnection(url, user, passwd);
			//sql문 작성해서 날리기
			String sql = "insert into patientinfo values(hp_seq.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"; 
			ps = con.prepareStatement(sql);
			ps.setString(1, p.getPname());
			ps.setString(2, p.getFloor());
			ps.setString(3, p.getFroom());
			ps.setInt(4, p.getAge());
			ps.setString(5, p.getGen());
			ps.setString(6, p.getPnum1());
			ps.setString(7, p.getPnum2());
			ps.setString(8, p.getPphone());
			ps.setString(9, p.getAddress());
			ps.setString(10, p.getDate());
			ps.setString(11, p.getMD());
			ps.setString(12, p.getNoD());
			ps.setString(13, p.getDName());
			ps.setString(14, p.getFname());
			ps.setString(15, p.getFphone());
			ps.setString(16, p.getMemo());
			ps.executeUpdate(); //sql실행
			
		} catch (SQLException e) {
			System.out.println("insert sql문 오류");
		} finally {
			closeConnection(con, ps, null, null);
		}
	}
	
	//재원 환자 전체 검색
	public ArrayList<PatientInfo> PatientSelectAll() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		ArrayList<PatientInfo> arr = new ArrayList<>();
			
			try {
				con = DriverManager.getConnection(url, user, passwd);
				String sql = "select * from patientinfo";
				st = con.createStatement();
				rs = st.executeQuery(sql);
				while(rs.next()) {
					PatientInfo p = new PatientInfo();
					//순서는 상관없고 DB의 컬럼이름을 쌍따옴표 안에 넣어야함
					p.setNum(rs.getInt("no"));
					p.setFloor(rs.getString("floor"));
					p.setFroom(rs.getString("froom"));
					p.setPname(rs.getString("name"));
					p.setAge(rs.getInt("age"));
					p.setGen(rs.getString("gen"));
					p.setMD(rs.getString("md"));
					p.setNoD(rs.getString("nod"));
					p.setDName(rs.getString("dname"));
					p.setDate(rs.getString("hosday"));
					p.setPnum1(rs.getString("pnum1"));
					p.setPnum2(rs.getString("pnum2"));
					p.setPphone(rs.getString("pphone"));
					p.setFname(rs.getString("fname"));
					p.setFphone(rs.getString("fphone"));
					p.setAddress(rs.getString("address"));
					p.setMemo(rs.getString("memo"));
					arr.add(p);
				}
				
		} catch (SQLException e) {
			System.out.println("selectAll sql문 오류");
		} finally {
			closeConnection(con, null, st, rs);
		}
		return arr;
	}
	
	//환자 정보 수정
	public void PatientUpdate(PatientInfo p) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DriverManager.getConnection(url, user, passwd);																	//10
			String sql = "update patientinfo set name=?, floor=?, froom=?, age=?, gen=?, pnum1=?, pnum2=?, pphone=?, address=?, hosday=?, md=?, nod=?, dname=?, fname=?, fphone=?, memo=? where no=? ";
			ps = con.prepareStatement(sql);
			ps.setString(1, p.getPname());
			ps.setString(2, p.getFloor());
			ps.setString(3, p.getFroom());
			ps.setInt(4, p.getAge());
			ps.setString(5, p.getGen());
			ps.setString(6, p.getPnum1());
			ps.setString(7, p.getPnum2());
			ps.setString(8, p.getPphone());
			ps.setString(9, p.getAddress());
			ps.setString(10, p.getDate());
			ps.setString(11, p.getMD());
			ps.setString(12, p.getNoD());
			ps.setString(13, p.getDName());
			ps.setString(14, p.getFname());
			ps.setString(15, p.getFphone());
			ps.setString(16, p.getMemo());
			ps.setInt(17, p.getNum());
			//sql실행
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Update sql문 오류");
		} finally {
			closeConnection(con, ps, null, null);
		}
	}
	
	//환자정보 삭제 메소드
	public void patientDelete(int num) {
		Connection con = null;
		Statement st = null;
		try {
			con = DriverManager.getConnection(url, user, passwd);
			String sql = "delete from patientinfo where no="+num;
			st = con.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("delete sql문 오류");
		} finally {
			closeConnection(con, null, st, null);
		}
	}
	
	//환자 상세 검색 
	public ArrayList<PatientInfo> PatientSearch(String field, String word) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		ArrayList<PatientInfo> sarr = new ArrayList<PatientInfo>();
		String sql = "";
		
		try {
			if(word.equals("")) {
				sql = "select * from patientinfo where floor like '%" + field + "%'";
			} else if(field.equals("선택하세요")){
				sql = "select * from patientinfo where name like '%" + word + "%'";
			} else {
				sql = "select * from patientinfo where floor like '%" + field +  "%' and name like '%" + word + "%'";
			}
			
			con = DriverManager.getConnection(url, user, passwd);
			st = con.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()){
				PatientInfo p = new PatientInfo();
				p.setNum(rs.getInt("no"));
				p.setFloor(rs.getString("floor"));
				p.setFroom(rs.getString("froom"));
				p.setPname(rs.getString("name"));
				p.setAge(rs.getInt("age"));
				p.setGen(rs.getString("gen"));
				p.setMD(rs.getString("md"));
				p.setNoD(rs.getString("nod"));
				p.setDName(rs.getString("dname"));
				p.setDate(rs.getString("hosday"));
				p.setMemo(rs.getString("memo"));
				sarr.add(p);
			}
		} catch (SQLException e) {
			System.out.println("search sql문 오류");
		} finally {
			closeConnection(con, null, st, rs);
		}
		return sarr;
	}
	
	
}
