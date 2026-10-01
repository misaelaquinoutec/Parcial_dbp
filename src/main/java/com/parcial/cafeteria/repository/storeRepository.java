package com.parcial.cafeteria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parcial.cafeteria.entity.Store;

public interface storeRepository extends JpaRepository<Store,Long> {

}
