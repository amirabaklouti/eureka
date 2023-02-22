package com.iovision.bookservice.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.iovision.bookservice.models.Book;

public interface BookRestConsumerService {
	
	public Integer getId();

	public String getBookData();

	public Book getBookById(Integer id);

	public List<Book> getAllBooks();

	public ResponseEntity<String> getEntityData();
}
