package com.vti.mavenLesson11Class.backend.presentation;

import java.sql.SQLException;
import java.util.List;

import com.vti.mavenLesson11Class.backend.business.DepartmentService;
import com.vti.mavenLesson11Class.backend.business.IDepartmentService;
import com.vti.mavenLesson11Class.entity.Department;

public class DepartmentController {
	private IDepartmentService deptService;

	public DepartmentController() {
		deptService = new DepartmentService();
	}

	public List<Department> showDepartmentList() {
		
		return deptService.showDepartmentList();
		
	}
}
