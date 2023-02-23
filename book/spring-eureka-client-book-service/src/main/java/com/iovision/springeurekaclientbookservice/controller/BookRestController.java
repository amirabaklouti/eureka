package com.iovision.springeurekaclientbookservice.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iovision.bookservice.models.Book;
import com.iovision.bookservice.services.BookService;

@RestController
@RequestMapping(BookService.REQUEST_ROOT)
public class BookRestController implements BookService {

	@Autowired
	Environment environment;

	public String getBookData() {

		return "data of BOOK-SERVICE, Running on port: " + environment.getProperty("local.server.port");
	}


	public Book getBookById(@PathVariable Integer id) {
		return new Book(id, "Head First Java", 500.75);
	}

	public List<Book> getAllBooks() {
		return List.of(new Book(501, "Head First Java", 439.75), new Book(502, "Spring in Action", 340.75),
				new Book(503, "Hibernate in Action", 355.75));
	}

	public ResponseEntity<String> getEntityData() {
		return new ResponseEntity<String>("Hello from BookRestController", HttpStatus.OK);
	}


}