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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + difficulty;
		result = prime * result + id;
		result = prime * result + ((library == null) ? 0 : library.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Question other = (Question) obj;
		if (difficulty != other.difficulty)
			return false;
		if (id != other.id)
			return false;
		if (library == null) {
			if (other.library != null)
				return false;
		} else if (!library.equals(other.library))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	
	

}
