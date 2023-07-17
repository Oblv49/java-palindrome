package snack3;

import java.util.Scanner;

public class SumOfNumbersInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 10; i++) {

            System.out.print("Inserisci un numero: ");
            sum += input.nextInt();

        }

        System.out.println("La somma dei numeri è: " + sum);
    }
}

