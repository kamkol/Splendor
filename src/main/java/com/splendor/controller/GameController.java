package com.splendor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.splendor.entity.Player;
import com.splendor.repository.GameRepository;
import com.splendor.service.GameService;

import jakarta.persistence.EntityManager;

@RestController
@RequestMapping("/api/game")
public class GameController implements GameRepository{

	private EntityManager entityManager;
	
	//set up constructor injection
	@Autowired
	public GameController(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	@Override
	public void startNewGame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Player> findAllPlayers() {
		// TODO Auto-generated method stub
		return null;
	}


	
}