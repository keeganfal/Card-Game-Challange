package org.example;

public enum CardSuit {
   SPADES(	023140), HEART(	023145), DIAMOND(	023146), CLUBS(023143);

   protected final int unicodeSymbol;

    CardSuit(int unicodeSymbol) {
        this.unicodeSymbol = unicodeSymbol;
    }
}
