package com.splendor.service;

import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.splendor.repository.Card;
import com.splendor.repository.Player;

public class Game {
	
	private Long id;
	
	private List<Player> players;
	
	private List<Card> availableCards;
	
}
