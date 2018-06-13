package com.revature.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.revature.beans.Answer;
import com.revature.beans.Question;

public class QuestionDTO {

	private int questionId;
	private int difficulty;
	private String value;
	private int libraryId;
	private List<AnswerDTO> answers;
	
	public QuestionDTO(int questionId, int difficulty, String value, int libraryId, List<AnswerDTO> answers) {
		super();
		this.questionId = questionId;
		this.difficulty = difficulty;
		this.value = value;
		this.libraryId = libraryId;
		this.answers = answers;
	}
	
	public QuestionDTO(Question question) {
		super();
		this.questionId = question.getId();
		this.difficulty = question.getDifficulty();
		this.value = question.getValue();
		this.libraryId = question.getLibrary().getId();
		this.answers = new ArrayList<Answer>(question.getAnswers()).stream().map(AnswerDTO::new).collect(Collectors.toList());
	}
	
	public QuestionDTO() {
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

	public List<AnswerDTO> getAnswers() {
		return answers;
	}

	public void setAnswers(List<AnswerDTO> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "QuestionJSON [questionId=" + questionId + ", difficulty=" + difficulty + ", value=" + value
				+ ", libraryId=" + libraryId + ", answers=" + answers + "]";
	}
}
