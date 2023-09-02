package com.latihandidik.domain.dto;

import java.io.Serializable;

public class BookDetailDto implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1192399008801233695L;

	private Long bookId;

	private String authorName;

	private String bookTitle;

	private String description;

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "BookDetailDto [bookId=" + bookId + ", authorName=" + authorName + ", bookTitle=" + bookTitle
				+ ", description=" + description + "]";
	}

	
}
