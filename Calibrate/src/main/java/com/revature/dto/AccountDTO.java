package com.revature.dto;

import com.revature.beans.Account;

public class AccountDTO {

	private int accountId;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private boolean isAdmin;
	private boolean isActive;
	
	public AccountDTO(int accountId, String email, String password, String firstName, String lastName, boolean isAdmin,
			boolean isActive) {
		super();
		this.accountId = accountId;
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.isAdmin = isAdmin;
		this.isActive = isActive;
	}
	
	public AccountDTO(Account account) {
		super();
		this.accountId = account.getId();
		this.email = account.getEmail();
		this.password = account.getPassword();
		this.firstName = account.getFirstName();
		this.lastName = account.getLastName();
		this.isAdmin = account.getIsAdmin();
		this.isActive = account.getIsActive();
	}

	public AccountDTO() {
		super();
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

}
