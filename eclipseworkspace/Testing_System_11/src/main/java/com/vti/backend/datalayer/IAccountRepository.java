package com.vti.backend.datalayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Account;

public interface IAccountRepository {
	public List<Account> getListAccount() throws ClassNotFoundException, SQLException;

	public void createAccount(int id, String username, String email) throws ClassNotFoundException, SQLException;

	public Account getAccountById(int id) throws ClassNotFoundException, SQLException;

	public boolean isAccountExists(String username) throws ClassNotFoundException, SQLException;

	public void updateAccountByID(int id, String newUsername, String newEmail) throws SQLException, ClassNotFoundException;

	public void deleteAccount(int id) throws ClassNotFoundException, SQLException;

	public boolean isAccountExistsById(int id) throws SQLException, ClassNotFoundException;

}
