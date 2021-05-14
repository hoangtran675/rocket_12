package com.vti.FinalExam.backend.datalayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.FinalExam.entity.Manager;
import com.vti.FinalExam.entity.User;

public interface IRepository {

	void createEmployee(int id, String fullName, String email, String password, int projectId, String proSkill) throws ClassNotFoundException, SQLException;

	void createManager(int id, String fullName, String email, String password, int expInYear) throws ClassNotFoundException, SQLException;

	void createProject(int projectId, int teamSize, int idManager, int idEmployees) throws ClassNotFoundException, SQLException;

	List<User> memInProject(int id) throws ClassNotFoundException, SQLException;

	List<Manager> getListManager() throws ClassNotFoundException, SQLException;

	void logIn();

}
