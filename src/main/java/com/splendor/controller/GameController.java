package com.splendor.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.splendor.service.GameService;


@RestController
@RequestMapping("/api/game")
public class GameController{

	private GameService gameService;

	public GameController(GameService gameService) {
		this.gameService = gameService;
	}
	
	@PostMapping("/start")
	public ResponseEntity<Void> startNewGame() {
		gameService.startNewGame();
		return ResponseEntity.ok().build();
	}

}