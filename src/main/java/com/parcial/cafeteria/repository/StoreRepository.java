package com.parcial.cafeteria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parcial.cafeteria.entity.Store;

public interface StoreRepository extends JpaRepository<Store,Long> {

}
