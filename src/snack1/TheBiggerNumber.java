package snack1;

import java.util.Scanner;

public class TheBiggerNumber {
    public static void main(String[] args) {
        //creation Scanner
        Scanner input = new Scanner(System.in);
        //creation variables
        int numberOne;
        int numberTwo;

        //input
        System.out.println("Inserisci il primo numero: ");
        numberOne = Integer.parseInt(input.nextLine());
        System.out.println("Inserisci il secondo numero: ");
        numberTwo = Integer.parseInt(input.nextLine());

        if (numberOne > numberTwo) {
            System.out.println("Il primo numero è più grande: " + numberOne);
        } else if (numberOne == numberTwo){
            System.out.println("I numeri sono uguali.");
        } else {
            System.out.println("Il secondo numero è più grande: " + numberTwo);
        }

    }
}
