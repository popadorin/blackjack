package com.faf.domain.model;

/**
 * Created by schiduvasile on 9/13/17.
 */
public class Card {

    public static final char[] suits = {'C', 'D', 'S', 'H'};
    public static final char[] values = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'X', 'J', 'Q', 'K'};

    private boolean isAce = false;
    private char value;
    private char suit;
    private int points;

    public Card(char value, char suit) {
        this.suit = suit;
        this.value = value;

        switch (value) {
            case 'A':
                points = 11;
                break;
            case 'X':
            case 'J':
            case 'Q':
            case 'K':
                points = 10;
                break;
            default:
                points = Character.getNumericValue(value);
        }
    }

    public int getPoints(int handValue) {
        if(isAce) {
            return (handValue < 11) ? 11 : 1;
        } else {
            return points;
        }
    }

    @Override
    public String toString() {
        return " " + value + suit;
    }


}
