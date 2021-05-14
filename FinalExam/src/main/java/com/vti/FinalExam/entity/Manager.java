package com.vti.FinalExam.entity;

public class Manager extends User{
	private int expInYear;

	public Manager(int id, String fullName, String email, String password, String position, int expInYear) {
		super(id, fullName, email, password, position);
		this.expInYear = expInYear;
	}
	public Manager(int id, String fullName, String email, String position, int expInYear) {
		super(id, fullName, email, position);
		this.expInYear = expInYear;
	}
	
}
