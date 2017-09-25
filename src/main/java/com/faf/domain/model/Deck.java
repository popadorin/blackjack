package com.faf.domain.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by schiduvasile on 9/19/17.
 */
public class Deck {

    private List<Card> cards = new ArrayList<>();

    public Deck() {
        for (Suit suit : Suit.values()) {
            for (char value : Card.values) {
                cards.add(new Card(value, suit));
            }
        }
        Collections.shuffle(cards);
    }

    public Card draw() {
        if (cards.isEmpty()) {
            return null;
        } else {
            return cards.remove(0);
        }
    }
}
