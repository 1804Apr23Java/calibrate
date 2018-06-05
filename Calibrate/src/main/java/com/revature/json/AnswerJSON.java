package com.revature.json;

public class AnswerJSON {
	
	public int answerId;
	public boolean isCorrect;
	public String value;
	public int questionId;
	public boolean isSelected;
	
	public AnswerJSON(int answerId, boolean isCorrect, String value, int questionId, boolean isSelected) {
		super();
		this.answerId = answerId;
		this.isCorrect = isCorrect;
		this.value = value;
		this.questionId = questionId;
		this.isSelected = isSelected;
	}
	
	public AnswerJSON() {
		super();
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}
	
	
}
