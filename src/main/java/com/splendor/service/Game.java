package com.splendor.service;

import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.splendor.repository.Card;
import com.splendor.repository.Player;

@Entity
@EntityScan("com.splendor")
public class Game {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany
	private List<Player> players;
	
	@OneToMany
	private List<Card> availableCards;
	
}
