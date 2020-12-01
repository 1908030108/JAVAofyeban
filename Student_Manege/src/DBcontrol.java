
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

//String sNum;
//String sName;
//String sXb;
//String sPhone;
//String sAdress;
//String sLove;
//String sJl;
//String sClass;
//String sMz;
//String sBrn;
public class DBcontrol {
	 // ע���û���ѯ�˻��Ƿ����
	 public static boolean regloginbool(String username, String password) {
	 	boolean b = false;
	 	loginer bean = null;
	 	Connection conn = null; // ���ݿ�����
	 	PreparedStatement stm = null; // SQL���װ��
	 	ResultSet rs = null;
	 	String sql = "select * from login where username=?";
	 	try {
	 		conn = DBManager.getConnection();
	 		stm = conn.prepareStatement(sql);
	 		stm.setString(1, username);
	 		rs = stm.executeQuery();
	 		while (rs.next()) {
	 			bean = new loginer();
	 			bean.setUsername(rs.getString("username"));
	 			bean.setPassword(rs.getString("password"));
	 			 JOptionPane.showMessageDialog(null, "����������ɹ�...");
	 			if (bean.getPassword().equals(password)
	 					|| bean.getUsername().equals(username)) {
	 				b = true;
	 			}// ????????Ϊʲô��Ҫ����ѭ�����
	 		}

	 	} catch (SQLException e) {
	 		e.printStackTrace();
	 		JOptionPane.showMessageDialog(null, "�˺Ų�����");
	 		b = false;
	 	}
	 	System.out.println(b);
	 	return b;
	 }

	

	// // ��¼�û���ѯ
	// public static loginer loginselect(String username) {
	// 	loginer bean = null;
	// 	Connection conn = null; // ���ݿ�����
	// 	PreparedStatement stm = null; // SQL���װ��
	// 	ResultSet rs = null;
	// 	String sql = "select * from login where username=?";
	// 	try {
	// 		conn = DBManager.getConnection();
	// 		stm = conn.prepareStatement(sql);
	// 		stm.setString(1, username);
	// 		rs = stm.executeQuery();
	// 		while (rs.next()) {
	// 			bean = new loginer();
	// 			bean.setUsername(rs.getString("username"));
	// 			bean.setPassword(rs.getString("password"));
	// 			JOptionPane.showMessageDialog(null, "����������ɹ�...");
	// 		}
	// 	} catch (SQLException e) {
	// 		e.printStackTrace();
	// 		JOptionPane.showMessageDialog(null, "���������ʧ��...");
	// 	}
	// 	return bean;
	// }

	 // ��¼�û�ע��
	 public static void loginadd(loginer l) {
	 	Connection conn = null;
	 	String sql = "insert into login(username,password) values(?,?)";
	 	conn = DBManager.getConnection();
	 	try {
	 		PreparedStatement stmt = conn.prepareStatement(sql);
	 		String username = l.getUsername();
	 		String password = l.password;
	 		stmt.setString(1, username);
	 		stmt.setString(2, password);
	 		stmt.executeUpdate();
	 		JOptionPane.showMessageDialog(null, "������ӳɹ���");
	 	} catch (SQLException e) {
	 		// TODO �Զ����ɵ� catch ��
	 		JOptionPane.showMessageDialog(null, "���ݿ����ʧ�ܣ�");
	 	}
	 }

	// // ���ѧ����Ϣ
	// public static void addcontrol(student s) {
	// 	Connection conn = null;
	// 	String sql = "insert into stu(stu_num,stu_name,stu_xb,stu_phone,stu_adress,stu_love,stu_jl,stu_class,stu_mz,stu_brn) values(?,?,?,?,?,?,?,?,?,?)";
	// 	conn = DBManager.getConnection();
	// 	try {
	// 		PreparedStatement stmt = conn.prepareStatement(sql);
	// 		String stu_num = s.getsNum();
	// 		String stu_name = s.getsName();
	// 		String stu_xb = s.getsXb();
	// 		String stu_phone = s.getsPhone();
	// 		String stu_adress = s.getsAdress();
	// 		String stu_love = s.getsLove();
	// 		String stu_jl = s.getsJl();
	// 		String stu_class = s.getsClass();
	// 		String stu_mz = s.getsMz();
	// 		String stu_brn = s.getsBrn();
	// 		stmt.setString(1, stu_num);
	// 		stmt.setString(2, stu_name);
	// 		stmt.setString(3, stu_xb);
	// 		stmt.setString(4, stu_phone);
	// 		stmt.setString(5, stu_adress);
	// 		stmt.setString(6, stu_love);
	// 		stmt.setString(7, stu_jl);
	// 		stmt.setString(8, stu_class);
	// 		stmt.setString(9, stu_mz);
	// 		stmt.setString(10, stu_brn);
	// 		stmt.executeUpdate();
	// 		JOptionPane.showMessageDialog(null, "������ӳɹ���");
	// 	} catch (SQLException e) {
	// 		// TODO �Զ����ɵ� catch ��
	// 		JOptionPane.showMessageDialog(null, "���ݿ����ʧ�ܣ�");
	// 	}
	// }

	// // ɾ��ѧ����Ϣ
	// public static void delcontrol(student s) {
	// 	int rs;
	// 	Connection conn = null;
	// 	String sql = "delete from stu where stu_num=?";
	// 	conn = DBManager.getConnection();
	// 	try {
	// 		PreparedStatement stmt = conn.prepareStatement(sql);
	// 		String stu_num = s.getsNum();
	// 		stmt.setString(1, stu_num);
	// 		rs = stmt.executeUpdate();
	// 		if (rs != 0) {
	// 			JOptionPane.showMessageDialog(null, "ɾ��ѧ����Ϣ�ɹ���");
	// 		}
	// 	} catch (SQLException e) {
	// 		// TODO �Զ����ɵ� catch ��
	// 		JOptionPane.showMessageDialog(null, "���ݿ����ʧ�ܣ�");
	// 	}
	// }

	// // ����ѧ����Ϣ
	// public static boolean updcontrol(student s, String num) {
	// 	Connection conn = null;
	// 	String sql = "update stu set stu_num=?,stu_name=?,stu_xb=?,stu_phone=?,stu_adress=?,stu_love=?,stu_jl=?,stu_class=?,stu_mz=?,stu_brn=? where stu_num=?";
	// 	conn = DBManager.getConnection();
	// 	try {
	// 		PreparedStatement stmt = conn.prepareStatement(sql);
	// 		String stu_num = s.getsNum();
	// 		String stu_name = s.getsName();
	// 		String stu_xb = s.getsXb();
	// 		String stu_phone = s.getsPhone();
	// 		String stu_adress = s.getsAdress();
	// 		String stu_love = s.getsLove();
	// 		String stu_jl = s.getsJl();
	// 		String stu_class = s.getsClass();
	// 		String stu_mz = s.getsMz();
	// 		String stu_brn = s.getsBrn();
	// 		stmt.setString(1, stu_num);
	// 		stmt.setString(2, stu_name);
	// 		stmt.setString(3, stu_xb);
	// 		stmt.setString(4, stu_phone);
	// 		stmt.setString(5, stu_adress);
	// 		stmt.setString(6, stu_love);
	// 		stmt.setString(7, stu_jl);
	// 		stmt.setString(8, stu_class);
	// 		stmt.setString(9, stu_mz);
	// 		stmt.setString(10, stu_brn);
	// 		stmt.setString(11, num);
	// 		stmt.executeUpdate();
	// 		JOptionPane.showMessageDialog(null, "���ݸ��³ɹ���");
	// 		return true;
	// 	} catch (SQLException e) {
	// 		// TODO �Զ����ɵ� catch ��
	// 		e.printStackTrace();
	// 		JOptionPane.showMessageDialog(null, "���ݿ����ʧ�ܣ�");
	// 		return false;
	// 	}
	// }

	// // ��ѯѧ����Ϣ
	// public static student selcontrol(String num) {
	// 	student bean = null;
	// 	Connection conn = null;
	// 	String sql = "select * from stu where stu_num=?";
	// 	conn = DBManager.getConnection();
	// 	ResultSet rs = null;
	// 	try {
	// 		PreparedStatement stmt = conn.prepareStatement(sql);
	// 		stmt.setString(1, num);
	// 		rs=stmt.executeQuery();
	// 		while (rs.next()) {
	// 			bean = new student();
	// 			bean.setsNum(rs.getString("stu_num"));
	// 			bean.setsName(rs.getString("stu_name"));
	// 			bean.setsXb(rs.getString("stu_xb"));
	// 			bean.setsPhone(rs.getString("stu_phone"));
	// 			bean.setsAdress(rs.getString("stu_adress"));
	// 			bean.setsLove(rs.getString("stu_love"));
	// 			bean.setsJl(rs.getString("stu_jl"));
	// 			bean.setsClass(rs.getString("stu_class"));
	// 			bean.setsMz(rs.getString("stu_mz"));
	// 			bean.setsBrn(rs.getString("stu_brn"));
	// 		}
	// 		JOptionPane.showMessageDialog(null, "���ݲ�ѯ�ɹ���");
	// 	} catch (SQLException e) {
	// 		// TODO �Զ����ɵ� catch ��
	// 		JOptionPane.showMessageDialog(null, "���ݿ����ʧ�ܣ�");
	// 	}
	// 	return bean;
	// }

	// // ��ѯѧ����Ϣ�Ƿ����
	// 	public static boolean selbool(String num) {
	// 		boolean b=false;
	// 		student bean = null;
	// 		Connection conn = null;
	// 		String sql = "select * from stu where stu_num=?";
	// 		conn = DBManager.getConnection();
	// 		ResultSet rs = null;
	// 		try {
	// 			PreparedStatement stmt = conn.prepareStatement(sql);
	// 			stmt.setString(1, num);
	// 			rs=stmt.executeQuery();
	// 			while (rs.next()) {
	// 				bean = new student();
	// 				bean.setsNum(rs.getString("stu_num"));
	// 				bean.setsName(rs.getString("stu_name"));
	// 				bean.setsXb(rs.getString("stu_xb"));
	// 				bean.setsPhone(rs.getString("stu_phone"));
	// 				bean.setsAdress(rs.getString("stu_adress"));
	// 				bean.setsLove(rs.getString("stu_love"));
	// 				bean.setsJl(rs.getString("stu_jl"));
	// 				bean.setsClass(rs.getString("stu_class"));
	// 				bean.setsMz(rs.getString("stu_mz"));
	// 				bean.setsBrn(rs.getString("stu_brn"));
	// 				if(bean.getsNum().equals(num)){
	// 					b=true;
	// 				}
	// 			}
	// 			JOptionPane.showMessageDialog(null, "���ݲ�ѯ�ɹ���");
	// 		} catch (SQLException e) {
	// 			// TODO �Զ����ɵ� catch ��
	// 			JOptionPane.showMessageDialog(null, "���ݿ����ʧ�ܣ�");
	// 			b=false;
	// 		}
	// 		System.out.println(b);
	// 		return b;
	// 	}

}

