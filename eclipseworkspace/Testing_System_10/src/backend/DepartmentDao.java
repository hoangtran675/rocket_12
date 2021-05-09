package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentDao {
	public static String url = "jdbc:mysql://localhost:3306/testing_system_assignment?autoReconnect=true&useSSL=false&characterEncoding=latin1";
	public static String name = "root";
	public static String password = "root";
	// Question 1
	public static List<Department> getDepartment() throws SQLException, ClassNotFoundException {
		List<Department> departmentList = new ArrayList<Department>();
		Connection connection = DriverManager.getConnection(url, name, password);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Statement statement = connection.createStatement();

		String sql = "SELECT * FROM testing_system_assignment.department";
		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			Department dept = new Department(resultSet.getInt(1), resultSet.getString(2));
			departmentList.add(dept);
			// System.out.println(dept.toString());
		}
		// System.out.println("Connect Successfully");
		return departmentList;

	}
	// Question 2
	public static Department getDepartmentById() throws ClassNotFoundException, SQLException {
		Department dept = new Department();
		Connection connection = DriverManager.getConnection(url, name, password);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Statement statement = connection.createStatement();

		String sql = "SELECT * FROM testing_system_assignment.department " + "WHERE department_id = 5";
		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			// dept.setId(resultSet.getInt(1));
			// dept.setName(resultSet.getString(2));
			dept = new Department(resultSet.getInt(1), resultSet.getString(2));

			System.out.println(dept.toString());
		}
		return dept;
	}
	// question 3
	public static void getDepartmentByIdUser() throws ClassNotFoundException, SQLException, IdIsNotAvailable {
		Scanner sr = new Scanner(System.in);
		System.out.print("Enter Deparment ID : ");
		int id = sr.nextInt();
		Department dept = new Department();

		Connection connection = DriverManager.getConnection(url, name, password);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Statement statement = connection.createStatement();

		String sql = "SELECT * FROM testing_system_assignment.department " + "WHERE department_id = " + id ;
		ResultSet resultSet = statement.executeQuery(sql);
		
//		if (resultSet.wasNull()) {
//			throw new IdIsNotAvailable("Dont have this id : " + id);
//		} else {
			while (resultSet.next()) {
				dept = new Department(resultSet.getInt(1), resultSet.getString(2));
				System.out.println(dept.toString());
			}
//		}

	}
	
	// question 4
	public static boolean departmentNameIsAvailable(String departmentName) throws ClassNotFoundException, SQLException{
		Department dept = new Department();

		Connection connection = DriverManager.getConnection(url, name, password);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Statement statement = connection.createStatement();

		String sql = "SELECT * FROM testing_system_assignment.department ";
		ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				if(resultSet.getString(2).equals(departmentName)){
					return true;
				}
			}
			return false;
	}
	
	public static boolean departmentIdIsAvailable(int id) throws ClassNotFoundException, SQLException{
		Department dept = new Department();

		Connection connection = DriverManager.getConnection(url, name, password);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Statement statement = connection.createStatement();

		String sql = "SELECT * FROM testing_system_assignment.department ";
		ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				if(resultSet.getInt(1)== id){
					return true;
				}
			}
			return false;
	}
	// Question 5
	public static void createDepartment(int id, String nameDepartment) throws ClassNotFoundException, SQLException{
		if(departmentNameIsAvailable(nameDepartment) || departmentIdIsAvailable(id)){
			System.out.println("Name or ID is already existed");
		}else{
			Connection connection = DriverManager.getConnection(url, name, password);
			Class.forName("com.mysql.cj.jdbc.Driver");
			String sql = "INSERT INTO testing_system_assignment.department (department_id, department_name)" + 
						" VALUES				(?,		?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, nameDepartment);
			int rowEffected = preparedStatement.executeUpdate();
			System.out.println("Row Effected : " + rowEffected);
		}
	}
	
	// Question 6
	public static void updateDepartment(int id, String nameDepartment) throws ClassNotFoundException, SQLException{
		if(departmentIdIsAvailable(id)  == false){
			System.out.println("ID is not existed");
		}else{
			Connection connection = DriverManager.getConnection(url, name, password);
			Class.forName("com.mysql.cj.jdbc.Driver");
			String sql = "UPDATE department " +
					"SET department_name = ? "+
					"WHERE department_id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(2, id);
			preparedStatement.setString(1, nameDepartment);
			int rowEffected = preparedStatement.executeUpdate();
			System.out.println("Row Effected : " + rowEffected);
		}
	}
	
	// Question 7
	public static void deleteDepartment(int id) throws ClassNotFoundException, SQLException{
		if(departmentIdIsAvailable(id)  == false){
			System.out.println("ID is not existed");
		}else{
			Connection connection = DriverManager.getConnection(url, name, password);
			Class.forName("com.mysql.cj.jdbc.Driver");
			String sql = "DELETE FROM department " +
					     "WHERE department_id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			int rowEffected = preparedStatement.executeUpdate();
			System.out.println("Row Effected : " + rowEffected);
		}
	}
	
	
	

}
