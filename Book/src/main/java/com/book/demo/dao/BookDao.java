package com.book.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.book.demo.entity.BookEntity;
import com.book.demo.repo.BookRepo;

@Repository
public class BookDao {
	
	@Autowired
	BookRepo bookRepo;

	public String addInfo(BookEntity bookEntity) {
		bookRepo.save(bookEntity);
		return "Data added to the DB";
	}

	public String updateData(BookEntity bookEntity) {
		bookRepo.save(bookEntity);
		return "Data updated in the DB";
	}
 
	public BookEntity getInfo(int id) {
		return bookRepo.findById(id).get();
	}

	public List<BookEntity> getAll() {
	
		return bookRepo.findAll();
	}

	public String addBulkData(List<BookEntity> bookEntity) {
		bookRepo.saveAll(bookEntity);
		return "Bulk Data added to the DB";
	}

	public String addBulkData(int id) {
		bookRepo.deleteById(id);
		return "Data Delated from the DB";
	}

}
