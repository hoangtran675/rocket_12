package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.IRepository;
import com.vti.backend.datalayer.Repository;
import com.vti.entity.Department;

public class Service implements IService{
	private IRepository repository;
	
	
	public Service() {
		super();
		try {
			repository = new Repository();
		} catch (FileNotFoundException e) {
			System.err.println("HOANG - File is not found");
		} catch (IOException e) {
			System.err.println("HOANG - Database is not found");
		}
	}


	public List<Department> showDepartmentList() {
		try {
			return repository.getDepartmentList();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}


	public void updateDepartment(int id, String name) {
		try {
			repository.updateDepartment(id, name);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	
	
	
}
