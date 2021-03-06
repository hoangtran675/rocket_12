package com.vti.frontend;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.vti.backend.presentationlayer.AccountController;
import com.vti.entity.Account;
import com.vti.utils.ScannerUtils;

public class Program {
	private static AccountController controller;
	private static ScannerUtils scanner ;
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		controller = new AccountController();
		scanner = new ScannerUtils();
		System.out.println("Function List: ");
		System.out.println("1 : Show List Account"
				+ "\n2 : Create Account"
				+ "\n3 : Get Account By ID"
				+ "\n4 : Check Account Exist Or Not"
				+ "\n5 : Update Account By ID"
				+ "\n6 : Delete Account By ID"
				+ "\n7 : Exist Program");
		
		int selectFunction;
		do{
			System.out.print("Select function : ");
			selectFunction = scanner.inputInt("This is not Integer ID");
			switch(selectFunction){
			case 1 : 
				System.out.println("----------------SHOW LIST ACCOUNT---------------");
				showListAccount();
				break;
			case 2 :
				case2();
				break;
			case 3 :
				case3();
				break;
			case 4 :
				case4();
				break;
			case 5 :
				case5();
				break;
			case 6 :
				case6();
				break;
			case 7 :
				System.out.println("----------------EXIT PROGRAM---------------");
				return;
			}
		}while(selectFunction < 8);
		
//		// Show List Account
//		showListAccount();
//		// Create Account
//		createAccount(1, "HoangTran", "tran16875@gmail.com");
//		// Get Account By ID
//		Account acc = getAccountById(1);
//		System.out.println(acc.toString());
//		// Check Account Exist Or Not
//		System.out.println(isAccountExists("HoangTran"));
//		// Update Account By ID
//		 updateAccountById(1, "newHoangTran","newtran16875@gmail.com");
//		// Delete Account By ID
//		controller.deleteAccount(1);

	}
	
	// Get List Account
	public static void showListAccount(){
		List<Account> accounts = controller.getListAccount();
		 for (Account account : accounts) {
		 System.out.println(account.toString());
		 }
	}
	//Create Account
	public static void createAccount(int id, String username, String email){
		controller.createAccount(id, "HoangTran", "tran16875@gmail.com");
	}
	// Get Account By ID
	public static Account getAccountById(int id){
		return controller.getAccountById(1);
	}
	// Check Account Exist Or Not
	public static boolean isAccountExists(String username){
		return controller.isAccountExists("HoangTran");
	}
	public static boolean isAccountExistById(int id){
		return controller.isAccountExistsById(id);
	}
	// Update Account By ID
	public static void updateAccountById(int id, String newUsername, String newEmail){
		controller.updateAccountByID(id, newUsername, newEmail);
	}
	// Delete Account By ID
	public static void deleteAccount(int id){
		controller.deleteAccount(id);
	}
	public static void case2(){
		System.out.println("----------------CREATE NEW ACCOUNT---------------");
		System.out.print("Enter the ID : ");
		int id =scanner.inputInt("This is not Integer Number ");
		System.out.print("Enter Username : ");
		String userName = scanner.inputString();
		System.out.print("Enter Email : ");
		String email = scanner.inputString();
		createAccount(id, userName, email);
	}
	
	public static void case3(){
		System.out.println("----------------GET ACCOUNT BY ID---------------");
		System.out.print("Enter the ID : ");
		int id =scanner.inputInt("This is not Integer Number ");
		Account acc = getAccountById(id);
		System.out.println(acc.toString());
	}
	public static void case4(){
		System.out.println("----------------CHECK ACCOUNT EXIST OR NOT---------------");
		System.out.print("Enter Username : ");
		String userName = scanner.inputString();
		System.out.println(isAccountExists(userName));
	}
	public static void case5(){
		System.out.println("----------------UPDATE ACCOUNT BY ID---------------");
		System.out.print("Enter the ID of Account : ");
		int id =scanner.inputInt("This is not Integer Number ");
		System.out.print("Enter New Username : ");
		String userName = scanner.inputString();
		System.out.print("Enter New Email : ");
		String email = scanner.inputString();
		updateAccountById(id, userName, email);
	}
	
	public static void case6(){
		System.out.println("----------------DELETE ACCOUNT BY ID---------------");
		System.out.print("Enter the ID : ");
		int id =scanner.inputInt("This is not Integer Number ");
		deleteAccount(id);
	}
}
