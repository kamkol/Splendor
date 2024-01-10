package com.splendor.service;

import org.springframework.stereotype.Service;

import com.splendor.controller.GameController;

@Service
public class GameService {
	
		private final GameController gameController;
	
	public GameService(GameController gameController) {
		this.gameController = gameController;
	}

}
