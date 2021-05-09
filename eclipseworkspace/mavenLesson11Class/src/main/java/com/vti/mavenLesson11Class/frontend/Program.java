package com.vti.mavenLesson11Class.frontend;

import java.sql.SQLException;
import java.util.List;

import com.vti.mavenLesson11Class.backend.presentation.DepartmentController;
import com.vti.mavenLesson11Class.entity.Department;

public class Program {
	private static DepartmentController deptController;

	public static void main(String[] args) {
		deptController = new DepartmentController();
		showDepartmentList();
	}

	private static void showDepartmentList() {
		List<Department> deptList = deptController.showDepartmentList();
		for (Department department : deptList) {
			System.out.println(department.toString());
		}
	}

}
