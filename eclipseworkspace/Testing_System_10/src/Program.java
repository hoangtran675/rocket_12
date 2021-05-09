import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/TestingSystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String name = "root";
		String password = "root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Get a database connection
		Connection connection = DriverManager.getConnection(url, name, password);
		System.out.println("Connect successful !");
		// Create a statement object
		//String sql = "SELECT id, username, email FROM user";
//		String sql = "INSERT INTO `Group` (`name` ,		`author_ID`, 	create_time)"
//				+ "    VALUE			('Java FresherHoang',		4, 			'2020-03-03')";
		
		
		String sql = "INSERT INTO `Group` (`name` ,		`author_ID`, create_time)"
				+ "    VALUE			   ( ? , ? , '2020-04-03')";
//		Statement statement = connection.createStatement();
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		preparedStatement.setString(1, "C# Hoang"); // index la vi tri cua dau "?"
		preparedStatement.setInt(2, 8);
		//ResultSet resultSet = statement.executeQuery(sql);
		int effectRecordAmount = preparedStatement.executeUpdate();
//		int effectRecordAmount1 = preparedStatement.executeUpdate(sql1);
		System.out.println(effectRecordAmount);
//		while(resultSet.next()){
//		// co the sd getIndex
//			System.out.println(resultSet.getInt("id"));
//			System.out.println(resultSet.getString("username"));
//			System.out.println(resultSet.getString("email"));
//		}
	}
}
