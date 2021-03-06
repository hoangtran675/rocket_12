package com.vti.FacebookDemo.backend.businesslayer;

import java.util.List;

import com.vti.FacebookDemo.entity.Message;
import com.vti.FacebookDemo.entity.User;

public interface IService {

	boolean logIn(String userName, String password);

	List<User> showListFriendById(int id);

	List<User> AmountUserMessageWith(int userId, int amount);

	List<Message> getConversation(int hostId, int friendId);

	void sendMessage(int hostId, int friendId, String content);

	void sendRequest(int fromId, int toId);

	void acceptRequest(int fromId, int toId);

	void acceptRequestAll(int id);

	int getId(String username, String password);


}
