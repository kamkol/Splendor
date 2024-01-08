package com.splendor.dto;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class GameDetails {
	
	private String playerName;
	private int numberOfPlayer;
	private int tokens;
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getNumberOfPlayer() {
		return numberOfPlayer;
	}
	public void setNumberOfPlayer(int numberOfPlayer) {
		this.numberOfPlayer = numberOfPlayer;
	}
	public int getTokens() {
		return tokens;
	}
	public void setTokens(int tokens) {
		this.tokens = tokens;
	}

}
