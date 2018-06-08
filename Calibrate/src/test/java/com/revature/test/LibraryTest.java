package com.revature.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.revature.beans.Account;
import com.revature.beans.Library;
import com.revature.beans.Question;
import com.revature.beans.Status;
import com.revature.service.AccountService;
import com.revature.service.LibraryService;
import com.revature.service.QuestionService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:beans.xml" })
public class LibraryTest {

	@Autowired
	LibraryService ls;
	
	@Autowired
	AccountService acs;
	
	@Autowired
	QuestionService qs;
	
	@Test
	public void testAddLibrary() {
		Account account = acs.addAccount(new Account("user7002","pass7002","email7002", false));
		Library library = ls.addLibrary(new Library("library7002", Status.PRIVATE, account));
		assertNotNull(library);
	}
	
	@Test 
	public void testGetRealLibrary() {
		Account account = acs.addAccount(new Account("user7003","pass7003","email7003", false));
		Library library = ls.addLibrary(new Library("library7003", Status.PRIVATE, account));
		assertNotNull(ls.getLibrary(library.getId()));
	}
	
	@Test
	public void testGetFakeLibrary() {
		assertNull(ls.getLibrary(5));
	}
	
	@Test
	public void testGetLibrariesByStatus() {
		assertNotNull(ls.getLibrariesByStatus(Status.PENDING));
	}
	
	@Test
	public void testGetRealLibrariesByAccount() {
		Account account = acs.addAccount(new Account("user7004","pass7004","email7004", false));
		Library library = ls.addLibrary(new Library("library7004", Status.PRIVATE, account));
		assertTrue(ls.getLibrariesByStatus(Status.PRIVATE).size() > 0);
	}
	
	@Test
	public void testFakeLibrariesByAccount() {
		assertEquals(0, ls.getLibrariesByAccount(9999).size());
	}
	
	@Test
	public void testDeleteRealLibrary() {
		Account account = acs.addAccount(new Account("user7005","pass7005","email7005", false));
		Library library = ls.addLibrary(new Library("library7005", Status.PRIVATE, account));
		Question question = qs.addQuestion(new Question("question7005", 1, library));
		assertTrue(ls.deleteLibrary(library.getId()));
		assertNull(qs.getQuestion(question.getId()).getLibrary());
	}
	
	@Test
	public void testDeleteFakeLibrary() {
		assertFalse(ls.deleteLibrary(9999));
	}
	
	@Test
	public void testUpdateRealLibrary() {
		Account account = acs.addAccount(new Account("user7006","pass7006","email7006", false));
		Library library = ls.addLibrary(new Library("library7006", Status.PRIVATE, account));
		assertTrue(ls.updateLibrary(library.getId(), Status.PUBLIC));
	}
	
	@Test
	public void testUpdateFakeLibrary() {
		assertFalse(ls.updateLibrary(9999, Status.PUBLIC));
	}
}
