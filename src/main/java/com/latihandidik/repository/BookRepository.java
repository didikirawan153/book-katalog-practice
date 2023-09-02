package com.latihandidik.repository;

import com.latihandidik.domain.Book;

public interface BookRepository {
	public Book findBookById(Long id);
}
