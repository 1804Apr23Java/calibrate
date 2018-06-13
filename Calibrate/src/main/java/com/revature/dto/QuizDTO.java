package com.revature.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.revature.beans.Quiz;

public class QuizDTO {

	private int quizId;
	private String name;
	private List<QuestionDTO> questions;

	public QuizDTO(int quizId, String name, List<QuestionDTO> questions) {
		super();
		this.quizId = quizId;
		this.name = name;
		this.questions = questions;
	}

	public QuizDTO(Quiz quiz) {
		super();
		this.quizId = quiz.getId();
		this.name = quiz.getName();
		this.questions = new ArrayList<QuestionDTO>(
				quiz.getQuestions().stream().map(QuestionDTO::new).collect(Collectors.toList()));
	}

	public QuizDTO() {
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

	public List<QuestionDTO> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuestionDTO> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "QuizJSON [quizId=" + quizId + ", name=" + name + ", questions=" + questions + "]";
	}

}
