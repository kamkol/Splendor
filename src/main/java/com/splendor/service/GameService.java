package com.splendor.service;

import org.springframework.stereotype.Service;

import com.splendor.repository.Game;


@Service
public class GameService {
	
	public Game createGame() {
		Game game = new Game();
		return game;
	}
	

}
