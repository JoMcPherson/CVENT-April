package org.example;

import java.util.ArrayList;

public class Hand {

    public ArrayList<Card> cards;
    private int aceCount;

    public Hand(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public Hand() {
        this.cards = new ArrayList<Card>();
    }
    public void deal(Card card){
        cards.add(card);
    }

    public int getSize(){
        return cards.size();
    }

    public int getValue(){
        int value = 0;
        for(Card card: cards){
            value += card.getPointValue();
            if (card.getValue() == CardValue.ACE)
            {
                aceCount++;

            }
            while (value > 21 && aceCount > 0) {
                value -=10;
                aceCount-=1;
            }
        }

        return value;
    }
}
