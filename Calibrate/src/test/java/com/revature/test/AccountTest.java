package com.revature.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.revature.repository.AccountRepository;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:beans.xml"})
public class AccountTest {

	@Autowired
	private AccountRepository ar;

	@Test
	public void testAccountRepository() {
		assertNotNull(ar.getAccounts());
	}
	
}
