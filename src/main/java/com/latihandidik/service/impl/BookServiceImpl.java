package com.latihandidik.service.impl;

import com.latihandidik.domain.Author;
import com.latihandidik.domain.Book;
import com.latihandidik.domain.dto.BookDetailDto;
import com.latihandidik.repository.BookRepository;
import com.latihandidik.service.BookService;

public class BookServiceImpl implements BookService{
	//Pendekatan tradisional dependencies injection
	private Book book;
	
	private BookRepository bookRepository;
	

	public BookServiceImpl(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	@Override
	public BookDetailDto findBookById(Long id) {
		Book book = bookRepository.findBookById(id);
		BookDetailDto dto = new BookDetailDto();
		dto.setBookId(book.getId());
		dto.setBookTitle(book.getTitle());
		dto.setDescription(book.getDescription());
		dto.setAuthorName(book.getAuthor().getName());
		return dto;
	}

//	public BookRepository getBookRepository() {
//		return bookRepository;
//	}
//
//	public void setBookRepository(BookRepository bookRepository) {
//		this.bookRepository = bookRepository;
//	}
	
	
	
}
