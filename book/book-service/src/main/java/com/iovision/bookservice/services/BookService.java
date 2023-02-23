package com.iovision.bookservice.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;

import com.iovision.bookservice.models.Book;

@FeignClient(name = "spring-cloud-eureka-client-book-service")
public interface BookService {
	
	public String getBookData();

	public Book getBookById(Integer id);

	public List<Book> getAllBooks();

	public ResponseEntity<String> getEntityData();
}
