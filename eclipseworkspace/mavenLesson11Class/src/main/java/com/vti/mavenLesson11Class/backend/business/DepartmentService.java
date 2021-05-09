package com.vti.mavenLesson11Class.backend.business;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.mavenLesson11Class.backend.data.DepartmentRepository;
import com.vti.mavenLesson11Class.backend.data.IRepository;
import com.vti.mavenLesson11Class.entity.Department;

public class DepartmentService implements IDepartmentService {
	private IRepository deptRepository;

	public DepartmentService() {

		try {
			deptRepository = new DepartmentRepository();
		} catch (FileNotFoundException e) {
			System.out.println("Khong tim thay file ");
		} catch (IOException e) {
			System.out.println();
		}
	}

	public List<Department> showDepartmentList(){
		try {
			return deptRepository.getDepartmentList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}
}
