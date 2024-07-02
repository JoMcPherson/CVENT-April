package org.example;

import java.util.HashMap;
import java.util.Map;
public class Card {

    private CardSuit cardSuit;
    private CardValue value;
    private boolean isFaceUp;

    private final HashMap<CardValue, Integer> pointsMap;

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void flip() {
        this.isFaceUp = !this.isFaceUp;
    }


    public CardSuit getCardSuit() {
        return cardSuit;
    }

    public void setCardSuit(CardSuit cardSuit) {
        this.cardSuit = cardSuit;
    }

    public CardValue getValue() {
        return this.value;
    }

    public void setValue(CardValue value) {
        this.value = value;
    }

    public int getPointValue() {
        return pointsMap.get(this.value);
    }
    public Card(CardSuit cardSuit, CardValue value) {
        this.cardSuit = cardSuit;
        this.value = value;
        this.isFaceUp=false;

        pointsMap = new HashMap<>();
        pointsMap.put(CardValue.ACE, 11);
        pointsMap.put(CardValue.TWO, 2);
        pointsMap.put(CardValue.THREE, 3);
        pointsMap.put(CardValue.FOUR, 4);
        pointsMap.put(CardValue.FIVE, 5);
        pointsMap.put(CardValue.SIX, 6);
        pointsMap.put(CardValue.SEVEN, 7);
        pointsMap.put(CardValue.EIGHT, 8);
        pointsMap.put(CardValue.NINE, 9);
        pointsMap.put(CardValue.TEN, 10);
        pointsMap.put(CardValue.JACK, 10);
        pointsMap.put(CardValue.QUEEN, 10);
        pointsMap.put(CardValue.KING, 10);
    }




}
