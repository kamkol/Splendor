package com.splendor.repository;

import java.util.List;

import com.splendor.entity.Player;

public interface GameRepository{

	void startNewGame();
	
	List<Player> findAllPlayers();
}
