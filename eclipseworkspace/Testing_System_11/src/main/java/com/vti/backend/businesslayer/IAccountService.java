package com.vti.backend.businesslayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Account;

public interface IAccountService {
	public List<Account> getListAccount();

	public void createAccount(int id, String username, String email);

	public Account getAccountById(int id);

	public boolean isAccountExists(String username);

	public void updateAccountByID(int id, String newUsername, String newEmail);

	public void deleteAccount(int id);

	public boolean isAccountExistsById(int id);
}