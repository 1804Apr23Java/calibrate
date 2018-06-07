package com.revature.beans;

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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "QUESTION")
public class Question {

	private int id;
	private String value;
	private int difficulty;
	private Library library;
	private Set<Answer> answers;

	public Question(int id, String value, int difficulty, Library library, Set<Answer> answers) {
		super();
		this.id = id;
		this.value = value;
		this.difficulty = difficulty;
		this.library = library;
		this.answers = answers;
	}

	public Question(String value, int difficulty, Library library, Set<Answer> answers) {
		super();
		this.value = value;
		this.difficulty = difficulty;
		this.library = library;
		this.answers = answers;
	}

	public Question() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "questionSequence")
	@SequenceGenerator(allocationSize = 1, name = "questionSequence", sequenceName = "SQ_QUESTION_PK")
	@Column(name = "QUESTION_ID")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "VALUE", nullable = false)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Column(name = "DIFFICULTY", nullable = false)
	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LIBRARY_ID", nullable = true, foreignKey = @ForeignKey(name = "FK_QUESTION_LIBRARY"))
	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}
	
	@OneToMany(targetEntity=Answer.class, cascade = CascadeType.ALL, mappedBy="question", fetch = FetchType.EAGER)
	public Set<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(Set<Answer> answers) {
		this.answers = answers;
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
