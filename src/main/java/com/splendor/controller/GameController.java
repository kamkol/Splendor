package com.splendor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.splendor.service.GameService;

@RestController
@RequestMapping("/splendor")
public class GameController {

	@Autowired
	private GameService gameService;
	
	@PostMapping("/start")
	public ResponseEntity<Void> startNewGame() {
		gameService.startNewGame();
		return ResponseEntity.ok().build();
	}
	
}