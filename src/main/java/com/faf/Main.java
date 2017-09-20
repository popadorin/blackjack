package com.faf;

import com.faf.domain.model.Card;
import com.faf.domain.model.Deck;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.generateDeck();

        ArrayList<Card> deckList = deck.getDeck();

        deck.shuffleDeck(deckList);

        deckList.stream().forEach(card -> System.out.println(card.getSuit() + " " + card.getValue()));

        System.out.println("I draw first card: ");

        System.out.println(deck.draw());

        deckList.stream().forEach(card -> System.out.println(card.getSuit() + " " + card.getValue()));

    }
}
