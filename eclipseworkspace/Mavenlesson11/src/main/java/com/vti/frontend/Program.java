package com.vti.frontend;

import java.util.List;

import com.vti.backend.presentationlayer.Controller;
import com.vti.entity.Department;

public class Program {

	public static void main(String[] args) {
		Controller controller = new Controller();
		List<Department> departments = controller.showDepartmentList();
		for (Department department : departments) {
			System.out.println(department.toString());
		}
		controller.updateDepartment(2, "Marketing Not Ex");
	}


}
