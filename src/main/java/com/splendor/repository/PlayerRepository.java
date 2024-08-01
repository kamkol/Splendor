package com.splendor.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.splendor.entity.Player;

import jakarta.persistence.EntityManager;

public interface PlayerRepository extends JpaRepository<Player, Long>{

	
}