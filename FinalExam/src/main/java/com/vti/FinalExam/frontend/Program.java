package com.vti.FinalExam.frontend;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.vti.FinalExam.backend.presentationlayer.Controller;
import com.vti.FinalExam.entity.Manager;
import com.vti.FinalExam.entity.User;
import com.vti.FinalExam.utils.ScannerUtils;

public class Program {
	private static Controller controller;
	private static ScannerUtils scanner ;
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		controller = new Controller();
		scanner = new ScannerUtils();
		controller.createEmployee(8, "Nguyen Van Sang","sangnguyen@vti.com.vn", "1234567Q", 3, "java");
//		controller.createManager(9, "Tran Van Hiep", "hiep@vti.com.vn","123456H",4 );
//		controller.createProject(3, 2, 9, 8);
//		List<User> users = controller.memInProject(1);
//		for (User user : users) {
//			System.out.println(user.toString());
//		}
//		List<Manager> mas = controller.getListManager();
//		for (Manager manager : mas) {
//			System.out.println(manager.toString());
//		}
		controller.logIn();


	}
	

}
