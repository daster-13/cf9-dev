package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Διαίρεση και υοόλοιπο δεκαδικών
 */

public class DivisionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0.0;
        double num2 = 0.0;
        double result = 0.0;
        double remaining = 0.0;

        System.out.println("Please enter two numbers(doubles): ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();

        result = num1 / num2; // Η διαίρεση με το 0 δίνιε infinity
        remaining = num1 % num2; // To το υπόλοιπο της διαίρεης με το ακέραιο μέρος της διαιρεσης(π.χ 10.5 / 2.3 τοτε το mod είναι 10.5 % 2)
        System.out.println("Result: " + result);
        System.out.println("Remaining: " + remaining);

    }
}