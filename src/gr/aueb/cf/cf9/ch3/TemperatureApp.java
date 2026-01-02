package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει ένα ακέριαο που συμβολίζιε μια
 * θερμοκρασία.Και το πρόγραμμα υπολογίζει αν η θερμοκρασία έιναι <0 τότε μια μεταβλητη γίνεται true αλλιώς γίνεται
 * false
 */

public class  TemperatureApp {
    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isTemperatureBelowZero = false;

        //Εισαγωγή Δεδομένων
        System.out.println("Παρακαλώ εισάγεται μια θερμοκρασία");
        temperature = scanner.nextInt();

        //Επεξεργασία των δεδομένων
        isTemperatureBelowZero = temperature < 0;

        //Εκτύπωση των αποτελεσμάτων
        System.out.println("Η θερμοκρασία είνια μικρότερη απο 0:" + isTemperatureBelowZero);
    }
}
