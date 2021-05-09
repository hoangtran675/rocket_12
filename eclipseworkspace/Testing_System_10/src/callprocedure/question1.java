package callprocedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class question1 {
	
	public static String url = "jdbc:mysql://localhost:3306/testing_system_assignment?autoReconnect=true&useSSL=false&characterEncoding=latin1";
	public static String name = "root";
	public static String password = "root";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		deleteDepartmentUsingProcedure(1);
	}
	
	public static void deleteDepartmentUsingProcedure(int id) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, name, password);
		String sql = "{CALL sp_delete_department(?)}";
		CallableStatement callablestatement = connection.prepareCall(sql);
		callablestatement.setInt(1, id);
		int effectRecordAmount = callablestatement.executeUpdate();
		System.out.println(effectRecordAmount);
		connection.close();
	}
}
