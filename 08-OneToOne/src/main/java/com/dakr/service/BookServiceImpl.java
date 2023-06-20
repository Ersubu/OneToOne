package com.dakr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dakr.model.Book;
import com.dakr.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;
    
    
    public Book saveBook(Book book) {
		
	return bookRepository.save(book);
       
    }
    public Book findByBookId(Integer bookId) {
        Book book = bookRepository.findById(bookId).get();
        return book;
    }
}
