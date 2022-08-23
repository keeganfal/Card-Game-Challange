package org.example;

public class Card {

    protected String suit;
    protected String symbol;
    protected int value;

    public String getSuit() {
        return suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getValue() {
        return value;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Card(String suit, String symbol, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    public String toString() {
        return getClass().getSimpleName() + "[Suit=" + this.suit + ", Symbol='" + this.symbol + "', Value=" + this.value + "]";
    }
}
