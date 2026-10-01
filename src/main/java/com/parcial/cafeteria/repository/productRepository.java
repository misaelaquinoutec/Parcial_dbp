package com.parcial.cafeteria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parcial.cafeteria.entity.Product;

public interface productRepository extends JpaRepository<Product,Long>{

}
