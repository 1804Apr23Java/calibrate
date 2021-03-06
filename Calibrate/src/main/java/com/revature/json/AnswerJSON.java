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

	public boolean getIsCorrect() {
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

	public boolean getIsSelected() {
		return isSelected;
	}

	public void setIsSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	@Override
	public String toString() {
		return "AnswerJSON [answerId=" + answerId + ", isCorrect=" + isCorrect + ", value=" + value + ", questionId="
				+ questionId + ", isSelected=" + isSelected + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + answerId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AnswerJSON other = (AnswerJSON) obj;
		if (answerId != other.answerId)
			return false;
		return true;
	}

	
	
}
