package com.splendor.repository;

public class Token {
	
	private Long id;
	private int numberOfToken;
	private int maxNumberOfToken;
	private TokenColor tokenColor;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getNumberOfToken() {
		return numberOfToken;
	}
	public void setNumberOfToken(int numberOfToken) {
		this.numberOfToken = numberOfToken;
	}
	public int getMaxNumberOfToken() {
		return maxNumberOfToken;
	}
	public void setMaxNumberOfToken(int maxNumberOfToken) {
		this.maxNumberOfToken = maxNumberOfToken;
	}

	public TokenColor getTokenColor() {
		return tokenColor;
	}

	public void setTokenColor(TokenColor tokenColor) {
		this.tokenColor = tokenColor;
	}

}
