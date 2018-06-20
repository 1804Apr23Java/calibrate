package com.revature.util;

import java.util.List;

public class QuizParameters {

	private String name;
	private List<Integer> libraryIds;
	private int numQuestions;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getLibraryIds() {
		return libraryIds;
	}
	public void setLibraryIds(List<Integer> libraryIds) {
		this.libraryIds = libraryIds;
	}
	public int getNumQuestions() {
		return numQuestions;
	}
	public void setNumQuestions(int numQuestions) {
		this.numQuestions = numQuestions;
	}
}
