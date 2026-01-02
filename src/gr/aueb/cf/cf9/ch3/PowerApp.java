package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * calculate the power of a number , a^n
 * a^n = a*a*a*a....*a
 * (n φορες)
 */

public class PowerApp {
    public static void main(String[] args) {
        //Δήλωση και αρχικοποήση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        //Εισοδος δεδομένων
        System.out.println("Παρακαλώ εισάγετε το base και το power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        //Επεξεργασία δεδομένων
        while( i   <= power){
            result *= base; // result = result * base
            i++;
        }
        System.out.printf("%d ^ %d = %d%n", base, power, result);
    }
}
