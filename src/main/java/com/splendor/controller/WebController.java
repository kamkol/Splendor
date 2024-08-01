package com.splendor.controller;

import org.springframework.stereotype.Controller;
import com.splendor.service.GameService;

@Controller
public class WebController {
	
	private GameService gameService;

	public WebController(GameService gameService) {
		super();
		this.gameService = gameService;
	}
	

}
