package com.revature.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.beans.Account;
import com.revature.beans.Answer;
import com.revature.beans.Attempt;
import com.revature.beans.Library;
import com.revature.beans.Question;
import com.revature.beans.Quiz;
import com.revature.json.AccountJSON;
import com.revature.json.AnswerJSON;
import com.revature.json.LibraryJSON;
import com.revature.json.QuestionJSON;
import com.revature.json.QuizJSON;
import com.revature.repository.AnswerRepository;
import com.revature.repository.QuestionRepository;

@Component
public class BeanToJSONUtil {

	@Autowired
	private AnswerRepository answerRepository;
	@Autowired
	private QuestionRepository questionRepository;

	public AnswerJSON answerToJSON(Answer answer) {
		if (answer == null)
			return null;
		return new AnswerJSON(answer.getId(), answer.isCorrect(), answer.getValue(), answer.getQuestion().getId(),
				false);
	}

	public List<AnswerJSON> answersToJSON(List<Answer> answers) {
		if (answers == null)
			return null;
		return answers.stream().map(this::answerToJSON).collect(Collectors.toList());
	}

	public AccountJSON accountToJSON(Account account) {
		if (account == null)
			return null;
		return new AccountJSON(account.getId(), account.getEmail(), account.isAdmin(), account.getPassword(),
				account.getUsername());
	}

	public List<AccountJSON> accountsToJSON(List<Account> accounts) {
		return accounts.stream().map(this::accountToJSON).collect(Collectors.toList());
	}

	/*
	 * private int quizId; private String name; private List<QuestionJSON>
	 * questions;
	 */
	public QuizJSON attemptToJSON(Attempt attempt) {

		if (attempt == null)
			return null;

		List<AnswerJSON> answers = answersToJSON(new ArrayList<Answer>(attempt.getAnswers()));
		List<QuestionJSON> questions = questionsToJSON(new ArrayList<Question>(attempt.getQuiz().getQuestions()));

		for (QuestionJSON question : questions) {
			for (AnswerJSON answer : question.getAnswers()) {
				if (answers.contains(answer)) {
					answer.setIsSelected(true);
				}
			}
		}
		return new QuizJSON(attempt.getQuiz().getId(), attempt.getQuiz().getName(), questions);
	}


	public List<QuizJSON> attemptsToJSON(List<Attempt> attempts) {
		return attempts.stream().map(this::attemptToJSON).collect(Collectors.toList());
	}

	
	public QuizJSON attemptToJSONNoQuestions(Attempt attempt) {
		return new QuizJSON(attempt.getQuiz().getId(), attempt.getQuiz().getName(), null);
	}
	
	public List<QuizJSON> attemptsToJSONNoQuestions(List<Attempt> attempts) {
		return attempts.stream().map(this::attemptToJSONNoQuestions).collect(Collectors.toList());	
	}
	

	public QuestionJSON questionToJSON(Question question) {
		if (question == null)
			return null;
		List<AnswerJSON> answers = answersToJSON(answerRepository.getAnswersByQuestion(question.getId()));
		return new QuestionJSON(question.getId(), question.getDifficulty(), question.getValue(),
				question.getLibrary().getId(), answers);
	}

	public List<QuestionJSON> questionsToJSON(List<Question> questions) {
		return questions.stream().map(this::questionToJSON).collect(Collectors.toList());
	}

	public LibraryJSON libraryToJSON(Library library) {
		if (library == null)
			return null;
		List<QuestionJSON> questions = questionsToJSON(questionRepository.getQuestionsByLibrary(library));
		return new LibraryJSON(library.getId(), library.getName(), library.getStatus(), library.getAccount().getId(),
				questions);
	}

	public List<LibraryJSON> librariesToJSON(List<Library> libraries) {
		return libraries.stream().map(this::libraryToJSON).collect(Collectors.toList());
	}

	public QuizJSON quizToJSON(Quiz quiz) {
		if (quiz == null)
			return null;
		List<Question> questions = new ArrayList<Question>(quiz.getQuestions());
		return new QuizJSON(quiz.getId(), quiz.getName(), questionsToJSON(questions));
	}

	public List<QuizJSON> quizzesToJSON(List<Quiz> quizzes) {
		return quizzes.stream().map(this::quizToJSON).collect(Collectors.toList());
	}

}
