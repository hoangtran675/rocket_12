package com.vti.FacebookDemo.backend.presentationlayer;

import java.util.List;

import com.vti.FacebookDemo.backend.businesslayer.IService;
import com.vti.FacebookDemo.backend.businesslayer.Service;
import com.vti.FacebookDemo.entity.Message;
import com.vti.FacebookDemo.entity.User;

public class Controller {
	private IService service;

	public Controller() {
		service = new Service();
	}

	public boolean logIn(String userName, String password) {
		return service.logIn(userName, password);
	}

	public List<User> showListFriendById(int id) {
		return service.showListFriendById(id);
	}

	public List<User> AmountUserMessageWith(int userId, int amount) {
		return service.AmountUserMessageWith(userId, amount);
	}

	public List<Message> getConversation(int hostId, int friendId) {
		return service.getConversation(hostId, friendId);
	}

	public void sendMessage(int hostId, int friendId, String content) {
		service.sendMessage(hostId, friendId, content);
	}

	public void sendRequest(int fromId, int toId) {
		service.sendRequest(fromId, toId);
	}

	public void acceptRequest(int fromId, int toId) {
		service.acceptRequest(fromId, toId);
	}

	public void acceptRequestAll(int id) {
		service.acceptRequestAll(id);
	}
	public int getId(String username, String password){
		return service.getId(username, password);
	}
}
