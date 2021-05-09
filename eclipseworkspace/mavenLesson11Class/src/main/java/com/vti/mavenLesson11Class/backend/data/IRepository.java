package com.vti.mavenLesson11Class.backend.data;

import java.sql.SQLException;
import java.util.List;

import com.vti.mavenLesson11Class.entity.Department;

public interface IRepository {

	List<Department> getDepartmentList() throws SQLException;

}
