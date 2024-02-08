package com.splendor.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.splendor.controller.CardFromStack;
import com.splendor.repository.Card;

@Service
public class CardService {
	
//	@Autowired
	private Card card;
	
//	@Autowired
	private GameService gameService;
	
//	public Card drawCardFromStack (Long cardFromStackId) {
//		CardFromStack cardFromStack = gameService.getCardFromStackId(cardFromStackId);
//		
//		if (cardFromStack == null) {
//			return null;
//		}
//		
//	}
//	
//	
//	List<Card> getAvaibleCard (int playerTokenns) {
//		List<Card> avaibleCardsCards = new ArrayList<Card>();
//		
//		List<Card> allCards = card.findAll();
//		
//		for(Card card : allCards) {
//			if(card.getCost() <= playerTokenns) {
//				avaibleCardsCards.add(card);
//			}
//		}
//		return avaibleCardsCards;
//	}
	
	
}
