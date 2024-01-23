package com.splendor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.splendor.repository.GameDetails;

@Service
public class GameService {
	
	@Autowired
	private GameDetails gameDetails;
	
	public Game gameById(Long game) {
		return gameDetails.findById(gameId).orElse(null);
	}

}
