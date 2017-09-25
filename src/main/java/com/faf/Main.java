package com.faf;

import com.faf.domain.model.Game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        Game game = new Game();
        System.out.println("quit to exit");
        while (isRunning) {
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
                    isRunning = false;
                    break;
            }
        }
    }

}
