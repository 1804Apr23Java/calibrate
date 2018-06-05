package com.revature.json;

import java.util.List;

import com.revature.beans.Status;

public class LibraryJSON {
	
	private int libraryId;
	private String name;
	private Status status;
	private int accountId;
	private List<QuestionJSON> questions;
	
	public LibraryJSON(int libraryId, String name, Status status, int accountId, List<QuestionJSON> questions) {
		super();
		this.libraryId = libraryId;
		this.name = name;
		this.status = status;
		this.accountId = accountId;
		this.questions = questions;
	}

	public LibraryJSON() {
		super();
	}

	public int getLibraryId() {
		return libraryId;
	}

	public void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public List<QuestionJSON> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuestionJSON> questions) {
		this.questions = questions;
	}

}
