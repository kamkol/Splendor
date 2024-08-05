package com.splendor.service;


import java.util.List;

import org.springframework.stereotype.Service;
import com.splendor.entity.Game;
import com.splendor.entity.Player;
import com.splendor.repository.CardRepository;
import com.splendor.repository.GameRepository;
import com.splendor.repository.PlayerRepository;

@Service
public class GameService {
	
	private GameRepository gameRepository;
	private PlayerRepository playerRepository;
	
	
	public GameService(GameRepository gameRepository, PlayerRepository playerRepository,
			CardRepository cardRepository) {
		this.gameRepository = gameRepository;
		this.playerRepository = playerRepository;
		
	}


	public void startNewGame() {
		//start new game
		Game newGame = new Game();
		gameRepository.save(newGame);
		
		//initialize players
		List<Player> players = initializePlayers();
		playerRepository.saveAll(players);
	}
	
	private List<Player> initializePlayers() {
		//create new players
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		return List.of(player1, player2);
	}


	public List<Player> getAllPlayers() {
		return playerRepository.findAll();
	}
	
}



















