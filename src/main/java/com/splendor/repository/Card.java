package com.splendor.repository;

import java.lang.reflect.GenericArrayType;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.annotation.Generated;

@EntityScan
public class Card {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
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
