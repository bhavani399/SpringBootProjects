package com.book.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.demo.entity.BookEntity;
import com.book.demo.service.BookService;

@RestController
public class BookController {     
	
	@Autowired
	BookService bookService;

	@PostMapping(value = "addInfo")   //create
	public String addInfo(@RequestBody BookEntity bookEntity) {
		return bookService.addInfo(bookEntity);
	}
	
	@PutMapping(value = "/update")
	public String updateData(@RequestBody BookEntity bookEntity) {
		return bookService.updateData(bookEntity);
		 
	}
	@GetMapping(value = "get/{id}")
	public BookEntity getInfo(@PathVariable int id) {
		return bookService.getInfo(id);
	}
	@GetMapping(value ="displayAll")
	public List<BookEntity> getAll(){
		return bookService.getAll();
	}
	
	@PostMapping(value="/bulkData")
	public String addBulkData(@RequestBody List<BookEntity> bookEntity) {
		return bookService.addBulkData(bookEntity);
	}
	
	@DeleteMapping(value ="/delete/{id}")
	public String deleteId(@PathVariable int id) {
		return bookService.addBulkData(id);
	}
	
}
