package com.splendor.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.splendor.repository.TokenColor;
import com.splendor.service.TokenService;
import com.splendor.repository.Token;


@RestController
@RequestMapping("/tokens")
public class TokenController {
	
	@Autowired
	private	TokenService tokenService;
	
	@GetMapping
	public List<Token> getAllTokens() {
		return tokenService.getAllTokens();
	}
	
	@PostMapping
	public void saveTokens(@RequestBody List<Token> tokens) {
		tokenService.saveTokens(tokens);
	}
	
	
	@GetMapping
	public String generateTokensModel(Model model) {
		List<Token> tokens = generateTokens();
		model.addAttribute("tokens", tokens);
		return "game";
	}
	
	private List<Token> generateTokens() {
		List<Token> tokens = new ArrayList<Token>();
		tokens.add(new Token(TokenColor.BLUE, 1));
		return tokens;
	}
	

}
