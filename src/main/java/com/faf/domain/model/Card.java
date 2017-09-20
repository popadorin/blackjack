package com.faf.domain.model;

/**
 * Created by schiduvasile on 9/13/17.
 * Implementation of the card class
 */
public class Card {


    private Suit suit;
    private Value value;

    public Card(Value value, Suit suit) {
        this.suit = suit;
        this.value = value;

    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return  suit + " " + value;
    }


}
