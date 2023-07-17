package snack6;

import java.util.Scanner;

public class CubeOfN {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci un numero: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            int cube = i * i * i;
            System.out.println("Il cubo di " + i + " è: " + cube);
        }

    }
}
