package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of players: ");
        int players = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Player> playerList = new ArrayList<Player>();
        for (int i = 0; i < players; i++) {
            System.out.println("Enter name of Player " + (i + 1));
            String name = scanner.nextLine();
            playerList.add(new Player(name, false));
        }
        playerList.add(new Player("Dealer", true));

        Game game = new Game(playerList);
        game.play();

    }
}
