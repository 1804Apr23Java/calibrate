package com.revature.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.revature.beans.Library;
import com.revature.beans.Question;
import com.revature.beans.Status;

public class LibraryDTO {
	
	private int libraryId;
	private String name;
	private Status status;
	private int accountId;
	private List<QuestionDTO> questions;
	
	public LibraryDTO(int libraryId, String name, Status status, int accountId, List<QuestionDTO> questions) {
		super();
		this.libraryId = libraryId;
		this.name = name;
		this.status = status;
		this.accountId = accountId;
		this.questions = questions;
	}
	
	public LibraryDTO(Library library) {
		super();
		this.libraryId = library.getId();
		this.name = library.getName();
		this.status = library.getStatus();
		this.accountId = library.getAccount().getId();
		this.questions = new ArrayList<Question>(library.getQuestions()).stream().map(QuestionDTO::new).collect(Collectors.toList());
	}

	public LibraryDTO() {
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

	public List<QuestionDTO> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuestionDTO> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "LibraryJSON [libraryId=" + libraryId + ", name=" + name + ", status=" + status + ", accountId="
				+ accountId + ", questions=" + questions + "]";
	}
}
