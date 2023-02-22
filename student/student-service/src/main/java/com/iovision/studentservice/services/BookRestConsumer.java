package com.iovision.studentservice.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.iovision.bookservice.models.Book;
import com.iovision.bookservice.services.BookRestConsumerService;

@FeignClient(name = "spring-cloud-eureka-client-book-service")
public interface BookRestConsumer extends BookRestConsumerServiceImpl {

	@GetMapping("/book/data")
	public String getBookData();

	@GetMapping("/book/{id}")
	public Book getBookById(@PathVariable Integer id);

	@GetMapping("/book/all")
	public List<Book> getAllBooks();

	@GetMapping("/book/entity")
	public ResponseEntity<String> getEntityData();
}