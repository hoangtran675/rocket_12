package com.vti.FacebookDemo.backend.datalayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.FacebookDemo.entity.Message;
import com.vti.FacebookDemo.entity.User;

public interface IRepository {

	boolean logIn(String userName, String password) throws ClassNotFoundException, SQLException;

	List<User> showListFriendById(int id) throws ClassNotFoundException, SQLException;

	List<User> AmountUserMessageWith(int userId, int amount) throws ClassNotFoundException, SQLException;

	List<Message> getConversation(int hostId, int friendId) throws ClassNotFoundException, SQLException;

	void sendMessage(int hostId, int friendId, String content) throws ClassNotFoundException, SQLException;

	void sendRequest(int fromId, int toId) throws ClassNotFoundException, SQLException;

	void acceptRequest(int fromId, int toId) throws ClassNotFoundException, SQLException;

	void acceptRequestAll(int id) throws ClassNotFoundException, SQLException;

	int getId(String username, String password) throws SQLException, ClassNotFoundException;

}
