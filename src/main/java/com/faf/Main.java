package com.faf;

import com.faf.domain.model.Game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        Game game = new Game();
        System.out.println("quit to exit");
        while (running) {
            System.out.println("Dealer Hand:" + String.join(", ", game.getDealerHand()));
            System.out.println("Player Hand:" + String.join(", ", game.getPlayerHand()));
            String winner = game.getWinner();
            if (winner != null) {
                System.out.println("Winner: " + winner);
            }
            System.out.println("Options:" + String.join(", ", game.getOptions()));
            String command = scanner.next();
            switch (command.toLowerCase()) {
                case "hit":
                    game.hit();
                    break;
                case "stand":
                    game.stand();
                    break;
                case "newgame":
                    game = new Game();
                    break;
                case "quit":
                    running = false;
                    break;
            }
        }
    }

}















//
//import com.faf.domain.model.Card;
//import com.faf.domain.model.Deck;
//
//import java.util.ArrayList;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Deck deck = new Deck();
//        deck.generateDeck();
//
//        ArrayList<Card> deckList = deck.getDeck();
//
//        deck.shuffleDeck(deckList);
//
//        deckList.stream().forEach(card -> System.out.println(card.getSuit() + " " + card.getValue()));
//
//        System.out.println("I draw first card: ");
//
//        System.out.println(deck.draw());
//
//        deckList.stream().forEach(card -> System.out.println(card.getSuit() + " " + card.getValue()));
//
//    }
//}
