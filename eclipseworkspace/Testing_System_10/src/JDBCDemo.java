import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		updateDepartmentNameById(5, "VTI Department");
		
	}
	public static void getDepartment(int id) {
		String url = "jdbc:mysql://localhost:3306/testing_system_assignment?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String user = "root";
		String password = "root";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Connection connection = null;
		try {
			// Tạo kết nối tới database
			connection = DriverManager.getConnection(url, user, password);
			// Tạo statement để chạy chương trình : query, 
			//Statement statement = connection.createStatement();
			
			// Query
			String sql = 	"SELECT * FROM department " +
							"WHERE department_id < ? ";
			PreparedStatement pre = connection.prepareStatement(sql);
			pre.setInt(1, id);
			
			// Chạy query và hứng kq vào resultSet
			ResultSet resultSet = pre.executeQuery();
			
			while(resultSet.next()){ // kiểm tra xem dòng tiếp theo có dữ liệu hay không : boolean 
				System.out.print(resultSet.getInt("department_id"));
				System.out.println(resultSet.getString(2));
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void updateDepartmentNameById(int id, String dept_name) {
		String url = "jdbc:mysql://localhost:3306/testing_system_assignment?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String user = "root";
		String password = "root";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Connection connection = null;
		try {
			// Tạo kết nối tới database
			connection = DriverManager.getConnection(url, user, password);
			// Tạo statement để chạy chương trình : query, 
			//Statement statement = connection.createStatement();
			
			// Query
			String sql = 	"UPDATE department " +
							"SET department_name = ? " + 
							"WHERE department_id = ?";
			PreparedStatement pre = connection.prepareStatement(sql);
			
			pre.setString(1, dept_name);
			pre.setInt(2, id);
			
			// Chạy query và hứng kq vào resultSet
			//ResultSet resultSet = pre.executeQuery();
			int record = pre.executeUpdate();
			if(record == 1){
				System.out.println("Update Successfully");
			}
			//System.out.println(record);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
