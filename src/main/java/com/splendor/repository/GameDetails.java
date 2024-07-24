package com.splendor.repository;


public class GameDetails {
	
	private String playerName;
	private int numberOfPlayer;
	private int tokens;
	private Long gameId;
	private int rounds;
	
	
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
	public Long getGameId() {
		return gameId;
	}
	public void setGameId(Long gameId) {
		this.gameId = gameId;
	}

}
