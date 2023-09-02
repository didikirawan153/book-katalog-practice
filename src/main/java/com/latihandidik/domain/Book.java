package com.latihandidik.domain;

import java.io.Serializable;

public class Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3358236346711788308L;

//	private Author author = new Author(); -> Ini adalah hardcode metod.
	private Long id;

	private String title;

	private String Description;

	// Implementasi Dependencies Injection
	private Author author;

	// Constructor
	public Book(Author author) {
		super();
		this.author = author;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

}
