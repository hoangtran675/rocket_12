package com.vti.backend.presentationlayer;

import java.util.ArrayList;
import java.util.List;

import com.vti.backend.businesslayer.IService;
import com.vti.backend.businesslayer.Service;
import com.vti.entity.Department;

public class Controller {
	private IService service;
	
	
	public Controller() {
		super();
		this.service = new Service();
	}


	public List<Department> showDepartmentList(){
		return service.showDepartmentList();
	}
	
	public void updateDepartment(int id, String name){
		service.updateDepartment(id, name);
	}
	

}
