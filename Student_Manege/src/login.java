import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login extends JFrame implements ActionListener {
	login(String title) {
		super(title);
		init();
	}

	JLabel lname, lpwd;
	JTextField tname;
	JPasswordField tpwd;
	JButton btnok, btncancel, btnregist;

	void init() {
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lname = new JLabel("账号");
		lpwd = new JLabel("密码");
		tname = new JTextField();
		tpwd = new JPasswordField();
		this.setLayout(null);
		lname.setBounds(50, 20, 40, 20);
		this.add(lname);
		lpwd.setBounds(50, 55, 40, 20);
		this.add(lpwd);
		tname.setBounds(100, 20, 130, 20);
		this.add(tname);
		tpwd.setBounds(100, 55, 130, 20);
		this.add(tpwd);
		btnok = new JButton("确定");
		btnok.setBounds(20, 105, 70, 25);
		this.add(btnok);
		btncancel = new JButton("取消");
		btncancel.setBounds(110, 105, 70, 25);
		this.add(btncancel);
		btnregist = new JButton("注册");
		btnregist.setBounds(200, 105, 70, 25);
		this.add(btnregist);
		btnok.addActionListener(this);
		btncancel.addActionListener(this);
		btnregist.addActionListener(this);

		 this.setVisible(true);
	}

	 @Override
	 public void actionPerformed(ActionEvent e) {
 	// TODO 自动生成的方法存根
    	String s = e.getActionCommand();
	 	if (s.equals("确定")) {
//	 		String luname = tname.getText();
//	 		String lupwd = tpwd.getText();
//	 		if (luname.length() != 0 && lupwd.length() != 0) {
//	 			if (DBcontrol.loginbool(luname, lupwd)) {
//	 				this.dispose();
//	 				mainjframe mf = new mainjframe("菜单选项", login.this);
//	 				mf.setVisible(true);
//	 			} else {
//	 				JOptionPane.showMessageDialog(this, "用户名或密码不正确，请重新输入");
//	 				tname.setText(null);
//	 				tpwd.setText(null);
//	 				tname.requestFocus();
//	 			}
//	 		} else {
//	 			JOptionPane.showMessageDialog(this, "用户名密码不能为空，请重新输入");
//	 		}
		}

		if (s.equals("取消")) {
			tname.setText(null);
	 		tpwd.setText(null);
     		tname.requestFocus();
	 	}
	 	if (s.equals("注册")) {
	 		this.dispose();
	 		registframe rf = new registframe("注册界面", login.this);
	 		rf.setVisible(true);
    	}
	 }

	public static void main(String[] args) {
		login dl = new login("登录");
		dl.setVisible(true);

	}
}
