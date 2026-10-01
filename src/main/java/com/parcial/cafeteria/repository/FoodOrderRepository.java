package com.parcial.cafeteria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parcial.cafeteria.entity.FoodOrder;

public interface FoodOrderRepository extends JpaRepository<FoodOrder,Long>{

}
