package com.revature.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
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

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Autowired
	private AccountService as;

	@Test
	public void testAddAccount() {
		Account account = as.addAccount(new Account("user1", "pass1", "email1", false));
		assertNotNull(account);
	}

	@Test
	public void testAddAccountWithDuplicateEmail() {
		as.addAccount(new Account("user2", "pass2", "dupEmail", false));
		thrown.expect(DataIntegrityViolationException.class);
		as.addAccount(new Account("user3", "pass3", "dupEmail", false));
	}

	@Test
	public void testGetFakeAccount() {
		assertNull(as.getAccount(-1));
	}

	@Test
	public void testGetRealAccount() {
		Account account = as.addAccount(new Account("user4", "pass4", "email4", false));
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
		Account account = as.addAccount(new Account("user5", "pass5", "email5", false));
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
		as.addAccount(new Account("user6", "pass6", "email6", false));
		Account loginAccount = as.login("email6", "pass6");
		assertNotNull(loginAccount);
	}

	@Test
	public void testLoginWithFakeLogin() {
		Account fakeAccount = as.login("email7", "pass7");
		assertNull(fakeAccount);
	}

	@Test
	public void testLoginWithWrongPassword() {
		as.addAccount(new Account("user8", "pass8", "email8", false));
		Account fakeAccount = as.login("email8", "pass9");
		assertNull(fakeAccount);
	}
}
