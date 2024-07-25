package com.splendor.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.splendor.entity.Game;
import com.splendor.entity.Player;

public interface GameRepository extends JpaRepository<Game, Long>{

	void startNewGame();
	
	List<Player> findAllPlayers();
}
