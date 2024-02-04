package com.splendor.service;

import java.util.List;

import com.splendor.controller.TokenController;

import ch.qos.logback.core.subst.Token;

public class TokenService {
	
	private TokenController tokenController;
	
	private List<Token> getAllTokens() {
		return userTokens;
	}
	
	public void saveTokens(List<Token> tokens) {
		userTokens.addAll(tokens);
	}

}
