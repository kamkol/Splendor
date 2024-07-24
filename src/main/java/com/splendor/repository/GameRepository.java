package com.splendor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.splendor.entity.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

	
	
}
