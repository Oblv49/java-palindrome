package snack2;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        //creation Scanner
        Scanner input = new Scanner(System.in);
        //creation variables
        String wordOne;
        String wordTwo;

        //input
        System.out.println("Inserisci la prima parola: ");
        wordOne = input.nextLine();
        System.out.println("Inserisci la seconda parole: ");
        wordTwo = input.nextLine();

        if (wordOne.length() > wordTwo.length()) {
            System.out.println("La seconda parola è la più corta: " + wordTwo);
            System.out.println("La prima parola è la più lunga: " + wordOne);
        } else if (wordOne.length() == wordTwo.length()) {
            System.out.println("Le parole sono uguali." );
        } else {
            System.out.println("La prima parola è la più corta: " + wordOne);
            System.out.println("La seconda parola è la più lunga: " + wordTwo);
        }

    }
}
