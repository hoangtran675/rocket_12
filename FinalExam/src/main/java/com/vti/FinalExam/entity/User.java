package com.vti.FinalExam.entity;

public class User {
	private int id;
	private String fullName;
	private String email;
	private String password;
	private String position;
	
	
	public User(int id, String fullName, String email, String password, String position) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.position = position;
	}
	
	public User(int id, String fullName, String email, String position) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.position = position;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fullName=" + fullName + ", email=" + email + ", position=" + position + "]";
	}

	
	
	
	
	
}
