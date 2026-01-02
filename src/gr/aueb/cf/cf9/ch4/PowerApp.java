package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

public class PowerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputBase = 1;
        int inputPower = 1;
        int result = 0;

        System.out.println("Παρακαλώ εισάγετε έναν αριθμό: ");
        inputBase = scanner.nextInt();
        System.out.println("Παρακαλώ εισάγετε τη δύναμη: ");
        inputPower = scanner.nextInt();

        for ( int i =1; i <= inputPower; i++){
            result *= inputBase;
        }

        System.out.println(inputBase + "^" + inputPower + " = " + result);

    }
}
