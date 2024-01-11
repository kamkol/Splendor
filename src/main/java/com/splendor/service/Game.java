package com.splendor.service;

import java.util.List;

import com.splendor.repository.Card;
import com.splendor.repository.Player;

public class Game {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
//	@OneToMany
	private List<Player> players;
	
//	@OneToMany
	private List<Card> availableCards;
	
}
