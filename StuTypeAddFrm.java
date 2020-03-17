package hiai.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import hiai.dao.StuTypeDao;
import hiai.model.StuType;
import hiai.util.DbUtil;
import hiai.util.StringUtil;

public class StuTypeAddFrm extends JInternalFrame {
	private JTextField xinTxt;
	private JTextField xueTxt;
	private JTextField huanTxt;
	private JTextField lianTxt;
	private JTextField yuanTxt;
	private JTextField dangTxt;
	private JTextField yiTxt;
	private JTextArea qiTxt ;
	private DbUtil dbUtil=new DbUtil();
	private StuTypeDao stuTypeDao =new StuTypeDao() ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StuTypeAddFrm frame = new StuTypeAddFrm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StuTypeAddFrm() {
		setIconifiable(true);
		setTitle("\u5B66\u751F\u586B\u62A5");
		setBounds(100, 100, 450, 381);
		
		JLabel lblNewLabel = new JLabel("\u59D3\u540D\uFF1A");
		
		xinTxt = new JTextField();
		xinTxt.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u5B66\u53F7\uFF1A");
		
		xueTxt = new JTextField();
		xueTxt.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u662F\u5426\u63A5\u89E6\u60A3\u8005\uFF1A");
		
		huanTxt = new JTextField();
		huanTxt.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\u662F\u5426\u6709\u7591\u4F3C\u72B6\u51B5\uFF1A");
		
		JLabel lblNewLabel_4 = new JLabel("\u8054\u7CFB\u53F7\u7801\uFF1A");
		
		JLabel lblNewLabel_5 = new JLabel("\u5B66\u9662\uFF1A");
		
		lianTxt = new JTextField();
		lianTxt.setColumns(10);
		
		yuanTxt = new JTextField();
		yuanTxt.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("\u5F53\u524D\u5C45\u4F4F\u5730\uFF1A");
		
		dangTxt = new JTextField();
		dangTxt.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("\u5176\u4ED6\u5907\u6CE8\uFF1A");
		
		qiTxt = new JTextArea();//JTextArea qiTxt 
		
		JButton btnNewButton = new JButton("\u63D0\u4EA4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stuTypeAddActionPerfromed(e);
			}
		});
		btnNewButton.setIcon(new ImageIcon(StuTypeAddFrm.class.getResource("/images/login.png")));
		
		JButton btnNewButton_1 = new JButton("\u91CD\u7F6E");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetActionPerformed(e);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(StuTypeAddFrm.class.getResource("/images/reset.gif")));
		
		yiTxt = new JTextField();
		yiTxt.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(19)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel)
												.addComponent(lblNewLabel_1))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
												.addComponent(xueTxt)
												.addComponent(xinTxt, GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblNewLabel_2)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(huanTxt, 0, 0, Short.MAX_VALUE)))
									.addGap(27)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblNewLabel_3)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(yiTxt, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblNewLabel_5)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(yuanTxt, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblNewLabel_4)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lianTxt, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(qiTxt, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_6)
									.addGap(18)
									.addComponent(dangTxt, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(103)
							.addComponent(btnNewButton)
							.addGap(37)
							.addComponent(btnNewButton_1)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(xinTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4)
						.addComponent(lianTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(xueTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_5)
						.addComponent(yuanTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(huanTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_3)
						.addComponent(yiTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6)
						.addComponent(dangTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_7)
						.addComponent(qiTxt, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton))
					.addGap(36))
		);
		getContentPane().setLayout(groupLayout);

	}
	/**
	 * ѧ��tianjia
	 * @param e
	 */
private void stuTypeAddActionPerfromed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	String ����=this.xinTxt.getText();
	String ѧ��=this.xueTxt.getText();
	String ��ϵ����=this.lianTxt.getText();
	String ѧԺ=this.yuanTxt.getText();
	String �Ƿ�Ӵ�����=this.huanTxt.getText();
	String �Ƿ�������״��=this.yiTxt.getText();
	String ��ǰ��ס��=this.dangTxt.getText();
	String ������ע=this.qiTxt.getText();
	if(StringUtil.isEmpty(����)){
		JOptionPane.showMessageDialog(null, "��������Ϊ��");
		
	}
	if(StringUtil.isEmpty(ѧ��)){
		JOptionPane.showMessageDialog(null, "ѧ�Ų���Ϊ��");
		
	}
	if(StringUtil.isEmpty(��ϵ����)){
		JOptionPane.showMessageDialog(null, "��ϵ���벻��Ϊ��");
		
	}
	if(StringUtil.isEmpty(ѧԺ)){
		JOptionPane.showMessageDialog(null, "ѧԺ����Ϊ��");
		
	}
	if(StringUtil.isEmpty(�Ƿ�Ӵ�����)){
		JOptionPane.showMessageDialog(null, "�Ƿ�Ӵ����߲���Ϊ��");
		
	}
	if(StringUtil.isEmpty(�Ƿ�������״��)){
		JOptionPane.showMessageDialog(null, "�Ƿ�������״������Ϊ��");
		
	}
	if(StringUtil.isEmpty(��ǰ��ס��)){
		JOptionPane.showMessageDialog(null, "��ǰ��ס�ز���Ϊ��");
		
	}
	if(StringUtil.isEmpty(������ע)){
		JOptionPane.showMessageDialog(null, "������ע����Ϊ��");
		
	}
	StuType  stuType=new StuType( ����,  ѧ��,  ��ϵ����,  ѧԺ,  �Ƿ�Ӵ�����,  �Ƿ�������״��, ��ǰ��ס��,
			������ע);
	Connection con =null;
	try {
		con=dbUtil.getCon();
		int n=stuTypeDao.add(con, stuType);
		if(n==1){
			JOptionPane.showMessageDialog(null,"�ύ�ɹ�");
			resetValue();
		}else{
			JOptionPane.showMessageDialog(null, "�ύʧ��");
		}
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}finally{
		try {
			dbUtil.closeCon(con);//�ر�
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	}

/**
 * 
 *����
 */
	private void resetActionPerformed(ActionEvent e) {
		this.resetValue();
		
	}
	private void   resetValue(){
		this.xinTxt.setText("");
		this.xueTxt.setText("");
		this.lianTxt.setText("");
		this.yuanTxt.setText("");
		this.huanTxt.setText("");
		this.yiTxt.setText("");
		this.dangTxt.setText("");
		this.qiTxt.setText("");
		
	}
	
}
