package com.vti.mavenLesson11Class.backend.data;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.mavenLesson11Class.entity.Department;
import com.vti.mavenLesson11Class.utils.JDBCUtils;

public class DepartmentRepository implements IRepository{
	private JDBCUtils jdbcUtils;
	
	public DepartmentRepository() throws FileNotFoundException, IOException {
		jdbcUtils = new JDBCUtils();
	}

	public List<Department> getDepartmentList() throws SQLException {
		List<Department> departments = new ArrayList<Department>();
		// B1 : Connection database
		jdbcUtils.connect();
		//
		Connection connection = jdbcUtils.getConnection();
		String sql = "SELECT * FROM `Department`";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		while(resultSet.next()){
			int id = resultSet.getInt(1);
			String name = resultSet.getString(2);
			Department dept = new Department(id, name );
			departments.add(dept);
		}
		jdbcUtils.disConnection();
		return departments;
		
	}
}
