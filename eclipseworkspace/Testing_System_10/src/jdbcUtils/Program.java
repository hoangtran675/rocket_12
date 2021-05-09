package jdbcUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		
		//JdbcUtils.isConnectedForTesting();
		String name1 = "hoang";
		Connection connection = DriverManager.getConnection(JdbcUtils.url, JdbcUtils.name, JdbcUtils.password);
		connection.close();
		connection = JdbcUtils.connect(connection);
		
		JdbcUtils.disconnect(connection);
	}

}
