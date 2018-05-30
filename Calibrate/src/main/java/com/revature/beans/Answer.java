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

@Entity
@Table(name = "ANSWER")
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "answerSequence")
	@SequenceGenerator(allocationSize = 1, name = "answerSequence", sequenceName = "SQ_ANSWER_PK")
	@Column(name = "ANSWER_ID")
	private int id;

	@Column(name = "VALUE", nullable = false)
	private String value;

	@Column(name = "ISCORRECT", nullable = false)
	private boolean isCorrect;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "QUESTION_ID", nullable = false, foreignKey=@ForeignKey(name = "FK_ANSWER_QUESTION"))
	private Question question;

	public Answer(int id, String value, boolean isCorrect, Question question) {
		super();
		this.id = id;
		this.value = value;
		this.isCorrect = isCorrect;
		this.question = question;
	}

	public Answer(String value, boolean isCorrect, Question question) {
		super();
		this.value = value;
		this.isCorrect = isCorrect;
		this.question = question;
	}

	public Answer() {
		super();
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", value=" + value + ", isCorrect=" + isCorrect + ", question=" + question + "]";
	}
}
