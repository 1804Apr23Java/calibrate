package com.revature.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.revature.beans.Account;
import com.revature.service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:beans.xml" })
public class AccountTest {

	@Autowired
	private AccountService as;

	@Test
	public void testAddAccount() {
		Account account = as.addAccount(new Account("user1001", "pass1001", "email1001", false));
		assertNotNull(account);
	}

	@Test(expected=DataIntegrityViolationException.class)
	public void testAddAccountWithDuplicateEmail() {
		as.addAccount(new Account("user1002", "pass1002", "dupEmail", false));
		as.addAccount(new Account("user1003", "pass1003", "dupEmail", false));
	}

	@Test
	public void testGetFakeAccount() {
		assertNull(as.getAccount(-1));
	}

	@Test
	public void testGetRealAccount() {
		Account account = as.addAccount(new Account("user1004", "pass1004", "email1004", false));
		Account realAccount = as.getAccount(account.getId());
		assertNotNull(realAccount);
	}

	@Test
	public void testUpdateFakeUsername() {
		Account fakeAccount = as.updateUsername(-1, "collinmeaney399@gmail.com");
		assertNull(fakeAccount);
	}

	@Test
	public void testUpdateRealUsername() {
		Account account = as.addAccount(new Account("user1005", "pass1005", "email1005", false));
		Account realAccount = as.updateUsername(account.getId(), "collinmeaney399@gmail.com");
		assertNotNull(realAccount);
	}

	// @Test
	// public void testUpdateRepeatedUsername() {
	// Account account = new Account("12", "23", "testemail", false);
	// Account account2 = new Account("13", "24", "testemail2", false);
	// as.addAccount(account);
	// as.addAccount(account2);
	// assertNull(ar.updateUsername(account2.getId(), "testemail"));
	// }

	@Test
	public void testLoginWithRealLogin() {
		as.addAccount(new Account("user1006", "pass1006", "email1006", false));
		Account loginAccount = as.login("email1006", "pass1006");
		assertNotNull(loginAccount);
	}

	@Test
	public void testLoginWithFakeLogin() {
		Account fakeAccount = as.login("email1007", "pass1007");
		assertNull(fakeAccount);
	}

	@Test
	public void testLoginWithWrongPassword() {
		as.addAccount(new Account("user1008", "pass1008", "email1008", false));
		Account fakeAccount = as.login("email1008", "pass1009");
		assertNull(fakeAccount);
	}
}
