package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class PowerMethodApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = 0;
        int base = 0;
        int result = 0;

        System.out.println(" Please enter two numbers: ");
        base = scanner.nextInt();
        power = scanner.nextInt();

        result = powerMethod(power, base);

        System.out.println(result);

    }
    public static int powerMethod( int power , int base) {
        int result = 1;
        for ( int i= 1; i <= power; i++){
            result *= power;
        }
        return result;


    }
}
