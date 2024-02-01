package com.splendor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.splendor.repository.Player;
import com.splendor.service.PlayerService;

import ch.qos.logback.core.subst.Token;


public class PlayerController {
	
	@Autowired
	private PlayerService playerService;
	private Player player;
	private Token token;
	
	@PostMapping("/{playerId}/add-green-tokens/{tokensToAdd}")
	public ResponseEntity<String> addGreenTokens(@PathVariable Long playerId, @PathVariable int tokensToAdd) {
		playerService.addGreenTokens(playerId, tokensToAdd);
		return ResponseEntity.ok("Green tokens added successfully");
	}
	
}
