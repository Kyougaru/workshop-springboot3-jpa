package com.kyougaru.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kyougaru.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
