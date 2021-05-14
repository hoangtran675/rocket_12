package com.vti.FinalExam.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.FinalExam.backend.datalayer.IRepository;
import com.vti.FinalExam.backend.datalayer.Repository;
import com.vti.FinalExam.entity.Manager;
import com.vti.FinalExam.entity.User;

public class Service implements IService{
	private IRepository repository;
	public Service(){
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
	public void createEmployee(int id, String fullName, String email, String password, int projectId, String proSkill) {
		try {
			repository.createEmployee(id, fullName, email,password, projectId, proSkill );
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void createManager(int id, String fullName, String email, String password, int expInYear) {
		try {
			repository.createManager(id, fullName, email,password,expInYear );
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void createProject(int projectId, int teamSize, int idManager, int idEmployees) {
		// TODO Auto-generated method stub
		try {
			repository.createProject(projectId,teamSize,idManager, idEmployees);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<User> memInProject(int id) {
		try {
			return repository.memInProject(id);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	public List<Manager> getListManager() {
		try {
			return repository.getListManager();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public void logIn() {
		repository.logIn();
		
	}
}
