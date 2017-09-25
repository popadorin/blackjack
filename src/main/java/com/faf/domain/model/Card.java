package com.faf.domain.model;

/**
 * Created by schiduvasile on 9/13/17.
 * Implementation of the card class
 */
public class Card {


//    public static final char[] values = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'X', 'J', 'Q', 'K'};

    private final Value value;
    private final Suit suit;
    private final int points;
    private final boolean ace;

    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
        ace = value == Value.Ace;
        points = value.getValue();

    }

    public int getPoints(int handValue) {
        if (ace) {
            return (handValue < 11) ? 11 : 1;
        } else {
            return points;
        }
    }

    public boolean isAce() {
        return ace;
    }



    @Override
    public String toString() {
        return "" + value.getValue() + suit;
    }


}
