package com.product.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.demo.entity.ProductEntity;
import com.product.demo.repo.ProductRepo;

import ch.qos.logback.classic.Logger;
import lombok.extern.slf4j.Slf4j;

@RestController
public class ProductController {
	
@Autowired

ProductRepo productRepo;


Logger logger;

@GetMapping(value = "/show")
public List<ProductEntity>getAll(){

	return productRepo.findAll();
}

}
