package com.mongo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.model.book;
import com.mongo.repository.BookRepository;

@RestController
public class BookController {

	@Autowired
	private BookRepository bookRepository;
	
	@PostMapping("/addBook")
	public String saveBook(@RequestBody book b)
	{
	bookRepository.save(b);
	return "Added book with id: " + b.getId();
	}
	
	@GetMapping("/findAllBooks")
	public List<book> getBooks()
	{
		return bookRepository.findAll();
	}
	
	@GetMapping("/findAllBooks/{id}")
	public Optional<book> getBook(@PathVariable int id)
	{
		return bookRepository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id)
	{
		bookRepository.deleteById(id);
		return "Deleted book with id:"+id;
	}
}
