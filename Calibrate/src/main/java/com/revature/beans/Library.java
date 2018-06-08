package com.revature.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "LIBRARY")
public class Library {

	private int id;
	private String name;
	private Status status;
	private Account account;
	private Set<Question> questions;
	
	public Library(int id, String name, Status status, Account account, Set<Question> questions) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.account = account;
		this.questions = questions;
	}

	public Library(String name, Status status, Account account, Set<Question> questions) {
		super();
		this.name = name;
		this.status = status;
		this.account = account;
		this.questions = questions;
	}

	public Library(int id, String name, Status status, Account account) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.account = account;
		this.questions = new HashSet<Question>();
	}

	public Library(String name, Status status, Account account) {
		super();
		this.name = name;
		this.status = status;
		this.account = account;
		this.questions = new HashSet<Question>();
	}

	
	public Library() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "librarySequence")
	@SequenceGenerator(allocationSize = 1, name = "librarySequence", sequenceName = "SQ_LIBRARY_PK")
	@Column(name = "LIBRARY_ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "NAME", nullable=false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "STATUS", nullable=false)
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ACCOUNT_ID", nullable=false, foreignKey=@ForeignKey(name = "FK_LIBRARY_ACCOUNT"))
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	@OneToMany(targetEntity=Question.class, mappedBy="library", fetch = FetchType.EAGER)
	public Set<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + ", status=" + status + ", account=" + account + "]";
	}	
}
