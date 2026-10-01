package com.parcial.cafeteria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parcial.cafeteria.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
