package Hospital001;

public class PatientInfo {
	
	//환자의 기본 정보
	private int num;	 	 //환자 번호(고유번호)
	private String pname;	 //환자 이름
	private String floor; 	 //환자 병동
	private String froom;	 //환자 병실
	private int age; 		 //환자 나이
	private String gen;		 //환자 성별
	private String pnum1; 	 //주민등록번호 앞자리
	private String pnum2; 	 //주민등록번호 뒷자리
	private String Pphone; 	 //환자 전화번호
	private String address;	 //환자 주소
	private String date;	 //환자 입원일자
	private String MD;	 	 //Medical department, 진료과
	private String NoD; 	 //Name of Disease, 병명
	private String DName;    //주치의 이름
	private String Fname; 	 //보호자 이름
	private String Fphone;	 //보호자 전화번호
	private String memo;	 //메모사항
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getFroom() {
		return froom;
	}
	public void setFroom(String froom) {
		this.froom = froom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public String getPphone() {
		return Pphone;
	}
	public void setPphone(String pphone) {
		Pphone = pphone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMD() {
		return MD;
	}
	public void setMD(String mD) {
		MD = mD;
	}
	public String getNoD() {
		return NoD;
	}
	public void setNoD(String noD) {
		NoD = noD;
	}
	public String getDName() {
		return DName;
	}
	public void setDName(String dName) {
		DName = dName;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getFphone() {
		return Fphone;
	}
	public void setFphone(String fphone) {
		Fphone = fphone;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getPnum1() {
		return pnum1;
	}
	public void setPnum1(String pnum1) {
		this.pnum1 = pnum1;
	}
	public String getPnum2() {
		return pnum2;
	}
	public void setPnum2(String pnum2) {
		this.pnum2 = pnum2;
	}
	
}
