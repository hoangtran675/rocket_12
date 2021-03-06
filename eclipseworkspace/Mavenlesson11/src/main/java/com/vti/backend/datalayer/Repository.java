package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.vti.entity.Department;
import com.vti.utils.JDBCUtils;
import com.vti.utils.properties.MessageProperties;
import com.vti.utils.properties.SourceProperties;

public class Repository implements IRepository{
	private JDBCUtils jdbcUtis;
	private SourceProperties  properties;
	private MessageProperties mesProperties;
	
	public Repository() throws FileNotFoundException, IOException {
		jdbcUtis = new JDBCUtils();
		mesProperties = new MessageProperties();
	}

	public List<Department> getDepartmentList() throws SQLException, ClassNotFoundException {
		List<Department> departments = new ArrayList<Department>();
		// get a connection
		jdbcUtis.connect();
		Connection connection = jdbcUtis.getConnection();
		// create a statement object
		String sql = "SELECT * FROM department";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		while(resultSet.next()){
			Department dept = new Department(resultSet.getInt(1), resultSet.getString(2));
			departments.add(dept);
		}
		jdbcUtis.disconnection();
		return departments;
	}

	public void updateDepartment(int id, String name) throws ClassNotFoundException, SQLException {
		jdbcUtis.connect();
		Connection connection = jdbcUtis.getConnection();
		String sql = "UPDATE department SET department_name = ? WHERE department_id = ?";
		PreparedStatement pre = connection.prepareStatement(sql);
		pre.setString(1, name);
		pre.setInt(2, id);
		
		int effectedRecordAmount = pre.executeUpdate();
		if(effectedRecordAmount > 0){
			System.out.println(mesProperties.getValue("department.update.success"));
		}
		else{
			System.out.println(mesProperties.getValue("department.update.fail"));
		}
		jdbcUtis.disconnection();
		
		
	}

	


}
