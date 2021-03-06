package jdbcUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {
	public static String url = "jdbc:mysql://localhost:3306/testing_system_assignment?autoReconnect=true&useSSL=false&characterEncoding=latin1";
	public static String name = "root";
	public static String password = "root";
	
	public static void main(String[] args) throws Exception {
		isConnectedForTesting();
	}

	public static void isConnectedForTesting() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, name, password);
		if (connection == null) {
			throw new Exception("Not Connected !");
		} else {
			System.out.println("Connect Successfully !");
		}
	}

	public static Connection connect(Connection connection) throws SQLException, ClassNotFoundException {
		if (connection != null && connection.isClosed() == false) {
			return connection;
		} else {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, name, password);
			System.out.println("Connect Successfully New One");
			return con;
		}
	}

	public static void disconnect(Connection connection) throws SQLException{
		if(connection != null && connection.isClosed() == false){
			connection.close();
			System.out.println("Closed Connection");
		}else{
			
		}
	}

}
