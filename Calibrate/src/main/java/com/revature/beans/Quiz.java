package com.revature.beans;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "QUIZ")
public class Quiz {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "quizSequence")
	@SequenceGenerator(allocationSize = 1, name = "quizSequence", sequenceName = "SQ_QUIZ_PK")
	@Column(name = "QUIZ_ID")
	private int id;

	@Column(name = "NAME", nullable = false)
	private String name;

	@ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinTable(name = "QUIZ_QUESTION", 
				joinColumns = @JoinColumn(name = "QUIZ_ID", referencedColumnName = "QUIZ_ID"),
				inverseJoinColumns = @JoinColumn(name = "QUESTION_ID", referencedColumnName = "QUESTION_ID"))
	private Set<Question> questions;
	
	public Quiz(int id, String name, Set<Question> questions) {
		super();
		this.id = id;
		this.name = name;
		this.questions = questions;
	}

	public Quiz(String name, Set<Question> questions) {
		super();
		this.name = name;
		this.questions = questions;
	}

	public Quiz() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "Quiz [id=" + id + ", name=" + name + ", questions=" + questions + "]";
	}


}
