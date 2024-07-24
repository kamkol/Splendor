package com.splendor.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.splendor.repository.Game;
import com.splendor.repository.GameDetails;
import com.splendor.repository.TokenColor;
import com.splendor.service.GameService;

import ch.qos.logback.core.subst.Token;

import org.springframework.ui.Model;


@RequestMapping
@Controller
public class GameController {
	
	@Autowired
	private GameService gameService;
	private GameDetails gameDetails;
	private Game game;
	
	
	@PostMapping("/games")
	public Game createNewGame() {
		return gameService.createGame();
	}
	
	@GetMapping("/game")
	public String gamePage(Model model) {
		model.addAttribute("message", "Splendor game!");
		return "game";
	}
	
}
