package com.faf.domain.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

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

    public void shuffleDeck(ArrayList deck) {
        Collections.shuffle(deck);
    }


    public ArrayList<Card> getDeck() {
        return deck;
    }
}
