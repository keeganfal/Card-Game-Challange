package org.example;

public enum CardSymbol {
    ONE("1"), TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9"), TEN("2"), JACK("J"), QUEEN("Q"), KING("K"), ACE("A");

    protected final String cardSymbol;

    CardSymbol(String cardSymbol) {
        this.cardSymbol = cardSymbol;
    }

    public String getCardSymbol() {
        return cardSymbol;
    }
}
