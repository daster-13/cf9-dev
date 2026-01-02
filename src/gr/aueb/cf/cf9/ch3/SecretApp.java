package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * The user guess a secret number.
 */

public class SecretApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET_NUMBER = 42;

        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

        if (num == SECRET_NUMBER){
            System.out.println("You guessed the number!  ");
        } else {
            System.out.println("You did not guess the number!");

        }
    }
}
