package com.vti.FacebookDemo.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.FacebookDemo.backend.datalayer.IRepository;
import com.vti.FacebookDemo.backend.datalayer.Repository;
import com.vti.FacebookDemo.entity.Message;
import com.vti.FacebookDemo.entity.User;

public class Service implements IService{
	private IRepository repository;
	
	
	public Service() {
		try {
			repository = new Repository();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public boolean logIn(String userName, String password) {
		try {
			return repository.logIn(userName, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}


	public List<User> showListFriendById(int id) {
		try {
			return repository.showListFriendById(id);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	public List<User> AmountUserMessageWith(int userId, int amount) {
		try {
			return repository.AmountUserMessageWith(userId, amount);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	public List<Message> getConversation(int hostId, int friendId) {
		try {
			return repository.getConversation(hostId,friendId);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	public void sendMessage(int hostId, int friendId, String content) {
		try {
			repository.sendMessage(hostId,friendId,content);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	public void sendRequest(int fromId, int toId) {
		try {
			repository.sendRequest(fromId,toId);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void acceptRequest(int fromId, int toId) {
		try {
			repository.acceptRequest(fromId,toId);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	public void acceptRequestAll(int id) {
		try {
			repository.acceptRequestAll(id);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public int getId(String username, String password) {
		try {
			return repository.getId(username,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}


	
	

}
