package com.splendor.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.splendor.service.TokenService;
import ch.qos.logback.core.subst.Token;

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
	

}
