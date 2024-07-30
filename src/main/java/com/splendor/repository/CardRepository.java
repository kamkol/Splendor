package com.splendor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.splendor.entity.Card;

public interface CardRepository extends JpaRepository<Card, Long>{

	
}
