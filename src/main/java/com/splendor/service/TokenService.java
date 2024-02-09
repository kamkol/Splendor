package com.splendor.service;

import java.util.List;
import com.splendor.controller.TokenController;
import com.splendor.repository.Player;

import ch.qos.logback.core.subst.Token;

public class TokenService {
	
	private TokenController tokenController;
    private Player player;

	
	public List<Token> getAllTokens() {
//		return userTokens;
		return null;
	}
	
	public void saveTokens(List<Token> tokens) {
//		userTokens.addAll(tokens);
	}
	
	
    @Autowired
    public void addGreenTokens(String playerId, int tokensToAdd) {
        Player player = player.findById(playerId);
        player.addGreenTokens(tokensToAdd);
        player.save(player);
    }

}
