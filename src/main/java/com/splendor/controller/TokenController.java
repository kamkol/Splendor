package com.splendor.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.splendor.repository.TokenColor;
import com.splendor.service.TokenService;
import com.splendor.repository.Token;


@RestController
@RequestMapping("/tokens")
public class TokenController {
	
	
	private	TokenService tokenService;
	
	@GetMapping("/")
	public String generateTokensModel(Model model) {
		List<Token> tokens = generateTokens();
		model.addAttribute("tokens", tokens);
		return "game";
	}
	
	private List<Token> generateTokens() {
		List<Token> tokens = new ArrayList<Token>();
		tokens.add(new Token(TokenColor.BLUE, 1));
		tokens.add(new Token(TokenColor.BROWN, 2));
		tokens.add(new Token(TokenColor.GREEN, 3));
		tokens.add(new Token(TokenColor.RED, 4));
		tokens.add(new Token(TokenColor.WHITE, 5));
		tokens.add(new Token(TokenColor.YELLOW, 6));
		return tokens;
	}
	

}
