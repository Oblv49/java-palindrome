package snack9;

public class SumEMediaOfTheFirstTenNumbers {
    public static void main(String[] args) {

        int sum = 0;

        double media;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        media = (double) sum / 10;

        System.out.println("La somma dei primi 10 numeri è: " + sum);
        System.out.println("La media dei primi 10 numeri è: " + media);
    }
}
