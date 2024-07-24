package com.splendor.repository;

import java.util.List;


public class Card {
	
	private Long id;
	private int cardLevel;
	private int costCard;
	private int cardPoints;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getCardLevel() {
		return cardLevel;
	}
	public void setCardLevel(int cardLevel) {
		this.cardLevel = cardLevel;
	}
	public int getCostCard() {
		return costCard;
	}
	public void setCostCard(int costCard) {
		this.costCard = costCard;
	}
	public int getCardPoints() {
		return cardPoints;
	}
	public void setCardPoints(int cardPoints) {
		this.cardPoints = cardPoints;
	}
	
	public List<Card> findAll() {
		// TODO Auto-generated method stub
		return null;
	} 

}











