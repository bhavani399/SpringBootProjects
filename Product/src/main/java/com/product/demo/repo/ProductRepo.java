package com.product.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.demo.entity.ProductEntity;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer>{

}
