package com.vti.backend.datalayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Department;

public interface IRepository {
	public List<Department> getDepartmentList() throws SQLException, ClassNotFoundException ;

	public void updateDepartment(int id, String name) throws SQLException, ClassNotFoundException;
}
