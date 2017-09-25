package com.faf.domain.model;

/**
 * Created by schiduvasile on 9/19/17.
 */
public enum Suit {
    C("Clubs"),
    D("Diamonds"),
    S("Spades"),
    H("Hearts");

    private String name;

    Suit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
