package snack4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random randomNum = new Random();

        int[] randomNumbers = new int [10];
        int min = 0;
        int max = 100;

        for (int i = 0; i < 10; i++) {
            randomNumbers[i] = randomNum.nextInt(min, max);
        }

        System.out.println("numeri random: " + Arrays.toString(randomNumbers));
        System.out.println("Inserisci un numero: ");

        int numberUser = input.nextInt();
        boolean flag = false;

        for (int i = 0; i < randomNumbers.length; i++) {
            if (numberUser == randomNumbers[i]) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("Hai vinto! Il numero è presente.");
        } else {
            System.out.println("Il tuo numero non è presente.");
        }
    }
}
