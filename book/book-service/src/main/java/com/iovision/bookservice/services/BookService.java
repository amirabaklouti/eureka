package com.iovision.bookservice.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iovision.bookservice.models.Book;

@FeignClient(name = "spring-cloud-eureka-client-book-service", path =BookService.REQUEST_ROOT)
public interface BookService {
	
	public static final String REQUEST_ROOT = "/book";
	
	@GetMapping("/data")
	public String getBookData();

	@GetMapping("/{id}")
	public Book getBookById(Integer id);

	@GetMapping("/all")
	public List<Book> getAllBooks();

	@GetMapping("/entity")
	public ResponseEntity<String> getEntityData();
}
