package org.example;

public class Player {

    private Hand hand;
    private String name;
    private boolean isDealer;

    public Player(String name, boolean isDealer) {
        this.name = name;
        this.isDealer = isDealer;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDealer() {
        return isDealer;
    }

    public void setDealer(boolean dealer) {
        isDealer = dealer;
    }
}
