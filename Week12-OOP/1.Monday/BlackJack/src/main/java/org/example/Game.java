package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private ArrayList<Player> players;

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Game(ArrayList<Player> players) {
        this.players = players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        Deck deck = new Deck();
        deck.shuffle();
        for (Player player : this.players) {
            Hand hand = new Hand();
            hand.deal(deck.deal());
            hand.deal(deck.deal());
            player.setHand(hand);
        }

        List<Player> winnerList = new ArrayList<Player>();

        for (Player player : this.players) {
            System.out.println(player.getName() + ":");
            Hand hand = player.getHand();
            if (player.isDealer()) {
                System.out.println(hand.cards.get(0).getCardSuit() + " " + hand.cards.get(0).getValue());
                System.out.print("FACE DOWN CARD IS ");
                System.out.println(hand.cards.get(1).getCardSuit() + " " + hand.cards.get(1).getValue());
            } else {
                for (Card card : hand.cards) {
                    System.out.println(card.getCardSuit() + " " + card.getValue());
                }
            }
            if (player.isDealer() && hand.getValue() == 21) {
                System.out.println("Dealer wins");
                return;
            } else if (hand.getValue() == 21) {
                winnerList.add(player);
            }
        }

        if (!winnerList.isEmpty()) {
            System.out.println("Winners are: ");
            for (Player winner : winnerList) {
                System.out.println(winner.getName());
            }
        } else {
            int maxPoints = 0;

            for (Player player : this.players) {
                boolean hitting = true;
                Hand hand = player.getHand();
                while (hitting) {
                    if (!player.isDealer()) {
                        System.out.println(player.getName() + ", Would you like to hit?");
                        String hit = scanner.nextLine();

                        if (hit.equalsIgnoreCase("yes")) {
                            Card card = deck.deal();
                            hand.deal(card);
                            System.out.println("You were dealt " + card.getCardSuit() + " " + card.getValue());
                            if (hand.getValue() > 21) {
                                System.out.println("Sorry you busted " + player.getName());
                                hitting = false;
                            } else if (hand.getValue() == 21) {
                                System.out.println("Blackjack! let's hope Dealer doesn't get it too..");
                                hitting = false;
                            }
                        } else {
                            hitting = false;
                        }
                    } else {
                        while (hitting) {
                            if (hand.getValue() <= 16) {
                                System.out.println("Dealer has to hit");
                                Card card = deck.deal();
                                hand.deal(card);
                                System.out.println("Dealer was dealt " + card.getCardSuit() + " " + card.getValue());
                                if (hand.getValue() > 21) {
                                    System.out.println("Dealer busted ");
                                    hitting = false;
                                } else if (hand.getValue() == 21) {
                                    System.out.println("Dealer wins with 21");
                                    return;
                                }
                            } else {
                                hitting = false;
                            }
                        }
                    }
                }
                if (hand.getValue() <= 21) {
                    maxPoints = Math.max(hand.getValue(), maxPoints);
                }
                if (player.isDealer() && hand.getValue() == maxPoints) {
                    System.out.println("Dealer wins");
                    return;
                }
            }

            // DETERMINING THE WINNER AFTER HITTING ENDS

            for (Player player : this.players) {
                if (!player.isDealer() && player.getHand().getValue() == maxPoints) {
                    winnerList.add(player);
                }
            }

            for (Player winner : winnerList) {
                System.out.print(winner.getName());
                System.out.print(" wins! ");
            }
        }
    }
}
