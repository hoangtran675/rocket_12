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

import com.vti.entity.*;
import com.vti.utils.JdbcUtils;
import com.vti.utils.properties.MessageProperties;

public class AccountRepository implements IAccountRepository {
	private JdbcUtils jdbcUtils;
	MessageProperties message ;

	public AccountRepository() throws FileNotFoundException, IOException {
		super();
		jdbcUtils = new JdbcUtils();
		message = new MessageProperties();
	}

	public List<Account> getListAccount() throws ClassNotFoundException, SQLException {
		List<Account> accounts = new ArrayList<Account>();
		jdbcUtils.connect();
		Connection connection = jdbcUtils.getConnection();
		Statement statement = connection.createStatement();
		String sql = "SELECT account_id, email, username FROM `account`";

		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			Account acc = new Account(resultSet.getInt(1), resultSet.getString(3), resultSet.getString(2));
			accounts.add(acc);
		}
		return accounts;
	}

	public void createAccount(int id, String username, String email) throws ClassNotFoundException, SQLException {
		jdbcUtils.connect();
		Connection connection = jdbcUtils.getConnection();
		String sql = "INSERT INTO `account` (account_id ,username, email) " + "VALUES 				(?,		?,		?)";

		PreparedStatement pre = connection.prepareStatement(sql);
		pre.setInt(1, id);
		pre.setString(2, username);
		pre.setString(3, email);

		int effectedRecord = pre.executeUpdate();
		if(effectedRecord > 0){
			System.out.println(message.getValue("account.create.success"));
			System.out.println("Effected Record Amount : " + effectedRecord);
		}else{
			System.out.println(message.getValue("account.create.fail"));
			System.out.println("Effected Record Amount : 0");
		}
		

	}

	public Account getAccountById(int id) throws ClassNotFoundException, SQLException {
		Account account = null;
		jdbcUtils.connect();
		Connection connection = jdbcUtils.getConnection();
		String sql = "SELECT account_id, email, username FROM `account` WHERE account_id = ?";
		PreparedStatement pre = connection.prepareStatement(sql);
		pre.setInt(1, id);
		ResultSet resultSet = pre.executeQuery();
		while (resultSet.next()) {
			account = new Account(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));
		}
		return account;
	}

	public boolean isAccountExists(String username) throws ClassNotFoundException, SQLException {
		jdbcUtils.connect();
		Connection connection = jdbcUtils.getConnection();
		String sql = "SELECT username FROM `account` WHERE username = ?";
		PreparedStatement pre = connection.prepareStatement(sql);
		pre.setString(1, username);
		ResultSet resultSet = pre.executeQuery();
		while(resultSet.next()){
			return true;
		}
		return false;
	}
	
	public void updateAccountByID(int id, String newUsername, String newEmail) throws SQLException, ClassNotFoundException {
		jdbcUtils.connect();
		Connection connection = jdbcUtils.getConnection();
		String sql =	"UPDATE `account` " + 
						"SET username = ? , email = ? " + 
						"WHERE account_id = ?";

		PreparedStatement pre = connection.prepareStatement(sql);
		pre.setString(1, newUsername);
		pre.setString(2, newEmail);
		pre.setInt(3, id);
		int effectedRecord = pre.executeUpdate();
		if(effectedRecord > 0){
			System.out.println(message.getValue("account.update.success"));
			System.out.println("Effected Record Amount : " + effectedRecord);
		}else{
			System.out.println(message.getValue("account.update.fail"));
			System.out.println("Effected Record Amount : 0");
		}
		
	}

	public void deleteAccount(int id) throws ClassNotFoundException, SQLException {
		jdbcUtils.connect();
		Connection connection = jdbcUtils.getConnection();
		String sql =	"DELETE FROM `account` " + 
						"WHERE account_id = ?";

		PreparedStatement pre = connection.prepareStatement(sql);
		pre.setInt(1, id);
		int effectedRecord = pre.executeUpdate();
		if(effectedRecord > 0){
			System.out.println(message.getValue("account.delete.success"));
			System.out.println("Effected Record Amount : " + effectedRecord);
		}else{
			System.out.println(message.getValue("account.delete.fail"));
			System.out.println("Effected Record Amount : 0");
		}
		
		
	}

	public boolean isAccountExistsById(int id) throws SQLException, ClassNotFoundException {
		jdbcUtils.connect();
		Connection connection = jdbcUtils.getConnection();
		String sql = "SELECT account_id FROM `account` WHERE account_id = ?";
		PreparedStatement pre = connection.prepareStatement(sql);
		pre.setInt(1, id);
		ResultSet resultSet = pre.executeQuery();
		while(resultSet.next()){
			return true;
		}
		return false;
	}

	
	
}
