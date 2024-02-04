package com.splendor.controller;

import java.util.ArrayList;
import java.util.List;

import com.splendor.repository.Card;

public class CardFromStack {
	
	private List<Card> cards;
	
	public CardFromStack() {
		this.cards = new ArrayList<Card>();
	}
	
	public Card drawCard() {
		if(!cards.isEmpty()) {
			return cards.remove(cards.size()-1);
		} else {
			return null;
		}
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}

}
