package com.vti.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.vti.utils.properties.SourceProperties;

public class JDBCUtils {
	
	private SourceProperties sp;
	private Connection connection;
	public JDBCUtils() throws FileNotFoundException, IOException {
		sp = new SourceProperties();
	}
	public void connect() throws SQLException, ClassNotFoundException{
		String url = sp.getValue("url");
		String user = sp.getValue("user");
		String password = sp.getValue("password");
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		connection = DriverManager.getConnection(url, user, password) ;
		System.out.println("connect success");
	}
	 public Connection getConnection(){
		 return connection;
	 }
	 
	 public void disconnection() throws SQLException{
		 connection.close();
	 }
}
