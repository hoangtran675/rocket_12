package com.vti.backend.businesslayer;

import java.util.List;

import com.vti.entity.Department;

public interface IService {
	public List<Department> showDepartmentList();

	public void updateDepartment(int id, String name);
}
