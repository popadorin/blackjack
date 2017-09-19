package com.faf.domain.model;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by schiduvasile on 9/19/17.
 */
public class Deck {

    private ArrayList<Card> deck = new ArrayList<>();


    public void generateDeck() {
        for(Suit suit: Suit.values()) {
            for(Value value: Value.values()) {
                deck.add(new Card(value, suit));
            }
        }
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }
}
