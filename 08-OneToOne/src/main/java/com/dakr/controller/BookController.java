package com.dakr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dakr.model.Book;
import com.dakr.service.BookService;

@RestController

public class BookController {
    @Autowired
    private BookService bookService;
    
    @PostMapping("/save")
    public Book saveBook(@RequestBody Book book) {
        Book book1 = bookService.saveBook(book);
        return book1;
    }
   
    @GetMapping("/getOne/{bookId}")
    
    public Book getBookDetails(@PathVariable int bookId) {
        Book bookResponse = bookService.findByBookId(bookId);
        return bookResponse;
    }
}
