package com.vti.FinalExam.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.SetOfIntegerSyntax;

import com.vti.FinalExam.entity.Manager;
import com.vti.FinalExam.entity.User;
import com.vti.FinalExam.utils.JDBCUtils;
import com.vti.FinalExam.utils.ScannerUtils;
import com.vti.FinalExam.utils.Properties.MessageProperties;

public class Repository implements IRepository {

	private JDBCUtils jdbcUtils;
	MessageProperties message;
	ScannerUtils scannerUtils;

	public Repository() throws FileNotFoundException, IOException {
		jdbcUtils = new JDBCUtils();
		message = new MessageProperties();
		scannerUtils = new ScannerUtils();
	}

	public boolean isUserExists(int id) throws ClassNotFoundException, SQLException {
		jdbcUtils.connect();
		Connection connection = jdbcUtils.getConnection();
		String sql = "SELECT id FROM `user` WHERE id = ?";
		PreparedStatement pre = connection.prepareStatement(sql);
		pre.setInt(1, id);
		ResultSet resultSet = pre.executeQuery();
		while (resultSet.next()) {
			return true;
		}
		return false;
	}

	public void createEmployee(int id, String fullName, String email, String password, int projectId, String proSkill)
			throws ClassNotFoundException, SQLException {
		if (isUserExists(id)) {
			System.out.println("Employee ID was exists.");
		} else {
			jdbcUtils.connect();
			Connection connection = jdbcUtils.getConnection();
			String sql = "INSERT INTO `user` (id ,fullName, email, password, position, projectId, proSkill) "
					+ "VALUES 			(?,		?,		?, ?, 'E', ?, ?)";

			PreparedStatement pre = connection.prepareStatement(sql);
			pre.setInt(1, id);
			pre.setString(2, fullName);
			pre.setString(3, email);
			pre.setString(4, password);
			pre.setInt(5, projectId);
			pre.setString(6, proSkill);

			int effectedRecord = pre.executeUpdate();
			if (effectedRecord > 0) {
				System.out.println(message.getValue("employee.create.success"));
				System.out.println("Effected Record Amount : " + effectedRecord);
			} else {
				System.out.println(message.getValue("employee.create.fail"));
				System.out.println("Effected Record Amount : 0");
			}
		}
	}
	
	public void createManager(int id, String fullName, String email, String password, int expInYear)
			throws ClassNotFoundException, SQLException {
		if (isUserExists(id)) {
			System.out.println("Manager ID was exists ");
		} else {
			jdbcUtils.connect();
			Connection connection = jdbcUtils.getConnection();
			String sql = "INSERT INTO `user` (id ,fullName, email, password, position, expInYear) "
					+ "VALUES 			(?,		?,		?, ?, 'M', ?)";

			PreparedStatement pre = connection.prepareStatement(sql);
			pre.setInt(1, id);
			pre.setString(2, fullName);
			pre.setString(3, email);
			pre.setString(4, password);
			pre.setInt(5, expInYear);

			int effectedRecord = pre.executeUpdate();
			if (effectedRecord > 0) {
				System.out.println(message.getValue("manager.create.success"));
				System.out.println("Effected Record Amount : " + effectedRecord);
			} else {
				System.out.println(message.getValue("manager.create.fail"));
				System.out.println("Effected Record Amount : 0");
			}
		}
	}

	public boolean isProExists(int id) throws ClassNotFoundException, SQLException {
		jdbcUtils.connect();
		Connection connection = jdbcUtils.getConnection();
		String sql = "SELECT projectId FROM `project` WHERE projectId = ?";
		PreparedStatement pre = connection.prepareStatement(sql);
		pre.setInt(1, id);
		ResultSet resultSet = pre.executeQuery();
		while (resultSet.next()) {
			return true;
		}
		return false;
	}

	public void createProject(int projectId, int teamSize, int idManager, int idEmployees)
			throws ClassNotFoundException, SQLException {
		if (isProExists(projectId)) {
			System.out.println("Project ID was exists ");
		} else {
			jdbcUtils.connect();
			Connection connection = jdbcUtils.getConnection();
			String sql = "INSERT INTO `project` (projectId ,teamSize, idManager, idEmployees) "
					+ "VALUES 			(?,		?,		?, ?)";

			PreparedStatement pre = connection.prepareStatement(sql);
			pre.setInt(1, projectId);
			pre.setInt(2, teamSize);
			pre.setInt(3, idManager);
			pre.setInt(4, idEmployees);

			int effectedRecord = pre.executeUpdate();
			if (effectedRecord > 0) {
				System.out.println(message.getValue("project.create.success"));
				System.out.println("Effected Record Amount : " + effectedRecord);
			} else {
				System.out.println(message.getValue("project.create.fail"));
				System.out.println("Effected Record Amount : 0");
			}
		}
	}

	public List<User> memInProject(int id) throws ClassNotFoundException, SQLException {
		List<User> users = new ArrayList<User>();
		jdbcUtils.connect();
		Connection connection = jdbcUtils.getConnection();
		String sql = "SELECT id, fullName, email, position FROM `user` WHERE projectId = ?";
		PreparedStatement pre = connection.prepareStatement(sql);
		pre.setInt(1, id);
		ResultSet resultSet = pre.executeQuery();
		while (resultSet.next()) {
			users.add(new User(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(4)));
		}
		return users;
	}

	public List<Manager> getListManager() throws ClassNotFoundException, SQLException {
		List<Manager> managers = new ArrayList<Manager>();
		jdbcUtils.connect();
		Connection connection = jdbcUtils.getConnection();
		Statement statement = connection.createStatement();
		String sql = "SELECT * FROM `user` WHERE id IN ( SELECT DISTINCT idManager FROM project GROUP BY projectId ) ";
		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			managers.add(new Manager(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(5), resultSet.getInt(6)));
		}
		return managers;

	}

	public void logIn() {
		System.out.print("Enter Email : ");
		scannerUtils.inputEmail("Invalid Email");
		System.out.print("Enter password : ");
		scannerUtils.inputPassword("Invalid Password", 6, 12);
		System.out.println("Log in successfully");
	}

}
