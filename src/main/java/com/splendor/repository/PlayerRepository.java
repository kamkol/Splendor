package com.splendor.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.splendor.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Long>{

	
}
