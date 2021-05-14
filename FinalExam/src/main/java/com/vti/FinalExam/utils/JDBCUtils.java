package com.vti.FinalExam.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.vti.FinalExam.utils.Properties.SourceProperties;






public class JDBCUtils {

	private Connection connection;
	private SourceProperties properties;
	

	public JDBCUtils() throws FileNotFoundException, IOException {
		properties = new SourceProperties();
	}

	public void isConnectedForTesting() throws Exception {
		String url = properties.getValue("url");
		String user = properties.getValue("user");
		String password = properties.getValue("password");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, user, password);
		if (connection == null) {
			throw new Exception("Not Connected !");
		} else {
			System.out.println("Connect Successfully !");
		}
	}

	public void connect() throws SQLException, ClassNotFoundException {
		String url = properties.getValue("url");
		String user = properties.getValue("user");
		String password = properties.getValue("password");
		Class.forName("com.mysql.cj.jdbc.Driver");
		if (connection == null || connection.isClosed()) {
			connection = DriverManager.getConnection(url, user, password);
		}
	}
	public Connection getConnection(){
		return connection;
	}
	public void disconnect() throws SQLException {
		if (connection != null || connection.isClosed() == false) {
			connection.close();
			System.out.println("Closed Connection");
		}
	}

}
