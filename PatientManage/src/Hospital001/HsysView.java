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
	String[][] RofF = {{"????????????"},{"101???","102???","103???","105???","106???"},{"201???","202???","203???","205???","206???"},{"301???","302???","303???","305???","306???"},{"501???","502???","503???","505???","506???"},{"601???","602???","603???","605???","606???"}};
	
	//???????????????
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
	
	//?????? ???
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

	//??? ??? ??? ??????
	private JTabbedPane getHosp() {
		if (hosp == null) {
			hosp = new JTabbedPane(JTabbedPane.TOP);
			//????????? ???
			hosp.addTab("Hospital Main", null, getPanel_1(), null);
			//????????? ???
			hosp.addTab("?????? ??????", null, getSplitPane(), null);
			//????????? ???
			hosp.addTab("?????? ??????", null, getDetail(), null);
		}
		return hosp;
	}
	
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
		}
		return panel_1;
	}
	
	//??? ?????????
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
	
	//????????? ???????????? ??? ??????
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			//????????? ??????
			scrollPane.setViewportView(getIntable());
		}
		return scrollPane;
	}
	
	//?????? ??????
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
	
	//????????? ?????? ?????????
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
			
			String[] cols = {"No.", "??????", "??????", "?????? ??????", "??????", "??????", "?????????", "??????", "?????????", "????????????", "????????????", "?????? ????????????", "?????????", "????????? ????????????", "?????? ??????", "????????????"};
			DefaultTableModel dt = new DefaultTableModel(cols, 0);
			intable.setModel(dt);
		}
		return intable;
	}
	
	private JLabel getLblNewLabel2_1() {
		if (lblNewLabel2_1 == null) {
			lblNewLabel2_1 = new JLabel("?????? ??????");
			lblNewLabel2_1.setBounds(496, 25, 69, 19);
			lblNewLabel2_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel2_1.setFont(new Font("??????", Font.PLAIN, 16));
		}
		return lblNewLabel2_1;
	}
	private JTextField getTfpn() {
		if (tfpn == null) {
			tfpn = new JTextField();
			tfpn.setHorizontalAlignment(SwingConstants.CENTER);
			tfpn.setBounds(570, 21, 141, 23);
			tfpn.setFont(new Font("??????", Font.PLAIN, 14));
			tfpn.setColumns(10);
		}
		return tfpn;
	}
	private JLabel getLblNewLabel_14() {
		if (lblNewLabel_14 == null) {
			lblNewLabel_14 = new JLabel("??????");
			lblNewLabel_14.setBounds(156, 25, 32, 19);
			lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_14.setFont(new Font("??????", Font.PLAIN, 16));
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
			cbf.setModel(new DefaultComboBoxModel(new String[] {"????????????", "1??????", "2??????", "3??????", "5??????", "6??????"}));
			//????????? ????????? ?????? ??? ?????? ?????????
			//cbf.setModel(new DefaultComboBoxModel(new String[] {"????????????", "A???", "B???", "C???", "D???"}));
			
			//??????????????????(cbfr)?????? ???????????? ?????? ?????????, ?????????????????? ???????????? ????????? ????????? ??????.
			//cbfr.setModel(new DefaultComboBoxModel(new String[] {"????????????", "101???", "102???", "103???", "105???", "106???", "107???", "108???", "109"???, "110???"
																			//,"201???", "202???", "203???", "205???", "206???", "207???", "208???", "209"???, "210???"
																			//,"301???", "302???", "303???", "305???", "306???", "307???", "308???", "309"???, "310???"
																			//,"501???", "502???", "453???", "505???", "506???", "507???", "508???", "509"???, "510???"
																			//,"601???", "602???", "603???", "605???", "606???", "607???", "608???", "609"???, "610???"
																			//,"701???", "702???", "703???", "705???", "706???", "707???", "708???", "709"???, "710???"
																			//,"801???", "802???", "803???", "805???", "806???", "807???", "808???", "809"???, "810???"
																			//,"901???", "902???", "903???", "905???", "906???", "907???", "908???", "909"???, "910???"
																			//,"1001???", "1002???", "1003???", "1005???", "1006???", "1007???", "1008???", "1009"???, "1010???"
																	//}));
			
			cbf.setBounds(193, 21, 85, 23);
			cbf.setFont(new Font("??????", Font.PLAIN, 14));
		}
		return cbf;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("??????");
			lblNewLabel_1_1.setBounds(305, 25, 32, 19);
			lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1.setFont(new Font("??????", Font.PLAIN, 16));
		}
		return lblNewLabel_1_1;
	}
	private JComboBox getCbfr() {
		if (cbfr == null) {
			cbfr = new JComboBox();
			cbfr.addItem("???????????????");
//			cbfr.setModel(new DefaultComboBoxModel(new String[] {"????????????", "101???", "102???", "103???", "105???", "106???", "107???", "108???", "109"???, "110???"
																			//,"201???", "202???", "203???", "205???", "206???", "207???", "208???", "209"???, "210???"
																			//,"301???", "302???", "303???", "305???", "306???", "307???", "308???", "309"???, "310???"
																			//,"501???", "502???", "453???", "505???", "506???", "507???", "508???", "509"???, "510???"
																			//,"601???", "602???", "603???", "605???", "606???", "607???", "608???", "609"???, "610???"
																			//,"701???", "702???", "703???", "705???", "706???", "707???", "708???", "709"???, "710???"
																			//,"801???", "802???", "803???", "805???", "806???", "807???", "808???", "809"???, "810???"
																			//,"901???", "902???", "903???", "905???", "906???", "907???", "908???", "909"???, "910???"
																			//,"1001???", "1002???", "1003???", "1005???", "1006???", "1007???", "1008???", "1009"???, "1010???"
																			//}));
			cbfr.setBounds(347, 21, 96, 24);
			cbfr.setFont(new Font("??????", Font.PLAIN, 14));
		}
		return cbfr;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("??????");
			lblNewLabel_2_1.setBounds(745, 25, 32, 19);
			lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2_1.setFont(new Font("??????", Font.PLAIN, 16));
		}
		return lblNewLabel_2_1;
	}
	private JLabel getLblNewLabel_3_1() {
		if (lblNewLabel_3_1 == null) {
			lblNewLabel_3_1 = new JLabel("??????");
			lblNewLabel_3_1.setBounds(896, 25, 32, 19);
			lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3_1.setFont(new Font("??????", Font.PLAIN, 16));
		}
		return lblNewLabel_3_1;
	}
	private JLabel getLblNewLabel_4_1() {
		if (lblNewLabel_4_1 == null) {
			lblNewLabel_4_1 = new JLabel("??????????????????");
			lblNewLabel_4_1.setBounds(358, 123, 96, 19);
			lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_4_1.setFont(new Font("??????", Font.PLAIN, 16));
		}
		return lblNewLabel_4_1;
	}
	private JComboBox getCbg() {
		if (cbg == null) {
			cbg = new JComboBox();
			cbg.setModel(new DefaultComboBoxModel(new String[] {"??????", "???", "???"}));
			cbg.setBounds(935, 22, 62, 23);
			cbg.setFont(new Font("??????", Font.PLAIN, 14));
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
			tfadr.setFont(new Font("??????", Font.PLAIN, 14));
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
			lblNewLabel_5_1.setFont(new Font("??????", Font.PLAIN, 30));
		}
		return lblNewLabel_5_1;
	}
	private JTextField getTfdn() {
		if (tfdn == null) {
			tfdn = new JTextField();
			tfdn.setHorizontalAlignment(SwingConstants.CENTER);
			tfdn.setBounds(810, 70, 136, 25);
			tfdn.setFont(new Font("??????", Font.PLAIN, 16));
			tfdn.setColumns(10);
		}
		return tfdn;
	}
	private JLabel getLblNewLabel_6_1() {
		if (lblNewLabel_6_1 == null) {
			lblNewLabel_6_1 = new JLabel("?????? ????????????");
			lblNewLabel_6_1.setBounds(18, 178, 101, 19);
			lblNewLabel_6_1.setHorizontalTextPosition(SwingConstants.CENTER);
			lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_6_1.setFont(new Font("??????", Font.PLAIN, 16));
		}
		return lblNewLabel_6_1;
	}
	private JLabel getLblNewLabel_7_1() {
		if (lblNewLabel_7_1 == null) {
			lblNewLabel_7_1 = new JLabel("?????? ??????");
			lblNewLabel_7_1.setBounds(18, 236, 69, 19);
			lblNewLabel_7_1.setHorizontalTextPosition(SwingConstants.CENTER);
			lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_7_1.setFont(new Font("??????", Font.PLAIN, 16));
		}
		return lblNewLabel_7_1;
	}
	private JLabel getLblNewLabel_8_1() {
		if (lblNewLabel_8_1 == null) {
			lblNewLabel_8_1 = new JLabel("????????? ??????");
			lblNewLabel_8_1.setBounds(374, 179, 85, 19);
			lblNewLabel_8_1.setHorizontalTextPosition(SwingConstants.CENTER);
			lblNewLabel_8_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_8_1.setFont(new Font("??????", Font.PLAIN, 16));
		}
		return lblNewLabel_8_1;
	}
	private JLabel getLblNewLabel_9_1() {
		if (lblNewLabel_9_1 == null) {
			lblNewLabel_9_1 = new JLabel("????????? ????????????");
			lblNewLabel_9_1.setBounds(642, 177, 117, 19);
			lblNewLabel_9_1.setHorizontalTextPosition(SwingConstants.CENTER);
			lblNewLabel_9_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_9_1.setFont(new Font("??????", Font.PLAIN, 16));
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
			tfppn.setFont(new Font("??????", Font.PLAIN, 16));
			tfppn.setColumns(10);
		}
		return tfppn;
	}
	private JTextField getTffnum() {
		if (tffnum == null) {
			tffnum = new JTextField();
			tffnum.setHorizontalAlignment(SwingConstants.CENTER);
			tffnum.setBounds(766, 174, 228, 25);
			tffnum.setFont(new Font("??????", Font.PLAIN, 16));
			tffnum.setColumns(10);
		}
		return tffnum;
	}
	private JTextField getTfnod() {
		if (tfnod == null) {
			tfnod = new JTextField();
			tfnod.setBounds(244, 70, 467, 25);
			tfnod.setFont(new Font("??????", Font.PLAIN, 16));
			tfnod.setColumns(10);
		}
		return tfnod;
	}
	private JLabel getLblNewLabel_10_1() {
		if (lblNewLabel_10_1 == null) {
			lblNewLabel_10_1 = new JLabel("?????????");
			lblNewLabel_10_1.setBounds(18, 75, 48, 19);
			lblNewLabel_10_1.setHorizontalTextPosition(SwingConstants.CENTER);
			lblNewLabel_10_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_10_1.setFont(new Font("??????", Font.PLAIN, 16));
		}
		return lblNewLabel_10_1;
	}
	private JLabel getLblNewLabel_11_1() {
		if (lblNewLabel_11_1 == null) {
			lblNewLabel_11_1 = new JLabel("?????????");
			lblNewLabel_11_1.setBounds(758, 75, 48, 19);
			lblNewLabel_11_1.setHorizontalTextPosition(SwingConstants.CENTER);
			lblNewLabel_11_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_11_1.setFont(new Font("??????", Font.PLAIN, 16));
		}
		return lblNewLabel_11_1;
	}
	private JLabel getLblNewLabel_12_1() {
		if (lblNewLabel_12_1 == null) {
			lblNewLabel_12_1 = new JLabel("??????");
			lblNewLabel_12_1.setBounds(209, 75, 32, 19);
			lblNewLabel_12_1.setHorizontalTextPosition(SwingConstants.CENTER);
			lblNewLabel_12_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_12_1.setFont(new Font("??????", Font.PLAIN, 16));
		}
		return lblNewLabel_12_1;
	}
	private JComboBox getCbmd() {
		if (cbmd == null) {
			cbmd = new JComboBox();
			cbmd.setModel(new DefaultComboBoxModel(new String[] {"????????? ??????", "??????", "??????", "???????????????", "?????????", "?????????", "????????????", "????????????", "???????????????", "???????????????", "???????????????", "??????", "??????", "?????????"}));
			cbmd.setBounds(70, 70, 116, 25);
			cbmd.setFont(new Font("??????", Font.PLAIN, 14));
		}
		return cbmd;
	}
	private JTextField getTfpn1() {
		if (tfpn1 == null) {
			tfpn1 = new JTextField();
			tfpn1.setBounds(456, 118, 136, 25);
			tfpn1.setHorizontalAlignment(SwingConstants.CENTER);
			tfpn1.setFont(new Font("??????", Font.PLAIN, 16));
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
	
	//?????? ??????
	private JButton getBtns() {
		if (btns == null) {
			btns = new JButton("??????");
			btns.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//					taview.setText("");
					arr = pd.PatientSelectAll();
					String[] cols = {"No.", "??????", "??????", "?????? ??????", "??????", "??????", "?????????", "??????", "?????????", "????????????", "????????????", "?????? ????????????", "?????????", "????????? ????????????", "?????? ??????", "????????????"};
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
			btns.setFont(new Font("??????", Font.PLAIN, 16));
		}
		return btns;
	}
	
	private JLabel getLblNewLabel_13_1() {
		if (lblNewLabel_13_1 == null) {
			lblNewLabel_13_1 = new JLabel("????????????");
			lblNewLabel_13_1.setBounds(18, 125, 64, 19);
			lblNewLabel_13_1.setHorizontalTextPosition(SwingConstants.CENTER);
			lblNewLabel_13_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_13_1.setFont(new Font("??????", Font.PLAIN, 16));
		}
		return lblNewLabel_13_1;
	}
	private JTextField getTfpn2() {
		if (tfpn2 == null) {
			tfpn2 = new JTextField();
			tfpn2.setHorizontalAlignment(SwingConstants.CENTER);
			tfpn2.setBounds(619, 118, 136, 25);
			tfpn2.setFont(new Font("??????", Font.PLAIN, 16));
			tfpn2.setColumns(10);
		}
		return tfpn2;
	}
	
	//????????????
	private JButton getBtnin_1_1() {
		if (btnin == null) {
			btnin = new JButton("??????");
			btnin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					PatientInfo p = new PatientInfo();
					p.setFloor((String)cbf.getSelectedItem());
					if(cbf.getSelectedIndex()==0) {
						JOptionPane.showMessageDialog(null, "????????? ???????????????.");
						return;
					}
					p.setFroom((String)cbfr.getSelectedItem());
					if(cbfr.getSelectedIndex()==0 ) {
						JOptionPane.showMessageDialog(null, "????????? ???????????????.");
						return;
					}
					p.setPname(tfpn.getText());
					p.setAge(Integer.parseInt(tfa.getText()));
					p.setGen((String)cbg.getSelectedItem());
					if(cbg.getSelectedIndex()==0 ) {
						JOptionPane.showMessageDialog(null, "????????? ???????????????.");
						return;
					}
					p.setMD((String)cbmd.getSelectedItem());
					if(cbmd.getSelectedIndex()==0 ) {
						JOptionPane.showMessageDialog(null, "???????????? ???????????????.");
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
					JOptionPane.showMessageDialog(null, "????????? ?????????????????????");
				}
			});
			btnin.setHorizontalTextPosition(SwingConstants.CENTER);
			btnin.setFont(new Font("??????", Font.PLAIN, 16));
			btnin.setBounds(360, 350, 85, 27);
		}
		return btnin;
	}
	
	//?????? ??????
	private JButton getBtnin_1_1_1() {
		if (btnup == null) {
			btnup = new JButton("?????? ??????");
			btnup.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(num==0) { //????????? ?????? ??????
						JOptionPane.showMessageDialog(null, "????????? ???????????????.");
						return;
					}
					PatientInfo p = new PatientInfo();
					p.setNum(Integer.parseInt(tfnum.getText()));
					p.setFloor((String)cbf.getSelectedItem());
					if(cbf.getSelectedIndex()==0) {
						JOptionPane.showMessageDialog(null, "????????? ???????????????.");
						return;
					}
					p.setFroom((String)cbfr.getSelectedItem());
					if(cbfr.getSelectedIndex()==0 ) {
						JOptionPane.showMessageDialog(null, "????????? ???????????????.");
						return;
					}
					p.setPname(tfpn.getText());
					p.setAge(Integer.parseInt(tfa.getText()));
					p.setGen((String)cbg.getSelectedItem());
					if(cbg.getSelectedIndex()==0 ) {
						JOptionPane.showMessageDialog(null, "????????? ???????????????.");
						return;
					}
					p.setMD((String)cbmd.getSelectedItem());
					if(cbmd.getSelectedIndex()==0 ) {
						JOptionPane.showMessageDialog(null, "???????????? ???????????????.");
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
					
					if(JOptionPane.showConfirmDialog(null, "?????? ????????????????", "??????", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.CANCEL_OPTION) {
						return;
					}
					
					pd.PatientUpdate(p);
					clear();
					JOptionPane.showMessageDialog(null, "????????? ?????????????????????");
					
				}
			});
			btnup.setHorizontalTextPosition(SwingConstants.CENTER);
			btnup.setFont(new Font("??????", Font.PLAIN, 14));
			btnup.setBounds(570, 350, 96, 27);
		}
		return btnup;
	}
	
	//????????????
	private JButton getBtnin_1_1_1_1() {
		if (btndel == null) {
			btndel = new JButton("??????");
			btndel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(num==0) { //????????? ?????? ??????
						JOptionPane.showMessageDialog(null, "????????? ????????? ???????????????.");
						return;
					}
					if(JOptionPane.showConfirmDialog(null, "?????? ????????????????", "??????", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.CANCEL_OPTION) {
						return;
					}
					pd.patientDelete(num);
					clear();
					JOptionPane.showMessageDialog(null, "?????????????????????!");	
				}
			});
			btndel.setHorizontalTextPosition(SwingConstants.CENTER);
			btndel.setFont(new Font("??????", Font.PLAIN, 16));
			btndel.setBounds(802, 350, 85, 27);
		}
		return btndel;
	}
	private JLabel getLblNewLabel_7_1_1() {
		if (lblNewLabel_7_1_1 == null) {
			lblNewLabel_7_1_1 = new JLabel("????????????");
			lblNewLabel_7_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
			lblNewLabel_7_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_7_1_1.setFont(new Font("??????", Font.PLAIN, 16));
			lblNewLabel_7_1_1.setBounds(18, 294, 69, 19);
		}
		return lblNewLabel_7_1_1;
	}
	private JTextField getTfmemo() {
		if (tfmemo == null) {
			tfmemo = new JTextField();
			tfmemo.setFont(new Font("??????", Font.PLAIN, 14));
			tfmemo.setBounds(93, 288, 904, 27);
			tfmemo.setColumns(10);
		}
		return tfmemo;
	}
	private JLabel getLblNewLabel_14_1() {
		if (lblNewLabel_14_1 == null) {
			lblNewLabel_14_1 = new JLabel("No.");
			lblNewLabel_14_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_14_1.setFont(new Font("??????", Font.PLAIN, 16));
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
	
	//????????? ??? ?????? ????????????
	private JSplitPane getDetail() {
		if (detail == null) {
			detail = new JSplitPane();
			detail.setDividerSize(3);
			//???????????? ?????????
			detail.setOrientation(JSplitPane.VERTICAL_SPLIT);
			detail.setRightComponent(getSplit());
			detail.setLeftComponent(getPanel_2());
			detail.setDividerLocation(150);
		}
		return detail;
	}
	//???????????????
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
			lblNewLabel = new JLabel("??????");
			lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("??????", Font.PLAIN, 16));
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
			cbsf.setModel(new DefaultComboBoxModel(new String[] {"???????????????", "1??????", "2??????", "3??????", "5??????", "6??????"}));
			cbsf.setBounds(156, 58, 125, 24);
		}
		return cbsf;
	}
	
	//????????? ?????? ????????????
	private JButton getTbns2() {
		if (tbns2 == null) {
			tbns2 = new JButton("??????");
			tbns2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//					String field = (String)cbsf.getSelectedItem();
//					String word = tfspn.getText();
//					if(field.equals("???????????????") && word.equals("")) {
//						JOptionPane.showMessageDialog(null, "?????? ????????? ???????????????");
//						return;
//					}
//					ArrayList<PatientInfo> sarr = pd.PatientSearch(field, word);
//					String[] cols = {"No.", "??????", "??????", "?????? ??????", "??????", "??????", "?????????", "??????", "?????????", "????????????", "????????????"};
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
//					//????????? ????????? ????????? ???????????? ?????????(???????????? ?????? ?????? ??????) ????????? ???????????? ????????????. ?????????
//					
//					cbsf.setSelectedIndex(0);
//					tfspn.setText("");
					
					searchMethod();
				}
			});
			tbns2.setFont(new Font("??????", Font.PLAIN, 14));
			tbns2.setBounds(810, 54, 97, 29);

		}
		return tbns2;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("??????");
			lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setFont(new Font("??????", Font.PLAIN, 16));
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

	//???????????? ?????? ?????????
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
		}
		String[] cols = {"No.", "??????", "??????", "?????? ??????", "??????", "??????", "?????????", "??????", "?????????", "????????????", "????????????"};
		DefaultTableModel dt1 = new DefaultTableModel(cols, 0);
		table.setModel(dt1);
		return table;
	}
	
	//tf, cb ??? ????????? ?????????
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
		if(field.equals("???????????????") && word.equals("")) {
			JOptionPane.showMessageDialog(null, "?????? ????????? ???????????????");
			return;
		}
		ArrayList<PatientInfo> sarr = pd.PatientSearch(field, word);
		String[] cols = {"No.", "??????", "??????", "?????? ??????", "??????", "??????", "?????????", "??????", "?????????", "????????????", "????????????"};
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
