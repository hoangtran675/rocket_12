package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BasicDemo {
	public static String url = "jdbc:mysql://localhost:3306/testing_system_assignment?autoReconnect=true&useSSL=false&characterEncoding=latin1";
	public static String name = "root";
	public static String password = "root";
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		String url = "jdbc:mysql://localhost:3306/testing_system_assignment?autoReconnect=true&useSSL=false&characterEncoding=latin1";
//		String name = "root";
//		String password = "root";
		
		
		//displayPositionInfor();
		//insertPositionByUser("DEV");
		question4();
		
		
		
	}
	public static void question1() throws SQLException, ClassNotFoundException{
		Connection connection = DriverManager.getConnection(url,name,password );
		Class.forName("com.mysql.cj.jdbc.Driver");
		Statement statement = connection.createStatement();
		System.out.println("Connect Successfully");
	}
	public static void displayPositionInfor() throws ClassNotFoundException, SQLException{
		Connection connection = DriverManager.getConnection(url,name,password );
		Class.forName("com.mysql.cj.jdbc.Driver");
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM testing_system_assignment.position";
		ResultSet resultSet = statement.executeQuery(sql);
		while(resultSet.next()){
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
		}
	}
	public static void insertPositionByUser(String namePostion) throws SQLException, ClassNotFoundException{
		Connection connection = DriverManager.getConnection(url,name,password );
		Class.forName("com.mysql.cj.jdbc.Driver");
		String sql = "INSERT INTO position (position_id, position_name)" + 
					" VALUES				(11,		?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, namePostion);
		int rowEffected = preparedStatement.executeUpdate();
		System.out.println("Row Effected : " + rowEffected);
		
	}
	public static void question4() throws SQLException, ClassNotFoundException{
		Connection connection = DriverManager.getConnection(url,name,password );
		Class.forName("com.mysql.cj.jdbc.Driver");
		String sql = "UPDATE position " +
				"SET position_name = 'DEV' "+
				"WHERE position_id = 5";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		int rowEffected = preparedStatement.executeUpdate();
		System.out.println("Row Effected : " + rowEffected);
	}
	public static void question5(int id, int newId, String namePosition) throws SQLException, ClassNotFoundException{
		Connection connection = DriverManager.getConnection(url,name,password );
		Class.forName("com.mysql.cj.jdbc.Driver");
		String sql1 = "DELETE FROM position " +
					"WHERE position_id = ?";
		PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
		preparedStatement1.setInt(1, id);
		int rowEffected1 = preparedStatement1.executeUpdate();
		System.out.println(" DELETE : Row Effected  : " + rowEffected1);
		
		String sql2 = "UPDATE position " +
				"SET position_name = ? "+
				"WHERE position_id = ?";
		
		PreparedStatement preparedStatement2 = connection.prepareStatement(sql2);
		preparedStatement2.setString(1, namePosition);
		preparedStatement2.setInt(2, newId);
		
		int rowEffected2 = preparedStatement2.executeUpdate();
		System.out.println("UPDATE : Row Effected : " + rowEffected2);
		
		
	}

}
