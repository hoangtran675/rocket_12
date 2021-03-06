package com.vti.FacebookDemo.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.vti.FacebookDemo.entity.Message;
import com.vti.FacebookDemo.entity.User;
import com.vti.FacebookDemo.utils.JDBCUtils;

public class Repository implements IRepository {

	private JDBCUtils jdbcUtils;

	public Repository() throws FileNotFoundException, IOException {
		jdbcUtils = new JDBCUtils();
	}

	public boolean logIn(String userName, String password) throws ClassNotFoundException, SQLException {
		jdbcUtils.connect();
		Connection connection = jdbcUtils.getConnection();
		String sql = "SELECT id FROM `user` " + "WHERE username = ? AND password = ?";
		PreparedStatement pre = connection.prepareStatement(sql);
		pre.setString(1, userName);
		pre.setString(2, password);
		ResultSet resultSet = pre.executeQuery();
		while (resultSet.next()) {
			System.out.println("Log In Successfully !");
			return true;
		}
		System.out.println("Fail To Log In !");
		return false;
	}

	public boolean isUserExistById(int id) throws ClassNotFoundException, SQLException {
		jdbcUtils.connect();
		Connection connection = jdbcUtils.getConnection();
		String sql = "SELECT * FROM `user` " + "WHERE id = ? ";
		PreparedStatement pre = connection.prepareStatement(sql);
		pre.setInt(1, id);
		ResultSet resultSet = pre.executeQuery();
		while (resultSet.next()) {
			return true;
		}
		return false;
	}

	public List<User> showListFriendById(int id) throws ClassNotFoundException, SQLException {
		List<User> friends = new ArrayList<User>();
		jdbcUtils.connect();
		Connection connection = jdbcUtils.getConnection();
		String sql = "SELECT * FROM `user` "
				+ "WHERE id IN (SELECT id FROM relationship WHERE id_partner = ? UNION ALL SELECT id_partner FROM relationship WHERE ID = ? )";
		PreparedStatement pre = connection.prepareStatement(sql);
		pre.setInt(1, id);
		pre.setInt(2, id);
		ResultSet result = pre.executeQuery();
		while (result.next()) {
			friends.add(new User(result.getInt(1), result.getString(2), result.getString(3)));
		}
		System.out.println("The number of friend : " + friends.size());
		return friends;
	}

	public List<User> AmountUserMessageWith(int userId, int amount) throws ClassNotFoundException, SQLException {
		List<User> friends = new ArrayList<User>();
		jdbcUtils.connect();
		Connection connection = jdbcUtils.getConnection();
		String sql = "SELECT *  FROM `user` " + "WHERE id IN (	SELECT sender_id AS id "
				+ "FROM	(SELECT sender_id, `time` FROM message WHERE reveiver_id = ? " + "UNION ALL "
				+ "SELECT reveiver_id, `time` FROM message WHERE sender_id = ? " + "ORDER BY `time` DESC ) AS A "
				+ "GROUP BY id )";
		PreparedStatement pre = connection.prepareStatement(sql);
		pre.setInt(1, userId);
		pre.setInt(2, userId);
		ResultSet result = pre.executeQuery();
		int i = 0;
		while (result.next() && i < amount) {
			User user = new User(result.getInt(1), result.getString(2), result.getString(3));
			friends.add(user);
			i++;
		}
		return friends;
	}

	public List<Message> getConversation(int hostId, int friendId) throws ClassNotFoundException, SQLException {
		if (isUserExistById(friendId)) {
			jdbcUtils.connect();
			Connection connection = jdbcUtils.getConnection();
			String sql = "SELECT id, content, `time` " + "FROM message "
					+ "WHERE (sender_id  = ? AND reveiver_id = ? ) OR (reveiver_id = ? AND sender_id = ?) "
					+ "ORDER BY `time` DESC";
			PreparedStatement pre = connection.prepareStatement(sql);
			pre.setInt(1, hostId);
			pre.setInt(2, friendId);
			pre.setInt(3, hostId);
			pre.setInt(4, friendId);
			ResultSet result = pre.executeQuery();
			List<Message> messages = new ArrayList<Message>();
			while (result.next()) {
				Message mess = new Message(result.getInt(1), result.getString(2), result.getString(3));
				messages.add(mess);
			}
			return messages;
		}
		System.out.println("Friend is not exist !");
		return null;

	}

	public static String getDate() {
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd");
		return simple.format(new Date());
	}

	public void sendMessage(int hostId, int friendId, String content) throws ClassNotFoundException, SQLException {
		if (isUserExistById(friendId)) {
			jdbcUtils.connect();
			Connection connection = jdbcUtils.getConnection();

			String sql = "INSERT INTO message (sender_id, reveiver_id, content, `time`) "
					+ "VALUES				 (?,		 ?,			 	?,			?)";
			PreparedStatement pre = connection.prepareStatement(sql);
			pre.setInt(1, hostId);
			pre.setInt(2, friendId);
			pre.setString(3, content);
			pre.setString(4, getDate());
			int effectRecord = pre.executeUpdate();
			System.out.println("Sent " + effectRecord + " message .");
		} else {
			System.out.println("Friend is not exist !");
		}
	}

	public void sendRequest(int fromId, int toId) throws ClassNotFoundException, SQLException {
		if (isUserExistById(toId)) {
			jdbcUtils.connect();
			Connection connection = jdbcUtils.getConnection();
			String sql = "INSERT INTO relationship	(id, `status`, id_partner) "
					+ "VALUES				 		(?,	'REQUESTING', ?)";
			PreparedStatement pre = connection.prepareStatement(sql);
			pre.setInt(1, toId);
			pre.setInt(2, fromId);
			int effectRecord = pre.executeUpdate();
			System.out.println("Sent " + effectRecord + " request.");
		} else {
			System.out.println("Friend is not exist !");
		}
	}

	public void acceptRequest(int fromId, int toId) throws ClassNotFoundException, SQLException {
		if (isUserExistById(toId)) {
			jdbcUtils.connect();
			Connection connection = jdbcUtils.getConnection();
			String sql = "UPDATE relationship " + "SET  status = 'NORMAL' " + "WHERE id = ? AND id_partner = ?";
			PreparedStatement pre = connection.prepareStatement(sql);
			pre.setInt(1, toId);
			pre.setInt(2, fromId);
			int effectRecord = pre.executeUpdate();
			System.out.println("Accepted " + effectRecord + " request.");
		} else {
			System.out.println("Friend is not exist !");
		}
	}

	public void acceptRequestAll(int id) throws ClassNotFoundException, SQLException {
		jdbcUtils.connect();
		Connection connection = jdbcUtils.getConnection();
		String sql = "UPDATE relationship " + "SET  status = 'NORMAL' " + "WHERE id = ? AND `status` = 'REQUESTING'";
		PreparedStatement pre = connection.prepareStatement(sql);
		pre.setInt(1, id);
		int effectRecord = pre.executeUpdate();
		System.out.println("Accepted " + effectRecord + " request.");
	}

	public int getId(String username, String password) throws SQLException, ClassNotFoundException {
		jdbcUtils.connect();
		Connection connection = jdbcUtils.getConnection();
		String sql =	"SELECT id FROM `user` " + 
						"WHERE username = ? AND password = ? ";
		PreparedStatement pre = connection.prepareStatement(sql);
		pre.setString(1, username);
		pre.setString(2, password);
		ResultSet result = pre.executeQuery();
		int iD = 0;
		while (result.next()) {
			iD = result.getInt(1);
		}
		return iD;
	}

}
