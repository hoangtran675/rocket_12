package com.vti.entity;

public class Account {
	private int id;
	private String username;
	private String email;
	
	public Account(int id, String username, String email) {
		this.id = id;
		this.username = username;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return username;
	}
	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", username=" + username + ", email=" + email + "]";
	}
	
}
