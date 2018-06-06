package com.revature.test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.revature.beans.Account;
import com.revature.repository.AccountRepository;
import com.revature.service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:beans.xml"})
public class AccountTest {
	
	@Autowired
	private AccountRepository ar;
	
	@Autowired
	private AccountService as;

	@Test
	public void testAddAccount() {
		Account account = new Account("type","ete","sfe",false);
		Account persistedAccount = as.addAccount(account);
		assertNotNull(persistedAccount);
	}
	
	@Test
	public void testAddAccountWithDuplicateEmail() {
		Account account = new Account("ewrewj", "ewrwerwe", "sfe", false);
		Account persistedAccount = as.addAccount(account);
		assertNotNull(persistedAccount);
	}
	
	@Test
	public void testGetFakeAccount() {
		assertNull(ar.getAccount(-1));
	}
	
	@Test
	public void testGetRealAccount() {
		Account account = new Account("name2","name3","name4",false);
		as.addAccount(account);
		Account realAccount = ar.getAccount(account.getId());
		assertNotNull(realAccount);
	}
	
	@Test
	public void testUpdateFakeUsername() {
		Account fakeAccount = ar.updateUsername(100, "collinmeaney399@gmail.com");
		assertNull(fakeAccount);
	}
	
	@Test
	public void testUpdateRealUsername() {
		Account account = new Account("","","",false);
		as.addAccount(account);
		Account realAccount = ar.updateUsername(1, "collinmeaney399@gmail.com");
		assertNotNull(realAccount);
	}
	
	@Test
	public void testUpdateRepeatedUsername() {
		Account account = new Account("12", "23", "testemail", false);
		Account account2 = new Account("13", "24", "testemail2", false);
		as.addAccount(account);
		as.addAccount(account2);
		assertNull(ar.updateUsername(account2.getId(), "testemail"));
	}
}
