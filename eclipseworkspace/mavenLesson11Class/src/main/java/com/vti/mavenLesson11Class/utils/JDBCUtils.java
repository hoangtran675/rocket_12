package com.vti.mavenLesson11Class.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.vti.mavenLesson11Class.utils.properties.DatabaseProperties;

public class JDBCUtils {
	private Connection connection;
	public DatabaseProperties dp;
	
	
	public JDBCUtils() throws FileNotFoundException, IOException {
		dp = new DatabaseProperties();
	}


	public void connect() throws SQLException{
		String url = dp.getValue("url");
		String user = dp.getValue("user");
		String password = dp.getValue("password");
		connection = DriverManager.getConnection(url, user, password);
	}


	public Connection getConnection() {
		return connection;
	}


	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	public void disConnection() throws SQLException{
		connection.close();
	}
	
}
