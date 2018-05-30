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
@Table(name = "LIBRARY")
public class Library {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "librarySequence")
	@SequenceGenerator(allocationSize = 1, name = "librarySequence", sequenceName = "SQ_LIBRARY_PK")
	@Column(name = "LIBRARY_ID")
	private int id;

	@Column(name = "NAME", nullable=false)
	private String name;

	@Column(name = "STATUS", nullable=false)
	private Status status;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ACCOUNT_ID", nullable=false, foreignKey=@ForeignKey(name = "FK_LIBRARY_ACCOUNT"))
	private Account account;

	public Library(int id, String name, Status status, Account account) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.account = account;
	}

	public Library(String name, Status status, Account account) {
		super();
		this.name = name;
		this.status = status;
		this.account = account;
	}

	public Library() {
		super();
	}

	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + ", status=" + status + ", user=" + account + "]";
	}
}
