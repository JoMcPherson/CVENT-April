package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deck;

    public int getSize() {
        return deck.size();
    }

    private int size;
    public ArrayList<Card> getDeck() {
        return deck;
    }

   public void shuffle(){
        Collections.shuffle(deck);
   }

   public Card deal(){
        if (!deck.isEmpty()) {
            return deck.remove(0);
        }
        else {
            return null;
        }

   }
    public Deck() {
        this.deck = new ArrayList<>();

        for (CardSuit suit : CardSuit.values()) {
            for (CardValue value : CardValue.values()) {
                deck.add(new Card(suit, value));
            }
        }

    }
}
