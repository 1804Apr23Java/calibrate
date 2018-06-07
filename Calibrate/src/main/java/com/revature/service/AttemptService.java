package com.revature.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Account;
import com.revature.beans.Answer;
import com.revature.beans.Attempt;
import com.revature.beans.Quiz;
import com.revature.repository.AccountRepository;
import com.revature.repository.AnswerRepository;
import com.revature.repository.AttemptRepository;
import com.revature.repository.QuizRepository;

@Service
public class AttemptService {

	@Autowired
	private AttemptRepository attemptRepository;
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private QuizRepository quizRepository;

	@Autowired
	private AnswerRepository answerRepository;
	
	public Attempt getAttempt(int id) {
		return attemptRepository.getAttempt(id);
	}

	public Attempt addAttempt(Attempt attempt) {
		return attemptRepository.persistAttempt(attempt);
	}
	
	public List<Attempt> getAttemptByAccount(int accountId) {
		return attemptRepository.getAttemptByAccount(accountId);
	}
	
	public Attempt addAttempt(int accountId, int quizId, List<Integer> answerIds) {
		
		Account account = accountRepository.getAccount(accountId);
		Quiz quiz = quizRepository.getQuiz(quizId);
		List <Answer> answers = new ArrayList<Answer>();
		for (int answerId: answerIds)
			answers.add(answerRepository.getAnswer(answerId));
		return attemptRepository.persistAttempt(new Attempt(account, quiz, new HashSet<Answer>(answers)));
	}
}
