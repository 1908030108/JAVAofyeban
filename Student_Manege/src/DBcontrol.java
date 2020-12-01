
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
	 // 注册用户查询账户是否存在
	 public static boolean regloginbool(String username, String password) {
	 	boolean b = false;
	 	loginer bean = null;
	 	Connection conn = null; // 数据库连接
	 	PreparedStatement stm = null; // SQL语句装载
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
	 			 JOptionPane.showMessageDialog(null, "搜索结果集成功...");
	 			if (bean.getPassword().equals(password)
	 					|| bean.getUsername().equals(username)) {
	 				b = true;
	 			}// ????????为什么非要放在循环里边
	 		}

	 	} catch (SQLException e) {
	 		e.printStackTrace();
	 		JOptionPane.showMessageDialog(null, "账号不存在");
	 		b = false;
	 	}
	 	System.out.println(b);
	 	return b;
	 }

	

	// // 登录用户查询
	// public static loginer loginselect(String username) {
	// 	loginer bean = null;
	// 	Connection conn = null; // 数据库连接
	// 	PreparedStatement stm = null; // SQL语句装载
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
	// 			JOptionPane.showMessageDialog(null, "搜索结果集成功...");
	// 		}
	// 	} catch (SQLException e) {
	// 		e.printStackTrace();
	// 		JOptionPane.showMessageDialog(null, "搜索结果集失败...");
	// 	}
	// 	return bean;
	// }

	 // 登录用户注册
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
	 		JOptionPane.showMessageDialog(null, "数据添加成功！");
	 	} catch (SQLException e) {
	 		// TODO 自动生成的 catch 块
	 		JOptionPane.showMessageDialog(null, "数据库操作失败！");
	 	}
	 }

	// // 添加学生信息
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
	// 		JOptionPane.showMessageDialog(null, "数据添加成功！");
	// 	} catch (SQLException e) {
	// 		// TODO 自动生成的 catch 块
	// 		JOptionPane.showMessageDialog(null, "数据库操作失败！");
	// 	}
	// }

	// // 删除学生信息
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
	// 			JOptionPane.showMessageDialog(null, "删除学生信息成功！");
	// 		}
	// 	} catch (SQLException e) {
	// 		// TODO 自动生成的 catch 块
	// 		JOptionPane.showMessageDialog(null, "数据库操作失败！");
	// 	}
	// }

	// // 更新学生信息
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
	// 		JOptionPane.showMessageDialog(null, "数据更新成功！");
	// 		return true;
	// 	} catch (SQLException e) {
	// 		// TODO 自动生成的 catch 块
	// 		e.printStackTrace();
	// 		JOptionPane.showMessageDialog(null, "数据库操作失败！");
	// 		return false;
	// 	}
	// }

	// // 查询学生信息
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
	// 		JOptionPane.showMessageDialog(null, "数据查询成功！");
	// 	} catch (SQLException e) {
	// 		// TODO 自动生成的 catch 块
	// 		JOptionPane.showMessageDialog(null, "数据库操作失败！");
	// 	}
	// 	return bean;
	// }

	// // 查询学生信息是否存在
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
	// 			JOptionPane.showMessageDialog(null, "数据查询成功！");
	// 		} catch (SQLException e) {
	// 			// TODO 自动生成的 catch 块
	// 			JOptionPane.showMessageDialog(null, "数据库操作失败！");
	// 			b=false;
	// 		}
	// 		System.out.println(b);
	// 		return b;
	// 	}

}

