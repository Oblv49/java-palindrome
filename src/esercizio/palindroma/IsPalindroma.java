package esercizio.palindroma;

import java.util.Arrays;
import java.util.Scanner;

public class IsPalindroma {
    public static void main(String[] args) {
        //creation Scanner
        Scanner input = new Scanner(System.in);
        //input
        System.out.println("Inserisci una parola per scoprire se è Palindroma!");
        //wariable user word
        String word = input.nextLine();

        // Trasformo la parola in un array di caratteri
        char[] wordArray = word.toCharArray();

        System.out.println("La parola che hai scelto è: " + Arrays.toString(wordArray));

        // Inverted array
        //creation array whit length = wordArray
        char[] invertedWordArray = new char[wordArray.length];

        int flag = 0;

        for (int i = wordArray.length - 1; i >= 0; i--) {
            invertedWordArray[flag] = wordArray[i];
            flag++;
        }

        System.out.println("La parola invertita è: " + Arrays.toString(invertedWordArray));

        // Confronto gli array, se sono uguali la parola è palindroma, altrimenti no
        //creation boolean flag
        boolean isPalindrome = true;

        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i] != invertedWordArray[i]) {
                isPalindrome = false;
                break;
            }
        }

        //output
        if (isPalindrome) {
            System.out.println("La parola inserita: " + word + " è palindroma!");
        } else {
            System.out.println("La parola inserita: " + word + " non è palindroma!");
        }

        //close Scanner
        input.close();
    }
}
