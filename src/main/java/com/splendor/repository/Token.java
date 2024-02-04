package com.splendor.repository;

public class Token {
	
	private Long id;
	private String type;
	private int numberOfToken;
	private int maxNumberOfToken;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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

}
