package com.vti.FinalExam.backend.presentationlayer;

import java.util.List;

import com.vti.FinalExam.backend.businesslayer.IService;
import com.vti.FinalExam.backend.businesslayer.Service;
import com.vti.FinalExam.entity.Manager;
import com.vti.FinalExam.entity.User;
import com.vti.FinalExam.utils.ScannerUtils;

public class Controller {
	private IService service;
	private ScannerUtils scannerUtils;

	public Controller() {
		service = new Service();
		scannerUtils = new ScannerUtils();
	}

	public void createEmployee(int id, String fullName, String email, String password, int projectId, String proSkill) {
		service.createEmployee(id, fullName, email, password, projectId, proSkill);
	}
	
	public void createManager(int id, String fullName, String email, String password, int expInYear) {
		service.createManager(id, fullName, email, password, expInYear);
	}

	public void createProject(int projectId, int teamSize, int idManager, int idEmployees) {
		service.createProject(projectId, teamSize, idManager, idEmployees);
	}

	public List<User> memInProject(int id) {
		return service.memInProject(id);
	}

	public List<Manager> getListManager() {
		return service.getListManager();
	}

	public void logIn() {
		service.logIn();
	}
}
