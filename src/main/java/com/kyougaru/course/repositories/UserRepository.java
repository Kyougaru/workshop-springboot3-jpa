package com.kyougaru.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kyougaru.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
