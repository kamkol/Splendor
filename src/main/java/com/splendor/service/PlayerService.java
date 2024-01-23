package com.splendor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.splendor.repository.Player;

@Service
public class PlayerService {
	
	@Autowired
	private Player player;
	
	public Player getPlayerById(Long playerId) {
		return player.findById(playerId).orElse(null);
	}
	
	public void addGreenTokens(Long playerId, int tokensToAdd) {
		Player player = getPlayerById(playerId);
		if(player != null) {
			player.setGreenTokens(player.getGreenTokens() + tokensToAdd);
			player.save(player);
		}
	}
	
	
}
