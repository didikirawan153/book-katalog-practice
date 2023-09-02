package com.latihandidik.service;

import com.latihandidik.domain.dto.BookDetailDto;

public interface BookService {
	public BookDetailDto findBookById(Long id);
}
