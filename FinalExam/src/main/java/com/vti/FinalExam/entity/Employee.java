package com.vti.FinalExam.entity;

public class Employee extends User{
	
	private int projectId;
	private String proSkill;
	
	public Employee(int id, String fullName, String email, String password, String position,int projectId, String proSkill) {
		super(id, fullName, email, password, position);
		this.projectId = projectId;
		this.proSkill = proSkill;
		
	}
	
	
}
