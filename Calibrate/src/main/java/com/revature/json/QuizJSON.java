package com.revature.json;

import java.util.List;

public class QuizJSON {

	private int quizId;
	private String name;
	private List<QuestionJSON> questions;
	
	public QuizJSON(int quizId, String name, List<QuestionJSON> questions) {
		super();
		this.quizId = quizId;
		this.name = name;
		this.questions = questions;
	}
	
	public QuizJSON() {
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
	
}
