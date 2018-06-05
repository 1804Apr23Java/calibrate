package com.revature.json;

import java.util.List;

public class QuestionJSON {

	private int questionId;
	private int difficulty;
	private String value;
	private int libraryId;
	private List<AnswerJSON> answers;
	
	public QuestionJSON(int questionId, int difficulty, String value, int libraryId, List<AnswerJSON> answers) {
		super();
		this.questionId = questionId;
		this.difficulty = difficulty;
		this.value = value;
		this.libraryId = libraryId;
		this.answers = answers;
	}
	
	public QuestionJSON() {
		super();
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getLibraryId() {
		return libraryId;
	}

	public void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}

	public List<AnswerJSON> getAnswers() {
		return answers;
	}

	public void setAnswers(List<AnswerJSON> answers) {
		this.answers = answers;
	}
	
}
