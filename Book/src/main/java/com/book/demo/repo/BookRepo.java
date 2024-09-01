package com.book.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.demo.entity.BookEntity;

public interface BookRepo extends JpaRepository<BookEntity, Integer>{

}
