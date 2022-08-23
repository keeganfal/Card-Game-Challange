package org.example;

import java.util.Scanner;

public class Snap extends CardGame{


    public Snap() {
        super();
    }

    public void game(){
        System.out.println("Welcome to the Snap Game!");
        Scanner scanner = new Scanner(System.in);
        Card prevCard = super.dealCard();

        Card dealtCard = super.dealCard();
        while (!prevCard.getSymbol().equals(dealtCard.getSymbol())){
            String currentInput = scanner.nextLine();
            if (currentInput.equals("")) {
                System.out.println("Prev Card: " + prevCard);
                System.out.println("Dealt Card: " + dealtCard);

                prevCard = dealtCard;
                dealtCard = super.dealCard();
            }
        }
        System.out.println("");
        System.out.println("Prev Card: " + prevCard);
        System.out.println("Dealt Card: " + dealtCard);
        System.out.println("The Symbols Match!");
    }

    public static void main(String[] args) {
        Snap snap = new Snap();
        snap.game();
    }
}
