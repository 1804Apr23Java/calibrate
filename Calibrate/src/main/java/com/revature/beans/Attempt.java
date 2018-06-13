package com.revature.beans;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "ATTEMPT")
public class Attempt {

	private int id;
	private Account account;
	private Quiz quiz;
	private Set<Answer> answers;
	private Date createdDate;

	public Attempt(int id, Account account, Quiz quiz, Set<Answer> answers) {
		super();
		this.id = id;
		this.account = account;
		this.quiz = quiz;
		this.answers = answers;
	}

	public Attempt(Account account, Quiz quiz, Set<Answer> answers) {
		super();
		this.account = account;
		this.quiz = quiz;
		this.answers = answers;
	}

	public Attempt(Account account, Quiz quiz) {
		super();
		this.account = account;
		this.quiz = quiz;
		this.answers = new HashSet<Answer>();
	}
	
	public Attempt() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "attemptSequence")
	@SequenceGenerator(allocationSize = 1, name = "attemptSequence", sequenceName = "SQ_ATTEMPT_PK")
	@Column(name = "ATTEMPT_ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinColumn(name = "ACCOUNT_ID", nullable = false, foreignKey = @ForeignKey(name = "FK_ATTEMPT_ACCOUNT"))
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinColumn(name = "QUIZ_ID", nullable = false, foreignKey = @ForeignKey(name = "FK_ATTEMPT_QUIZ"))
	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinTable(name = "ATTEMPT_ANSWER", joinColumns = @JoinColumn(name = "ATTEMPT_ID", referencedColumnName = "ATTEMPT_ID"), inverseJoinColumns = @JoinColumn(name = "ANSWER_ID", referencedColumnName = "ANSWER_ID"))
	public Set<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(Set<Answer> answers) {
		this.answers = answers;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@Column(name = "CreatedDate", updatable = false)
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "Attempt [id=" + id + ", account=" + account + ", quiz=" + quiz + ", answers=" + answers
				+ ", createdDate=" + createdDate + "]";
	}
}
