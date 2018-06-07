package com.revature.json;

import java.util.Date;
import java.util.List;

public class AttemptJSON {

	private int quizId;
	private String name;
	private List<QuestionJSON> questions;
	private Date createdDate;

	public AttemptJSON(int quizId, String name, List<QuestionJSON> questions, Date createdDate) {
		super();
		this.quizId = quizId;
		this.name = name;
		this.questions = questions;
		this.createdDate = createdDate;
	}

	public AttemptJSON() {
		super();
	}

	public int getQuizId() {
		return quizId;
	}

	public void setQuizId(int quizId) {
		this.quizId = quizId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<QuestionJSON> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuestionJSON> questions) {
		this.questions = questions;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
