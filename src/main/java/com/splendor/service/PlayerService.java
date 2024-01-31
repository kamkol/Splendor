package com.splendor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class PlayerService {
	
	@Autowired
	PlayerService playerService;
	
	@PostMapping
	public ResponseEntity<String> addGreenTokens(@PathVariable Long playerId, @PathVariable int tokensToAdd) {
        playerService.addGreenTokens(playerId, tokensToAdd);
        return ResponseEntity.ok("Green tokens added!");
	}
}
