package com.splendor.service;


import org.springframework.stereotype.Service;
import com.splendor.entity.Game;
import com.splendor.repository.CardRepository;
import com.splendor.repository.GameRepository;
import com.splendor.repository.PlayerRepository;

@Service
public class GameService {
	
	private GameRepository gameRepository;
	
	
	public GameService(GameRepository gameRepository, PlayerRepository playerRepository,
			CardRepository cardRepository) {
		super();
		this.gameRepository = gameRepository;

	}


	public void startNewGame() {
		// TODO Auto-generated method stub
		//start new game
		Game newGame = new Game();
		
		gameRepository.save(newGame);
		
	}
	
	
}



















