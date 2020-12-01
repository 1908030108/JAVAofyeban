
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBManager {
	private static String driver;
	private static String url;
	private static String userName;
	private static String userPassword;
	static {
		getInstance();
	}
	private static void getInstance() {
		userName = "";
		userPassword = "";
		driver = "sun.jdbc.odbc.JdbcOdbcDriver";
		url = "jdbc:odbc:driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=db/stu.accdb";
		try {
			Class.forName(driver); 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized static Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, userName, userPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}

