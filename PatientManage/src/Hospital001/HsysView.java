package Hospital001;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.DropMode;
import javax.swing.DebugGraphics;

public class HsysView extends JFrame {

	private JPanel contentPane;
	private JTabbedPane hosp;
	private JPanel panel_1;
	private JSplitPane splitPane;
	private JScrollPane scrollPane;
	private JPanel panel;
	private JTable intable;
	private JLabel lblNewLabel2_1;
	private JTextField tfpn;
	private JLabel lblNewLabel_14;
	private JComboBox cbf;
	private JLabel lblNewLabel_1_1;
	private JComboBox cbfr;
	private JLabel lblNewLabel_2_1;
	private JLabel lblNewLabel_3_1;
	private JLabel lblNewLabel_4_1;
	private JComboBox cbg;
	private JTextField tfa;
	private JTextField tfadr;
	private JLabel lblNewLabel_5_1;
	private JTextField tfdn;
	private JLabel lblNewLabel_6_1;
	private JLabel lblNewLabel_7_1;
	private JLabel lblNewLabel_8_1;
	private JLabel lblNewLabel_9_1;
	private JTextField tfinday;
	private JTextField tfppn;
	private JTextField tffnum;
	private JTextField tfnod;
	private JLabel lblNewLabel_10_1;
	private JLabel lblNewLabel_11_1;
	private JLabel lblNewLabel_12_1;
	private JComboBox cbmd;
	private JTextField tfpn1;
	private JTextField tffn;
	private JButton btns;
	private JLabel lblNewLabel_13_1;
	private JTextField tfpn2;
	private JButton btnin;
	private JButton btnup;
	private JButton btndel;
	private JLabel lblNewLabel_7_1_1;
	private JTextField tfmemo;
	private JLabel lblNewLabel_14_1;
	private JTextField tfnum;
	private JSplitPane detail;
	private JScrollPane split;
	private JPanel panel_2;
	private JLabel lblNewLabel;
	private JComboBox cbsf;
	private JButton tbns2;
	private JLabel lblNewLabel_1;
	private JTextField tfspn;
	private JTable table;
	
	PatientDBA pd = new PatientDBA();
	ArrayList<PatientInfo> arr;
	int num;
	String[][] RofF = {{"병실선택"},{"101호","102호","103호","105호","106호"},{"201호","202호","203호","205호","206호"},{"301호","302호","303호","305호","306호"},{"501호","502호","503호","505호","506호"},{"601호","602호","603호","605호","606호"}};
	
	//메인메소드
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HsysView frame = new HsysView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//전체 창
	public HsysView() {
		setTitle("Hospital");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1054, 791);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getHosp(), BorderLayout.CENTER);
	}

	//맨 위 탭 목록
	private JTabbedPane getHosp() {
		if (hosp == null) {
			hosp = new JTabbedPane(JTabbedPane.TOP);
			//첫번쨰 탭
			hosp.addTab("Hospital Main", null, getPanel_1(), null);
			//두번째 탭
			hosp.addTab("환자 등록", null, getSplitPane(), null);
			//세번째 탭
			hosp.addTab("환자 상세", null, getDetail(), null);
		}
		return hosp;
	}
	
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
		}
		return panel_1;
	}
	
	//창 나누기
	private JSplitPane getSplitPane() {
		if (splitPane == null) {
			splitPane = new JSplitPane();
			splitPane.setDividerSize(3);
			splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
			splitPane.setRightComponent(getScrollPane());
			splitPane.setLeftComponent(getPanel());
			splitPane.setDividerLocation(400);
		}
		return splitPane;
	}
	
	//스크롤 페이지로 창 설정
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			//테이블 삽입
			scrollPane.setViewportView(getIntable());
		}
		return scrollPane;
	}
	
	//입력 패널
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.add(getLblNewLabel2_1());
			panel.add(getTfpn());
			panel.add(getLblNewLabel_14());
			panel.add(getCbf());
			panel.add(getLblNewLabel_1_1());
			panel.add(getCbfr());
			panel.add(getLblNewLabel_2_1());
			panel.add(getLblNewLabel_3_1());
			panel.add(getLblNewLabel_4_1());
			panel.add(getCbg());
			panel.add(getTextField_1_1());
			panel.add(getTextField_2_1());
			panel.add(getLblNewLabel_5_1());
			panel.add(getTfdn());
			panel.add(getLblNewLabel_6_1());
			panel.add(getLblNewLabel_7_1());
			panel.add(getLblNewLabel_8_1());
			panel.add(getLblNewLabel_9_1());
			panel.add(getTfinday());
			panel.add(getTfppn());
			panel.add(getTffnum());
			panel.add(getTfnod());
			panel.add(getLblNewLabel_10_1());
			panel.add(getLblNewLabel_11_1());
			panel.add(getLblNewLabel_12_1());
			panel.add(getCbmd());
			panel.add(getTfpn1());
			panel.add(getTffn());
			panel.add(getBtns());
			panel.add(getLblNewLabel_13_1());
			panel.add(getTfpn2());
			panel.add(getBtnin_1_1());
			panel.add(getBtnin_1_1_1());
			panel.add(getBtnin_1_1_1_1());
			panel.add(getLblNewLabel_7_1_1());
			panel.add(getTfmemo());
			panel.add(getLblNewLabel_14_1());
			panel.add(getTfnum());
		}
		return panel;
	}
	
	//두번째 탭의 테이블
	private JTable getIntable() {
		if (intable == null) {
			intable = new JTable();
			intable.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					int i = intable.getSelectedRow();
					cbf.setSelectedItem(arr.get(i).getFloor());
					cbfr.setSelectedItem(arr.get(i).getFroom());
					cbg.setSelectedItem(arr.get(i).getGen());
					cbmd.setSelectedItem(arr.get(i).getMD());
					tfnum.setText(arr.get(i).getNum() + "");
					tfpn.setText(arr.get(i).getPname());
					tfa.setText(arr.get(i).getAge() + "");
					tfnod.setText(arr.get(i).getNoD());
					tfdn.setText(arr.get(i).getDName());
					tfinday.setText(arr.get(i).getDate());
					tfnod.setText(arr.get(i).getNoD());
					tfdn.setText(arr.get(i).getDName());
					tfpn1.setText(arr.get(i).getPnum1());
					tfpn2.setText(arr.get(i).getPnum2());
					tfppn.setText(arr.get(i).getPphone());
					tffn.setText(arr.get(i).getFname());
					tffnum.setText(arr.get(i).getFphone());
					tfadr.setText(arr.get(i).getAddress());
					tfmemo.setText(arr.get(i).getMemo());
					
					num = arr.get(i).getNum();
				}
			});
			
			String[] cols = {"No.", "병동", "병실", "환자 이름", "나이", "성별", "진료과", "병명", "주치의", "입원날짜", "생년월일", "환자 전화번호", "보호자", "보호자 전화번호", "환자 주소", "참고사항"};
			DefaultTableModel dt = new DefaultTableModel(cols, 0);
			intable.setModel(dt);
		}
		return intable;
	}
	
	private JLabel getLblNewLabel2_1() {
		if (lblNewLabel2_1 == null) {
			lblNewLabel2_1 = new JLabel("환자 이름");
			lblNewLabel2_1.setBounds(496, 25, 69, 19);
			lblNewLabel2_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel2_1.setFont(new Font("굴림", Font.PLAIN, 16));
		}
		return lblNewLabel2_1;
	}
	private JTextField getTfpn() {
		if (tfpn == null) {
			tfpn = new JTextField();
			tfpn.setHorizontalAlignment(SwingConstants.CENTER);
			tfpn.setBounds(570, 21, 141, 23);
			tfpn.setFont(new Font("굴림", Font.PLAIN, 14));
			tfpn.setColumns(10);
		}
		return tfpn;
	}
	private JLabel getLblNewLabel_14() {
		if (lblNewLabel_14 == null) {
			lblNewLabel_14 = new JLabel("병동");
			lblNewLabel_14.setBounds(156, 25, 32, 19);
			lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_14.setFont(new Font("굴림", Font.PLAIN, 16));
		}
		return lblNewLabel_14;
	}
	private JComboBox getCbf() {
		if (cbf == null) {
			cbf = new JComboBox();
			cbf.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cbfr.removeAllItems();
					for(int i=0; i<RofF[cbf.getSelectedIndex()].length; i++) {
						cbfr.addItem(RofF[cbf.getSelectedIndex()][i]);
					}
				}
			});
			cbf.setModel(new DefaultComboBoxModel(new String[] {"병동선택", "1병동", "2병동", "3병동", "5병동", "6병동"}));
			//건물이 여러개 있는 큰 병원 이라면
			//cbf.setModel(new DefaultComboBoxModel(new String[] {"병동선택", "A동", "B동", "C동", "D동"}));
			
			//병실콤보박스(cbfr)에는 밑에처럼 그냥 넣거나, 층콤보박스를 만들어서 층으로 분리해 준다.
			//cbfr.setModel(new DefaultComboBoxModel(new String[] {"병실선택", "101호", "102호", "103호", "105호", "106호", "107호", "108호", "109"호, "110호"
																			//,"201호", "202호", "203호", "205호", "206호", "207호", "208호", "209"호, "210호"
																			//,"301호", "302호", "303호", "305호", "306호", "307호", "308호", "309"호, "310호"
																			//,"501호", "502호", "453호", "505호", "506호", "507호", "508호", "509"호, "510호"
																			//,"601호", "602호", "603호", "605호", "606호", "607호", "608호", "609"호, "610호"
																			//,"701호", "702호", "703호", "705호", "706호", "707호", "708호", "709"호, "710호"
																			//,"801호", "802호", "803호", "805호", "806호", "807호", "808호", "809"호, "810호"
																			//,"901호", "902호", "903호", "905호", "906호", "907호", "908호", "909"호, "910호"
																			//,"1001호", "1002호", "1003호", "1005호", "1006호", "1007호", "1008호", "1009"호, "1010호"
																	//}));
			
			cbf.setBounds(193, 21, 85, 23);
			cbf.setFont(new Font("굴림", Font.PLAIN, 14));
		}
		return cbf;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("병실");
			lblNewLabel_1_1.setBounds(305, 25, 32, 19);
			lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 16));
		}
		return lblNewLabel_1_1;
	}
	private JComboBox getCbfr() {
		if (cbfr == null) {
			cbfr = new JComboBox();
			cbfr.addItem("선택하세요");
//			cbfr.setModel(new DefaultComboBoxModel(new String[] {"병실선택", "101호", "102호", "103호", "105호", "106호", "107호", "108호", "109"호, "110호"
																			//,"201호", "202호", "203호", "205호", "206호", "207호", "208호", "209"호, "210호"
																			//,"301호", "302호", "303호", "305호", "306호", "307호", "308호", "309"호, "310호"
																			//,"501호", "502호", "453호", "505호", "506호", "507호", "508호", "509"호, "510호"
																			//,"601호", "602호", "603호", "605호", "606호", "607호", "608호", "609"호, "610호"
																			//,"701호", "702호", "703호", "705호", "706호", "707호", "708호", "709"호, "710호"
																			//,"801호", "802호", "803호", "805호", "806호", "807호", "808호", "809"호, "810호"
																			//,"901호", "902호", "903호", "905호", "906호", "907호", "908호", "909"호, "910호"
																			//,"1001호", "1002호", "1003호", "1005호", "1006호", "1007호", "1008호", "1009"호, "1010호"
																			//}));
			cbfr.setBounds(347, 21, 96, 24);
			cbfr.setFont(new Font("굴림", Font.PLAIN, 14));
		}
		return cbfr;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("나이");
			lblNewLabel_2_1.setBounds(745, 25, 32, 19);
			lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2_1.setFont(new Font("굴림", Font.PLAIN, 16));
		}
		return lblNewLabel_2_1;
	}
	private JLabel getLblNewLabel_3_1() {
		if (lblNewLabel_3_1 == null) {
			lblNewLabel_3_1 = new JLabel("성별");
			lblNewLabel_3_1.setBounds(896, 25, 32, 19);
			lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3_1.setFont(new Font("굴림", Font.PLAIN, 16));
		}
		return lblNewLabel_3_1;
	}
	private JLabel getLblNewLabel_4_1() {
		if (lblNewLabel_4_1 == null) {
			lblNewLabel_4_1 = new JLabel("주민등록번호");
			lblNewLabel_4_1.setBounds(358, 123, 96, 19);
			lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_4_1.setFont(new Font("굴림", Font.PLAIN, 16));
		}
		return lblNewLabel_4_1;
	}
	private JComboBox getCbg() {
		if (cbg == null) {
			cbg = new JComboBox();
			cbg.setModel(new DefaultComboBoxModel(new String[] {"선택", "남", "여"}));
			cbg.setBounds(935, 22, 62, 23);
			cbg.setFont(new Font("굴림", Font.PLAIN, 14));
		}
		return cbg;
	}
	private JTextField getTextField_1_1() {
		if (tfa == null) {
			tfa = new JTextField();
			tfa.setHorizontalAlignment(SwingConstants.CENTER);
			tfa.setBounds(780, 22, 69, 21);
			tfa.setColumns(10);
		}
		return tfa;
	}
	private JTextField getTextField_2_1() {
		if (tfadr == null) {
			tfadr = new JTextField();
			tfadr.setFont(new Font("굴림", Font.PLAIN, 14));
			tfadr.setBounds(93, 231, 904, 27);
			tfadr.setColumns(10);
		}
		return tfadr;
	}
	private JLabel getLblNewLabel_5_1() {
		if (lblNewLabel_5_1 == null) {
			lblNewLabel_5_1 = new JLabel("-");
			lblNewLabel_5_1.setBounds(596, 122, 19, 23);
			lblNewLabel_5_1.setHorizontalTextPosition(SwingConstants.CENTER);
			lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5_1.setFont(new Font("굴림", Font.PLAIN, 30));
		}
		return lblNewLabel_5_1;
	}
	private JTextField getTfdn() {
		if (tfdn == null) {
			tfdn = new JTextField();
			tfdn.setHorizontalAlignment(SwingConstants.CENTER);
			tfdn.setBounds(810, 70, 136, 25);
			tfdn.setFont(new Font("굴림", Font.PLAIN, 16));
			tfdn.setColumns(10);
		}
		return tfdn;
	}
	private JLabel getLblNewLabel_6_1() {
		if (lblNewLabel_6_1 == null) {
			lblNewLabel_6_1 = new JLabel("환자 전화번호");
			lblNewLabel_6_1.setBounds(18, 178, 101, 19);
			lblNewLabel_6_1.setHorizontalTextPosition(SwingConstants.CENTER);
			lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_6_1.setFont(new Font("굴림", Font.PLAIN, 16));
		}
		return lblNewLabel_6_1;
	}
	private JLabel getLblNewLabel_7_1() {
		if (lblNewLabel_7_1 == null) {
			lblNewLabel_7_1 = new JLabel("환자 주소");
			lblNewLabel_7_1.setBounds(18, 236, 69, 19);
			lblNewLabel_7_1.setHorizontalTextPosition(SwingConstants.CENTER);
			lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_7_1.setFont(new Font("굴림", Font.PLAIN, 16));
		}
		return lblNewLabel_7_1;
	}
	private JLabel getLblNewLabel_8_1() {
		if (lblNewLabel_8_1 == null) {
			lblNewLabel_8_1 = new JLabel("보호자 이름");
			lblNewLabel_8_1.setBounds(374, 179, 85, 19);
			lblNewLabel_8_1.setHorizontalTextPosition(SwingConstants.CENTER);
			lblNewLabel_8_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_8_1.setFont(new Font("굴림", Font.PLAIN, 16));
		}
		return lblNewLabel_8_1;
	}
	private JLabel getLblNewLabel_9_1() {
		if (lblNewLabel_9_1 == null) {
			lblNewLabel_9_1 = new JLabel("보호자 전화번호");
			lblNewLabel_9_1.setBounds(642, 177, 117, 19);
			lblNewLabel_9_1.setHorizontalTextPosition(SwingConstants.CENTER);
			lblNewLabel_9_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_9_1.setFont(new Font("굴림", Font.PLAIN, 16));
		}
		return lblNewLabel_9_1;
	}
	private JTextField getTfinday() {
		if (tfinday == null) {
			tfinday = new JTextField();
			tfinday.setHorizontalAlignment(SwingConstants.CENTER);
			tfinday.setBounds(90, 122, 151, 23);
			tfinday.setColumns(10);
		}
		return tfinday;
	}
	private JTextField getTfppn() {
		if (tfppn == null) {
			tfppn = new JTextField();
			tfppn.setHorizontalAlignment(SwingConstants.CENTER);
			tfppn.setBounds(122, 174, 228, 25);
			tfppn.setFont(new Font("굴림", Font.PLAIN, 16));
			tfppn.setColumns(10);
		}
		return tfppn;
	}
	private JTextField getTffnum() {
		if (tffnum == null) {
			tffnum = new JTextField();
			tffnum.setHorizontalAlignment(SwingConstants.CENTER);
			tffnum.setBounds(766, 174, 228, 25);
			tffnum.setFont(new Font("굴림", Font.PLAIN, 16));
			tffnum.setColumns(10);
		}
		return tffnum;
	}
	private JTextField getTfnod() {
		if (tfnod == null) {
			tfnod = new JTextField();
			tfnod.setBounds(244, 70, 467, 25);
			tfnod.setFont(new Font("굴림", Font.PLAIN, 16));
			tfnod.setColumns(10);
		}
		return tfnod;
	}
	private JLabel getLblNewLabel_10_1() {
		if (lblNewLabel_10_1 == null) {
			lblNewLabel_10_1 = new JLabel("진료과");
			lblNewLabel_10_1.setBounds(18, 75, 48, 19);
			lblNewLabel_10_1.setHorizontalTextPosition(SwingConstants.CENTER);
			lblNewLabel_10_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_10_1.setFont(new Font("굴림", Font.PLAIN, 16));
		}
		return lblNewLabel_10_1;
	}
	private JLabel getLblNewLabel_11_1() {
		if (lblNewLabel_11_1 == null) {
			lblNewLabel_11_1 = new JLabel("주치의");
			lblNewLabel_11_1.setBounds(758, 75, 48, 19);
			lblNewLabel_11_1.setHorizontalTextPosition(SwingConstants.CENTER);
			lblNewLabel_11_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_11_1.setFont(new Font("굴림", Font.PLAIN, 16));
		}
		return lblNewLabel_11_1;
	}
	private JLabel getLblNewLabel_12_1() {
		if (lblNewLabel_12_1 == null) {
			lblNewLabel_12_1 = new JLabel("병명");
			lblNewLabel_12_1.setBounds(209, 75, 32, 19);
			lblNewLabel_12_1.setHorizontalTextPosition(SwingConstants.CENTER);
			lblNewLabel_12_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_12_1.setFont(new Font("굴림", Font.PLAIN, 16));
		}
		return lblNewLabel_12_1;
	}
	private JComboBox getCbmd() {
		if (cbmd == null) {
			cbmd = new JComboBox();
			cbmd.setModel(new DefaultComboBoxModel(new String[] {"진료과 선택", "내과", "외과", "가정의학과", "한방과", "신경과", "비뇨기과", "산부인과", "응급의학과", "이비인후과", "재활의학과", "안과", "치과", "피부과"}));
			cbmd.setBounds(70, 70, 116, 25);
			cbmd.setFont(new Font("굴림", Font.PLAIN, 14));
		}
		return cbmd;
	}
	private JTextField getTfpn1() {
		if (tfpn1 == null) {
			tfpn1 = new JTextField();
			tfpn1.setBounds(456, 118, 136, 25);
			tfpn1.setHorizontalAlignment(SwingConstants.CENTER);
			tfpn1.setFont(new Font("굴림", Font.PLAIN, 16));
			tfpn1.setColumns(10);
		}
		return tfpn1;
	}
	private JTextField getTffn() {
		if (tffn == null) {
			tffn = new JTextField();
			tffn.setBounds(471, 175, 144, 23);
			tffn.setHorizontalAlignment(SwingConstants.CENTER);
			tffn.setColumns(10);
		}
		return tffn;
	}
	
	//조회 버튼
	private JButton getBtns() {
		if (btns == null) {
			btns = new JButton("조회");
			btns.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//					taview.setText("");
					arr = pd.PatientSelectAll();
					String[] cols = {"No.", "병동", "병실", "환자 이름", "나이", "성별", "진료과", "병명", "주치의", "입원날짜", "생년월일", "환자 전화번호", "보호자", "보호자 전화번호", "환자 주소", "참고사항"};
					DefaultTableModel dt = new DefaultTableModel(cols, arr.size());
					intable.setModel(dt);
					for(int i=0; i<arr.size(); i++) {
						dt.setValueAt(arr.get(i).getNum(), i, 0);
						dt.setValueAt(arr.get(i).getFloor(), i, 1);
						dt.setValueAt(arr.get(i).getFroom(), i, 2);
						dt.setValueAt(arr.get(i).getPname(), i, 3);
						dt.setValueAt(arr.get(i).getAge(), i, 4);
						dt.setValueAt(arr.get(i).getGen(), i, 5);
						dt.setValueAt(arr.get(i).getMD(), i, 6);
						dt.setValueAt(arr.get(i).getNoD(), i, 7);
						dt.setValueAt(arr.get(i).getDName(), i, 8);
						dt.setValueAt(arr.get(i).getDate(), i, 9);
						dt.setValueAt(arr.get(i).getPnum1(), i, 10);
						dt.setValueAt(arr.get(i).getPphone(), i, 11);
						dt.setValueAt(arr.get(i).getFname(), i, 12);
						dt.setValueAt(arr.get(i).getFphone(), i, 13);
						dt.setValueAt(arr.get(i).getAddress(), i, 14);
						dt.setValueAt(arr.get(i).getMemo(), i, 15);
					}
				}
			});
			btns.setBounds(139, 350, 85, 27);
			btns.setHorizontalTextPosition(SwingConstants.CENTER);
			btns.setFont(new Font("굴림", Font.PLAIN, 16));
		}
		return btns;
	}
	
	private JLabel getLblNewLabel_13_1() {
		if (lblNewLabel_13_1 == null) {
			lblNewLabel_13_1 = new JLabel("입원날짜");
			lblNewLabel_13_1.setBounds(18, 125, 64, 19);
			lblNewLabel_13_1.setHorizontalTextPosition(SwingConstants.CENTER);
			lblNewLabel_13_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_13_1.setFont(new Font("굴림", Font.PLAIN, 16));
		}
		return lblNewLabel_13_1;
	}
	private JTextField getTfpn2() {
		if (tfpn2 == null) {
			tfpn2 = new JTextField();
			tfpn2.setHorizontalAlignment(SwingConstants.CENTER);
			tfpn2.setBounds(619, 118, 136, 25);
			tfpn2.setFont(new Font("굴림", Font.PLAIN, 16));
			tfpn2.setColumns(10);
		}
		return tfpn2;
	}
	
	//등록버튼
	private JButton getBtnin_1_1() {
		if (btnin == null) {
			btnin = new JButton("등록");
			btnin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					PatientInfo p = new PatientInfo();
					p.setFloor((String)cbf.getSelectedItem());
					if(cbf.getSelectedIndex()==0) {
						JOptionPane.showMessageDialog(null, "병동을 선택하세요.");
						return;
					}
					p.setFroom((String)cbfr.getSelectedItem());
					if(cbfr.getSelectedIndex()==0 ) {
						JOptionPane.showMessageDialog(null, "병실을 선택하세요.");
						return;
					}
					p.setPname(tfpn.getText());
					p.setAge(Integer.parseInt(tfa.getText()));
					p.setGen((String)cbg.getSelectedItem());
					if(cbg.getSelectedIndex()==0 ) {
						JOptionPane.showMessageDialog(null, "성별을 선택하세요.");
						return;
					}
					p.setMD((String)cbmd.getSelectedItem());
					if(cbmd.getSelectedIndex()==0 ) {
						JOptionPane.showMessageDialog(null, "진료과를 선택하세요.");
						return;
					}
					p.setNoD(tfnod.getText());
					p.setDName(tfdn.getText());
					p.setDate(tfinday.getText());
					p.setPnum1(tfpn1.getText());
					p.setPnum2(tfpn2.getText());
					p.setPphone(tfppn.getText());
					p.setFname(tffn.getText());
					p.setFphone(tffnum.getText());
					p.setAddress(tfadr.getText());
					p.setMemo(tfmemo.getText());
					
					pd.insert(p);
					clear();
					JOptionPane.showMessageDialog(null, "등록이 완료되었습니다");
				}
			});
			btnin.setHorizontalTextPosition(SwingConstants.CENTER);
			btnin.setFont(new Font("굴림", Font.PLAIN, 16));
			btnin.setBounds(360, 350, 85, 27);
		}
		return btnin;
	}
	
	//수정 버튼
	private JButton getBtnin_1_1_1() {
		if (btnup == null) {
			btnup = new JButton("정보 수정");
			btnup.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(num==0) { //선택된 행이 없음
						JOptionPane.showMessageDialog(null, "환자를 선택하세요.");
						return;
					}
					PatientInfo p = new PatientInfo();
					p.setNum(Integer.parseInt(tfnum.getText()));
					p.setFloor((String)cbf.getSelectedItem());
					if(cbf.getSelectedIndex()==0) {
						JOptionPane.showMessageDialog(null, "병동을 선택하세요.");
						return;
					}
					p.setFroom((String)cbfr.getSelectedItem());
					if(cbfr.getSelectedIndex()==0 ) {
						JOptionPane.showMessageDialog(null, "병실을 선택하세요.");
						return;
					}
					p.setPname(tfpn.getText());
					p.setAge(Integer.parseInt(tfa.getText()));
					p.setGen((String)cbg.getSelectedItem());
					if(cbg.getSelectedIndex()==0 ) {
						JOptionPane.showMessageDialog(null, "성별을 선택하세요.");
						return;
					}
					p.setMD((String)cbmd.getSelectedItem());
					if(cbmd.getSelectedIndex()==0 ) {
						JOptionPane.showMessageDialog(null, "진료과를 선택하세요.");
						return;
					}
					p.setNoD(tfnod.getText());
					p.setDName(tfdn.getText());
					p.setDate(tfinday.getText());
					p.setPnum1(tfpn1.getText());
					p.setPnum2(tfpn2.getText());
					p.setPphone(tfppn.getText());
					p.setFname(tffn.getText());
					p.setFphone(tffnum.getText());
					p.setAddress(tfadr.getText());
					p.setMemo(tfmemo.getText());
					
					if(JOptionPane.showConfirmDialog(null, "정말 수정할까요?", "수정", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.CANCEL_OPTION) {
						return;
					}
					
					pd.PatientUpdate(p);
					clear();
					JOptionPane.showMessageDialog(null, "수정이 완료되었습니다");
					
				}
			});
			btnup.setHorizontalTextPosition(SwingConstants.CENTER);
			btnup.setFont(new Font("굴림", Font.PLAIN, 14));
			btnup.setBounds(570, 350, 96, 27);
		}
		return btnup;
	}
	
	//삭제버튼
	private JButton getBtnin_1_1_1_1() {
		if (btndel == null) {
			btndel = new JButton("삭제");
			btndel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(num==0) { //선택된 행이 없음
						JOptionPane.showMessageDialog(null, "삭제할 번호를 선택하세요.");
						return;
					}
					if(JOptionPane.showConfirmDialog(null, "정말 삭제할까요?", "삭제", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.CANCEL_OPTION) {
						return;
					}
					pd.patientDelete(num);
					clear();
					JOptionPane.showMessageDialog(null, "삭제되었습니다!");	
				}
			});
			btndel.setHorizontalTextPosition(SwingConstants.CENTER);
			btndel.setFont(new Font("굴림", Font.PLAIN, 16));
			btndel.setBounds(802, 350, 85, 27);
		}
		return btndel;
	}
	private JLabel getLblNewLabel_7_1_1() {
		if (lblNewLabel_7_1_1 == null) {
			lblNewLabel_7_1_1 = new JLabel("참고사항");
			lblNewLabel_7_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
			lblNewLabel_7_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_7_1_1.setFont(new Font("굴림", Font.PLAIN, 16));
			lblNewLabel_7_1_1.setBounds(18, 294, 69, 19);
		}
		return lblNewLabel_7_1_1;
	}
	private JTextField getTfmemo() {
		if (tfmemo == null) {
			tfmemo = new JTextField();
			tfmemo.setFont(new Font("굴림", Font.PLAIN, 14));
			tfmemo.setBounds(93, 288, 904, 27);
			tfmemo.setColumns(10);
		}
		return tfmemo;
	}
	private JLabel getLblNewLabel_14_1() {
		if (lblNewLabel_14_1 == null) {
			lblNewLabel_14_1 = new JLabel("No.");
			lblNewLabel_14_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_14_1.setFont(new Font("굴림", Font.PLAIN, 16));
			lblNewLabel_14_1.setBounds(18, 25, 32, 19);
		}
		return lblNewLabel_14_1;
	}
	private JTextField getTfnum() {
		if (tfnum == null) {
			tfnum = new JTextField();
			tfnum.setHorizontalAlignment(SwingConstants.CENTER);
			tfnum.setColumns(10);
			tfnum.setBounds(50, 22, 69, 21);
			tfnum.setEnabled(false);
		}
		return tfnum;
	}
	
	//세번째 탭 환자 상세검색
	private JSplitPane getDetail() {
		if (detail == null) {
			detail = new JSplitPane();
			detail.setDividerSize(3);
			//아래위로 나누기
			detail.setOrientation(JSplitPane.VERTICAL_SPLIT);
			detail.setRightComponent(getSplit());
			detail.setLeftComponent(getPanel_2());
			detail.setDividerLocation(150);
		}
		return detail;
	}
	//스크롤패널
	private JScrollPane getSplit() {
		if (split == null) {
			split = new JScrollPane();
			split.setViewportView(getTable());
		}
		return split;
	}

	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setLayout(null);
			panel_2.add(getLblNewLabel());
			panel_2.add(getCbsf());
			panel_2.add(getTbns2());
			panel_2.add(getLblNewLabel_1());
			panel_2.add(getTfspn());
		}
		return panel_2;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("병동");
			lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 16));
			lblNewLabel.setBounds(102, 60, 42, 23);
		}
		return lblNewLabel;
	}
	private JComboBox getCbsf() {
		if (cbsf == null) {
			cbsf = new JComboBox();
			cbsf.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//					searchMethod();
				}
			});
			cbsf.setModel(new DefaultComboBoxModel(new String[] {"선택하세요", "1병동", "2병동", "3병동", "5병동", "6병동"}));
			cbsf.setBounds(156, 58, 125, 24);
		}
		return cbsf;
	}
	
	//세번째 탭의 검색기능
	private JButton getTbns2() {
		if (tbns2 == null) {
			tbns2 = new JButton("검색");
			tbns2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//					String field = (String)cbsf.getSelectedItem();
//					String word = tfspn.getText();
//					if(field.equals("선택하세요") && word.equals("")) {
//						JOptionPane.showMessageDialog(null, "검색 항목을 입력하세요");
//						return;
//					}
//					ArrayList<PatientInfo> sarr = pd.PatientSearch(field, word);
//					String[] cols = {"No.", "병동", "병실", "환자 이름", "나이", "성별", "진료과", "병명", "주치의", "입원날짜", "참고사항"};
//					DefaultTableModel dt1 = new DefaultTableModel(cols, sarr.size());
//					table.setModel(dt1);
//					for(int i=0; i<sarr.size(); i++) {
//						dt1.setValueAt(sarr.get(i).getNum(), i, 0);
//						dt1.setValueAt(sarr.get(i).getFloor(), i, 1);
//						dt1.setValueAt(sarr.get(i).getFroom(), i, 2);
//						dt1.setValueAt(sarr.get(i).getPname(), i, 3);
//						dt1.setValueAt(sarr.get(i).getAge(), i, 4);
//						dt1.setValueAt(sarr.get(i).getGen(), i, 5);
//						dt1.setValueAt(sarr.get(i).getMD(), i, 6);
//						dt1.setValueAt(sarr.get(i).getNoD(), i, 7);
//						dt1.setValueAt(sarr.get(i).getDName(), i, 8);
//						dt1.setValueAt(sarr.get(i).getDate(), i, 9);
//						dt1.setValueAt(sarr.get(i).getMemo(), i, 10);
//					}
//					//검색을 했는데 검색된 데이터가 없으면(테이블에 행이 없는 경우) 환자가 존재하지 않습니다. 띄우기
//					
//					cbsf.setSelectedIndex(0);
//					tfspn.setText("");
					
					searchMethod();
				}
			});
			tbns2.setFont(new Font("굴림", Font.PLAIN, 14));
			tbns2.setBounds(810, 54, 97, 29);

		}
		return tbns2;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("이름");
			lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 16));
			lblNewLabel_1.setBounds(408, 56, 48, 27);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfspn() {
		if (tfspn == null) {
			tfspn = new JTextField();
			tfspn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					searchMethod();
				}
			});
			tfspn.setBounds(461, 56, 209, 25);
			tfspn.setColumns(10);
		}
		return tfspn;
	}

	//상세검색 결과 테이블
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
		}
		String[] cols = {"No.", "병동", "병실", "환자 이름", "나이", "성별", "진료과", "병명", "주치의", "입원날짜", "참고사항"};
		DefaultTableModel dt1 = new DefaultTableModel(cols, 0);
		table.setModel(dt1);
		return table;
	}
	
	//tf, cb 값 초기화 메소드
	public void clear() {
		tfnum.setText("");
		cbf.setSelectedIndex(0);
		cbfr.setSelectedIndex(0);
		tfpn.setText("");
		tfa.setText("");
		cbg.setSelectedIndex(0);
		cbmd.setSelectedIndex(0);
		tfnod.setText("");
		tfdn.setText("");
		tfinday.setText("");
		tfpn1.setText("");
		tfpn2.setText("");
		tfppn.setText("");
		tffn.setText("");
		tffnum.setText("");
		tfadr.setText("");
		tfmemo.setText("");
		btns.doClick();
	}
	
	private void searchMethod() {
		String field = (String)cbsf.getSelectedItem();
		String word = tfspn.getText();
		if(field.equals("선택하세요") && word.equals("")) {
			JOptionPane.showMessageDialog(null, "검색 항목을 입력하세요");
			return;
		}
		ArrayList<PatientInfo> sarr = pd.PatientSearch(field, word);
		String[] cols = {"No.", "병동", "병실", "환자 이름", "나이", "성별", "진료과", "병명", "주치의", "입원날짜", "참고사항"};
		DefaultTableModel dt1 = new DefaultTableModel(cols, sarr.size());
		table.setModel(dt1);
		for(int i=0; i<sarr.size(); i++) {
			dt1.setValueAt(sarr.get(i).getNum(), i, 0);
			dt1.setValueAt(sarr.get(i).getFloor(), i, 1);
			dt1.setValueAt(sarr.get(i).getFroom(), i, 2);
			dt1.setValueAt(sarr.get(i).getPname(), i, 3);
			dt1.setValueAt(sarr.get(i).getAge(), i, 4);
			dt1.setValueAt(sarr.get(i).getGen(), i, 5);
			dt1.setValueAt(sarr.get(i).getMD(), i, 6);
			dt1.setValueAt(sarr.get(i).getNoD(), i, 7);
			dt1.setValueAt(sarr.get(i).getDName(), i, 8);
			dt1.setValueAt(sarr.get(i).getDate(), i, 9);
			dt1.setValueAt(sarr.get(i).getMemo(), i, 10);
		}
		cbsf.setSelectedIndex(0);
		tfspn.setText("");
	}
}
