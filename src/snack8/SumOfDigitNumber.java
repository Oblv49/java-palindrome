package snack8;

import java.util.Scanner;

public class SumOfDigitNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero di 4 cifre: ");
        String number = input.nextLine();

        if (number.length() <= 4) {
            char[] numberCharArray = number.toCharArray();
            int sum = 0;

            for (int i = 0; i < numberCharArray.length; i++) {
                sum += Integer.parseInt(String.valueOf(numberCharArray[i]));
            }

            System.out.println("La somma dei numeri è: " + sum);
        } else {
            System.out.println("inserisci un numero di 4 cifre!");
        }
    }
}
