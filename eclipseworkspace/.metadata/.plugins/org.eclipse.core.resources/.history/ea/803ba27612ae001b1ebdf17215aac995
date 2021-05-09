package com.vti.MavenDemo.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.vti.MavenDemo.utils.properties.DatabaseProperties;

public class JDBCUtils {
	private Connection connection;
	public DatabaseProperties daProperties;
	public JDBCUtils() throws FileNotFoundException, IOException {
		daProperties = new DatabaseProperties();
	}
	public void Connect() throws SQLException {
		String url = daProperties.getValue("url");
		String username = daProperties.getValue("username");
		String password = daProperties.getValue("password");
		
		connection = DriverManager.getConnection(url, username, password);
		
	}
	public Connection getConnection() {
		return connection;
	}
	public void dissConnect() throws SQLException {
		connection.isClosed();
		
	}
	

}
