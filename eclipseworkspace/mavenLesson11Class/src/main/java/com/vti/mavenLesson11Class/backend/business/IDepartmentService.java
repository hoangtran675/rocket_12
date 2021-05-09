package com.vti.mavenLesson11Class.backend.business;

import java.sql.SQLException;
import java.util.List;

import com.vti.mavenLesson11Class.entity.Department;

public interface IDepartmentService {

	List<Department> showDepartmentList();

}
