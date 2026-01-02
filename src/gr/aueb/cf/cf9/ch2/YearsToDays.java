package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει την ηλικία του σε έτη(έστω ακέραιος) και
 * το προγραμμμα επιστρέφει την ηλικία σε ημέρες.
 * Θεωρούμε ότι 1 έτος = 365 ημέρες. Για παράδειγμα, αν δοθεί
 * ηλικία 20 ετών, το αποτέλεσα είναι 7300 ημέρες.
 */

public class YearsToDays {
    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        final int DAYS_IN_YEARS = 365;
        int ageInDays = 0;
        int inputAgeInYears = 0;

        System.out.println("Παρακαλώ εισάγεται την ηλικία σας");
        inputAgeInYears = scanner.nextInt();
        ageInDays = inputAgeInYears * DAYS_IN_YEARS;

        System.out.println("Η ηλικία σας σε ημέρες είναι " + ageInDays);
        System.out.printf("Η ηλικία σας σε έτη: %d, Η  ηλικία σας σε ημέρες: %d%n", inputAgeInYears, ageInDays);
    }
}
