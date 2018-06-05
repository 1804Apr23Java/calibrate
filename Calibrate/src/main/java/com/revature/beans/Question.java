package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "QUESTION")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "questionSequence")
	@SequenceGenerator(allocationSize = 1, name = "questionSequence", sequenceName = "SQ_QUESTION_PK")
	@Column(name = "QUESTION_ID")
	private int id;

	@Column(name = "VALUE", nullable = false)
	private String value;

	@Column(name = "DIFFICULTY", nullable = false)
	private int difficulty;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "LIBRARY_ID", nullable = true, foreignKey = @ForeignKey(name = "FK_QUESTION_LIBRARY"))
	private Library library;

	public Question(int id, String value, int difficulty, Library library) {
		super();
		this.id = id;
		this.value = value;
		this.difficulty = difficulty;
		this.library = library;
	}

	public Question(String value, int difficulty, Library library) {
		super();
		this.value = value;
		this.difficulty = difficulty;
		this.library = library;
	}

	public Question() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", value=" + value + ", difficulty=" + difficulty + ", library=" + library + "]";
	}

}
