package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.AccountRepository;
import com.vti.backend.datalayer.IAccountRepository;
import com.vti.entity.Account;
import com.vti.utils.properties.MessageProperties;

public class AccountService implements IAccountService{
	private IAccountRepository repository;
	
	public AccountService(){
		try {
			repository = new AccountRepository();
		} catch (FileNotFoundException e) {
			System.err.println("(By user)---Can not file this file !");
		} catch (IOException e) {
			System.err.println("(By user)---FileInputStream is not worked properly !");
		}
	}
	public List<Account> getListAccount() {
		try {
			return repository.getListAccount();
		} catch (ClassNotFoundException e) {
			System.err.println("(By user)---Can not file this file !");
		} catch (SQLException e) {
			System.err.println("(By user)---SQL is not worked properly !");
		}
		return null;
	}
	public void createAccount(int id, String username, String email) {
		try {
			repository.createAccount(id, username, email);
		} catch (ClassNotFoundException e) {
			System.err.println("(By user)---Can not file this file !");
		} catch (SQLException e) {
			System.err.println("(By user)---SQL is not worked properly !");
		}
	}
	public Account getAccountById(int id) {
		try {
			return repository.getAccountById(id);
		} catch (ClassNotFoundException e) {
			System.err.println("(By user)---Can not file this file !");
		} catch (SQLException e) {
			System.err.println("(By user)---SQL is not worked properly !");
		}
		return null;
	}
	public boolean isAccountExists(String username) {
		try {
			return repository.isAccountExists(username);
		} catch (ClassNotFoundException e) {
			System.err.println("(By user)---Can not file this file !");
		} catch (SQLException e) {
			System.err.println("(By user)---SQL is not worked properly !");
		}
		return false;
	}
	public void updateAccountByID(int id, String newUsername, String newEmail) {
		try {
			repository.updateAccountByID(id, newUsername, newEmail);
		} catch (ClassNotFoundException e) {
			System.err.println("(By user)---Can not file this file !");
		} catch (SQLException e) {
			System.err.println("(By user)---SQL is not worked properly !");
		}
		
	}
	public void deleteAccount(int id) {
		try {
			repository.deleteAccount(id);
		} catch (ClassNotFoundException e) {
			System.err.println("(By user)---Can not file this file !");
		} catch (SQLException e) {
			System.err.println("(By user)---SQL is not worked properly !");
		}
		
	}
	public boolean isAccountExistsById(int id) {
			try {
				return repository.isAccountExistsById(id);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
	}
}
