package com.revature.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:beans.xml" })
public class AccountTest {

	
	/*
	@Autowired
	private AccountService as;
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();

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

	@Test(expected=AccountNotFoundException.class)
	public void testGetFakeAccount() {
		assertNull(as.getAccount(-1));
	}

	@Test
	public void testGetRealAccount() {
		Account account = as.addAccount(new Account("user1004", "pass1004", "email1004", false));
		Account realAccount = as.getAccount(account.getId());
		assertNotNull(realAccount);
	}

	@Test(expected=AccountNotFoundException.class)
	public void testUpdateFakeUsername() {
		as.updateUsername(-1, "collinmeaney399@gmail.com");
	}

	@Test
	public void testUpdateRealUsername() {
		Account account = as.addAccount(new Account("user1005", "pass1005", "email1005", false));
		account = as.updateUsername(account.getId(), "collinmeaney399");
		assertEquals("collinmeaney399", as.getAccount(account.getId()).getUsername());
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

	@Test(expected=InvalidLoginException.class)
	public void testLoginWithFakeLogin() {
		as.login("email1007", "pass1007");
	}

	@Test(expected=InvalidLoginException.class)
	public void testLoginWithWrongPassword() {
		as.addAccount(new Account("user1008", "pass1008", "email1008", false));
		as.login("email1008", "pass1009");
	}
	
	*/
}
