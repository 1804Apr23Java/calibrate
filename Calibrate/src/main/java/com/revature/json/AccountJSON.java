package com.revature.json;

public class AccountJSON {

	private int accountId;
	private String email;
	private boolean isAdmin;
	private String password;
	private String username;
	
	public AccountJSON(int accountId, String email, boolean isAdmin, String password, String username) {
		super();
		this.accountId = accountId;
		this.email = email;
		this.isAdmin = isAdmin;
		this.password = password;
		this.username = username;
	}
	
	public AccountJSON() {
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

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}
