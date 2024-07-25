package com.splendor.service;

import org.springframework.stereotype.Service;
import com.splendor.repository.CardRepository;
import com.splendor.repository.GameRepository;
import com.splendor.repository.PlayerRepository;

@Service
public class GameService {
	
	private GameRepository gameRepository;
	private PlayerRepository playerRepository;
	private CardRepository cardRepository;
	
	
	public GameService(GameRepository gameRepository, PlayerRepository playerRepository,
			CardRepository cardRepository) {
		super();
		this.gameRepository = gameRepository;
		this.playerRepository = playerRepository;
		this.cardRepository = cardRepository;
	}
	
	
	
}
