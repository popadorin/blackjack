package com.faf.domain.model;

/**
 * Created by schiduvasile on 9/19/17.
 */
public enum Suit {
    Clubs("Clubs"),
    Diamonds("Diamonds"),
    Spades("Spades"),
    Hearts("Hearts");

    private String name;

    Suit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
