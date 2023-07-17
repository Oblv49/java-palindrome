package snack5;

import java.util.Scanner;

public class IsOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci un numero: ");
            int numberUser = input.nextInt();
            if (numberUser % 2 != 0) {
                System.out.println("Il numero è dispari!");
            } else {
                System.out.println("Il numero è pari!");
            }
        }
    }
}
