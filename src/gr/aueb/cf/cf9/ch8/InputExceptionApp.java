package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

/**
 * Το{ @link java.util.InputMismatchException}συμβαίνει όταν
 * ο {@link java.util.Scanner} αποτυγχα΄νει να διαβάσει το σωστό τυπο δεδομένων.
 */
public class InputExceptionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.println("Please enter one int: ");
        //num = scanner.nextInt();

         while (!scanner.hasNextInt()) {
             System.out.println("Μη αποδεκτοί χαρακτήρες! ");
             scanner.nextLine();
         }

        System.out.println("Num:" + num );

    }


}
