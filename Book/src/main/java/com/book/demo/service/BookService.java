package com.book.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.demo.dao.BookDao;
import com.book.demo.entity.BookEntity;

@Service
public class BookService {
	
	@Autowired
	BookDao bookDao;

	public String addInfo(BookEntity bookEntity) {

		return bookDao.addInfo(bookEntity);
	}

	public String updateData(BookEntity bookEntity) {
		
		return bookDao.updateData(bookEntity);
	}
	
	public BookEntity getInfo(int id) {
		return bookDao.getInfo(id);
	}

	public List<BookEntity> getAll() {
	
		return bookDao.getAll();
	}

	public String addBulkData(List<BookEntity> bookEntity) {
		
		return bookDao.addBulkData(bookEntity);
	}

	public String addBulkData(int id) {
		
		return bookDao.addBulkData(id);
	}

	
}
