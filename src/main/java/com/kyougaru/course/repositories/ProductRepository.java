package com.kyougaru.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kyougaru.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
