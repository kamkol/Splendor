package com.splendor.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.splendor.entity.Player;
import com.splendor.service.GameService;

import ch.qos.logback.core.model.Model;

@Controller
public class WebController {
	
	private GameService gameService;

	public WebController(GameService gameService) {
		super();
		this.gameService = gameService;
	}

	@GetMapping("/players")
	public String getAllPlayers(Model model) {
		List<Player> players = gameService.getAllPlayers();
		model.add("players", players);
		return "players";
	}

}
