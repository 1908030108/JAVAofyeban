
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class registframe extends JFrame implements ActionListener {
	public JLabel luser, lpwd, lqpwd;
	JTextField jtfname;
	JPasswordField jpfpwd;
	JPasswordField jpfqpwd;
	JButton btnok;
	JButton btncancel;
	JButton btnrm;
	login e;

	public registframe(String title, login e) {
		super(title);
		this.e = e;
		init();

	}

	void init() {
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		luser = new JLabel("注册账号：");
		lpwd = new JLabel("注册密码：");
		lqpwd = new JLabel("确认密码");
		jtfname = new JTextField();
		jpfpwd = new JPasswordField();
		jpfqpwd = new JPasswordField();
		btncancel = new JButton("返  回");
		btnrm = new JButton("重  置");
		btnok = new JButton("注  册");

		luser.setBounds(30, 20, 80, 20);
		jtfname.setBounds(100, 20, 130, 20);

		lpwd.setBounds(30, 55, 80, 20);
		jpfpwd.setBounds(100, 55, 130, 20);

		lqpwd.setBounds(30, 90, 80, 20);
		jpfqpwd.setBounds(100, 90, 130, 20);

		btnok.setBounds(30, 125, 70, 25);
		btncancel.setBounds(115, 125, 70, 25);
		btnrm.setBounds(200, 125, 70, 25);

		add(luser);
		add(lpwd);
		add(lqpwd);
		add(jtfname);
		add(jpfpwd);
		add(jpfqpwd);
		add(btnok);
		add(btncancel);
		add(btnrm);
		btncancel.addActionListener(this);
		btnok.addActionListener(this);
		btnrm.addActionListener(this);

	}

	 @SuppressWarnings("deprecation")
	 @Override
	public void actionPerformed(ActionEvent e1) {
		// TODO 自动生成的方法存根
  	 if (e1.getSource() == btnok) {

			 if (jtfname.getText().length() != 0
					&& jpfpwd.getText().length() != 0
			 		&& jpfqpwd.getText().length() != 0) {
			if (jpfpwd.getText().equals(jpfqpwd.getText())) {
	 				if (DBcontrol.regloginbool(jtfname.getText(),
	 						jpfpwd.getText())) {
	 					JOptionPane.showMessageDialog(null, "账号已经存在，请重新输入");
	 					jtfname.setText(null);
	 					jpfpwd.setText(null);
						jpfqpwd.setText(null);
	 					jtfname.requestFocus();
	 				} else {
	 					String username = jtfname.getText();
	 					String password = jpfpwd.getText();
	 					loginer l = new loginer(username, password);
	 					DBcontrol.loginadd(l);
						System.out.println("ok");
	 				 }
            } 
			 else {
			 		JOptionPane.showMessageDialog(null, "两次密码输入不一致，请重新输入");
			 		jpfpwd.setText(null);
			 		jpfqpwd.setText(null);
			 		jpfpwd.requestFocus();
			 }
	 		} else {
	 			JOptionPane.showMessageDialog(null, "用户名或密码为空，请重新输入");
	 		}
	 	}
	 	if (e1.getSource() == btncancel) {
	 		this.dispose();
	 		e.setVisible(true);
		}
	 	if (e1.getSource() == btnrm) {
	 		jtfname.setText(null);
	 		jpfpwd.setText(null);
	 		jpfqpwd.setText(null);
	 		jtfname.requestFocus();
	 	}

    }

   }
