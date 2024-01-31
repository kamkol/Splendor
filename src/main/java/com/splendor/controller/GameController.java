package com.splendor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;


@RequestMapping
@Controller
public class GameController {
	
	@GetMapping("/game")
	public String gamePage(Model model) {
		model.addAttribute("message", "Splendor game!");
		return "game";
	}
	
}
