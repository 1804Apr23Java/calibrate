package com.revature.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.revature.beans.Attempt;
import com.revature.beans.Question;

public class AttemptDTO {

	private int quizId;
	private String name;
	private List<QuestionDTO> questions;
	private Date createdDate;
	private int numberOfQuestions;
	private int numCorrect;

	public AttemptDTO(int quizId, String name, List<QuestionDTO> questions, Date createdDate, int numberOfQuestions,
			int numCorrect) {
		super();
		this.quizId = quizId;
		this.name = name;
		this.questions = questions;
		this.createdDate = createdDate;
		this.numberOfQuestions = numberOfQuestions;
		this.numCorrect = numCorrect;
	}

	public AttemptDTO(Attempt attempt) {
		super();
		this.quizId = attempt.getQuiz().getId();
		this.name = attempt.getQuiz().getName();
		this.questions = new ArrayList<Question>(attempt.getQuiz().getQuestions()).stream().map(QuestionDTO::new)
				.collect(Collectors.toList());
		this.createdDate = attempt.getCreatedDate();
		this.numberOfQuestions = this.questions.size();
		this.numCorrect = 0;
		for (QuestionDTO question : this.questions) {
			List<Integer> correctAnswers = question.getAnswers().stream().filter(answer -> answer.getIsCorrect())
					.map(answer -> answer.getAnswerId()).collect(Collectors.toList());
			List<Integer> chosenAnswers = attempt.getAnswers().stream()
					.filter(answer -> answer.getQuestion().getId() == question.getQuestionId())
					.map(answer -> answer.getId()).collect(Collectors.toList());
			Collections.sort(correctAnswers);
			Collections.sort(chosenAnswers);
			if (correctAnswers.equals(chosenAnswers))
				this.numCorrect++;
			for (AnswerDTO answer : question.getAnswers()) {
				if (chosenAnswers.contains(answer.getAnswerId())) {
					answer.setIsSelected(true);
				}
			}
		}
	}

	public AttemptDTO() {
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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public int getNumberOfQuestions() {
		return numberOfQuestions;
	}

	public void setNumberOfQuestions(int numberOfQuestions) {
		this.numberOfQuestions = numberOfQuestions;
	}

	public int getNumCorrect() {
		return numCorrect;
	}

	public void setNumCorrect(int score) {
		this.numCorrect = score;
	}

}
