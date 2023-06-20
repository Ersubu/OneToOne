package com.dakr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dakr.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
