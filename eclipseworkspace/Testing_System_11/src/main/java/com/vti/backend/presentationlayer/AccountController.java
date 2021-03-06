package com.vti.backend.presentationlayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.AccountService;
import com.vti.backend.businesslayer.IAccountService;
import com.vti.backend.datalayer.AccountRepository;
import com.vti.entity.Account;

public class AccountController {

	private IAccountService service;

	public AccountController() {
		service = new AccountService();
	}

	public List<Account> getListAccount() {
		return service.getListAccount();
	}

	public void createAccount(int id, String username, String email) {
		if (isAccountExistsById(id)) {
			System.out.println("ID is already exist");
		} else {
			service.createAccount(id, username, email);
		}
	}

	public Account getAccountById(int id) {
		if (isAccountExistsById(id)) {
			return service.getAccountById(id);
		} else {
			System.out.println("Account is not exist");
			return null;
		}
	}

	public boolean isAccountExists(String username) {
		return service.isAccountExists(username);
	}

	public boolean isAccountExistsById(int id) {
		return service.isAccountExistsById(id);
	}

	public void updateAccountByID(int id, String newUsername, String newEmail) {
		if (isAccountExistsById(id)) {
			service.updateAccountByID(id, newUsername, newEmail);
		} else {
			System.out.println("Account is not exist");
		}
	}

	public void deleteAccount(int id) {
		if (isAccountExistsById(id)) {
			service.deleteAccount(id);
		} else {
			System.out.println("Account is not exist");
		}
		
	}
}
