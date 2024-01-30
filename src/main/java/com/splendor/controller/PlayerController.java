package com.splendor.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.splendor.service.PlayerService;

public class PlayerController {
	
	@Autowired
	private PlayerService playerService;
	
	@PostMapping("/{playerId}/add-green-tokens/{tokensToAdd}")
	public ResponseEntity<String> addGreenTokens(@PathVariable Long playerId, @PathVariable int tokensToAdd) {
		playerService.addGreenTokens(playerId, tokensToAdd);
		return ResponseEntity.ok("Green tokens added successfully");
	}
	
}
