package com.revature.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.revature.beans.Answer;
import com.revature.beans.Attempt;
import com.revature.beans.Library;
import com.revature.beans.Question;
import com.revature.beans.Quiz;
import com.revature.dto.AnswerDTO;
import com.revature.dto.AttemptDTO;
import com.revature.dto.LibraryDTO;
import com.revature.dto.QuestionDTO;
import com.revature.dto.QuizDTO;

@Component
public class BeanToJSONUtil {

	public AnswerDTO answerToJSON(Answer answer) {
		if (answer == null)
			return null;
		return new AnswerDTO(answer.getId(), answer.getIsCorrect(), answer.getValue(), answer.getQuestion().getId(),
				false);
	}

	public List<AnswerDTO> answersToJSON(List<Answer> answers) {
		if (answers == null)
			return null;
		return answers.stream().map(this::answerToJSON).collect(Collectors.toList());
	}

	/*public AccountDTO accountToJSON(Account account) {
		if (account == null)
			return null;
		return new AccountDTO(account.getId(), account.getEmail(), account.getIsAdmin(), account.getPassword(),
				account.getUsername());
	}*/

	/*public List<AccountDTO> accountsToJSON(List<Account> accounts) {
		return accounts.stream().map(this::accountToJSON).collect(Collectors.toList());
	}*/

	/*
	 * public QuizJSON attemptToJSON(Attempt attempt) {
	 * 
	 * if (attempt == null) return null;
	 * 
	 * List<AnswerJSON> answers = answersToJSON(new
	 * ArrayList<Answer>(attempt.getAnswers())); List<QuestionJSON> questions =
	 * questionsToJSON(new ArrayList<Question>(attempt.getQuiz().getQuestions()));
	 * 
	 * for (QuestionJSON question : questions) { for (AnswerJSON answer :
	 * question.getAnswers()) { if (answers.contains(answer)) {
	 * answer.setIsSelected(true); } } } return new
	 * QuizJSON(attempt.getQuiz().getId(), attempt.getQuiz().getName(), questions);
	 * }
	 */

	/*
	 * private int quizId; private String name; private List<QuestionJSON>
	 * questions; private Date createdDate; private int numberOfQuestions; private
	 * int numCorrect;
	 * 
	public AttemptJSON(int quizId, String name, List<QuestionJSON> questions, Date createdDate, int numberOfQuestions,
			int numCorrect)
	 */

	public AttemptDTO attemptToJSON(Attempt attempt) {
		if (attempt == null)
			return null;
		int quizId = attempt.getQuiz().getId();
		String name = attempt.getQuiz().getName();
		Date createdDate = attempt.getCreatedDate();
		List<Question> questions = new ArrayList<Question>(attempt.getQuiz().getQuestions());
		int numberOfQuestions = questions.size();
		int numCorrect = 0;
		for (Question question : questions) {
			List<Integer> correctAnswers = question.getAnswers().stream().filter(answer -> answer.getIsCorrect()).map(answer -> answer.getId())
					.collect(Collectors.toList());
			List<Integer> chosenAnswers = attempt.getAnswers().stream()
					.filter(answer -> answer.getQuestion().getId() == (question.getId())).map(answer -> answer.getId()).collect(Collectors.toList());
			if (correctAnswers.equals(chosenAnswers))
				numCorrect++;
		}

		return new AttemptDTO(quizId, name, questionsToJSON(questions), createdDate, numberOfQuestions, numCorrect);
	}

	/*
	 * public List<QuizJSON> attemptsToJSON(List<Attempt> attempts) { return
	 * attempts.stream().map(this::attemptToJSON).collect(Collectors.toList()); }
	 */
	public List<AttemptDTO> attemptsToJSON(List<Attempt> attempts) {
		return attempts.stream().map(this::attemptToJSON).collect(Collectors.toList());
	}
	public QuizDTO attemptToJSONNoQuestions(Attempt attempt) {
		return new QuizDTO(attempt.getQuiz().getId(), attempt.getQuiz().getName(), null);
	}

	public List<QuizDTO> attemptsToJSONNoQuestions(List<Attempt> attempts) {
		return attempts.stream().map(this::attemptToJSONNoQuestions).collect(Collectors.toList());
	}

	public QuestionDTO questionToJSON(Question question) {
		if (question == null)
			return null;
		List<AnswerDTO> answers = answersToJSON(new ArrayList<Answer>(question.getAnswers()));
		return new QuestionDTO(question.getId(), question.getDifficulty(), question.getValue(),
				question.getLibrary().getId(), answers);
	}

	public List<QuestionDTO> questionsToJSON(List<Question> questions) {
		return questions.stream().map(this::questionToJSON).collect(Collectors.toList());
	}

	public LibraryDTO libraryToJSON(Library library) {
		if (library == null)
			return null;
		List<QuestionDTO> questions = questionsToJSON(new ArrayList<Question>(library.getQuestions()));
		return new LibraryDTO(library.getId(), library.getName(), library.getStatus(), library.getAccount().getId(),
				questions);
	}

	/*
	public List<LibraryDTO> librariesToJSON(List<Library> libraries) {
		return libraries.stream().map(this::libraryToJSON).collect(Collectors.toList());
	}
	*/

	public QuizDTO quizToJSON(Quiz quiz) {
		if (quiz == null)
			return null;
		List<Question> questions = new ArrayList<Question>(quiz.getQuestions());
		return new QuizDTO(quiz.getId(), quiz.getName(), questionsToJSON(questions));
	}

	public List<QuizDTO> quizzesToJSON(List<Quiz> quizzes) {
		return quizzes.stream().map(this::quizToJSON).collect(Collectors.toList());
	}

}
