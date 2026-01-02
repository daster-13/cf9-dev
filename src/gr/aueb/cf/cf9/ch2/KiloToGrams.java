package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Μετατροπή των κιλών που εισάγει ο χρήστης από κιλά σε γραμμαρια.
 */

public class KiloToGrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int KILOGRAMS_TO_GRAMS = 1000;
        int inputWeight = 0;
        int weightToGrams = 0;

        System.out.println("Παρακαλώ εισάγετε τα κιλά σας: ");
        inputWeight = scanner.nextInt();
        weightToGrams = inputWeight * KILOGRAMS_TO_GRAMS;

        System.out.printf(" Τα κιλά είναι %d, Τα κιλά σε γραμμάρια είναι %d%n", inputWeight, weightToGrams);;
    }
}
