package com.dakr.service;

import com.dakr.model.Book;

public interface BookService {

	Book saveBook(Book book);

	Book findByBookId(Integer bookId);

}
