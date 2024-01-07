package com.splendor.repository;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Card {
	
	private int cardLevel;
	private int costCard;
	private int cardPoints;
	
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

}
