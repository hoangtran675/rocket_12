package com.vti.FinalExam.backend.businesslayer;

import java.util.List;

import com.vti.FinalExam.entity.Manager;
import com.vti.FinalExam.entity.User;

public interface IService {

	void createEmployee(int id, String fullName, String email, String password, int projectId, String proSkill);

	void createManager(int id, String fullName, String email, String password, int expInYear);

	void createProject(int projectId, int teamSize, int idManager, int idEmployees);

	List<User> memInProject(int id);

	List<Manager> getListManager();

	void logIn();

}
