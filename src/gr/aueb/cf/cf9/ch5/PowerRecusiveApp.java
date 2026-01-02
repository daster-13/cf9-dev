package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class PowerRecusiveApp {
    public static void main(String[] args) {
        int base = 0;
        int power =0;
       int  result = 0;

        Scanner scanner = new Scanner(System.in);
        base = scanner.nextInt();
        power = scanner.nextInt();

        result = powerRecursive(base, power);

        System.out.println("The result = " + result);

    }
    public static int powerRecursive( int base, int power){
//        if ( power == 0){
//            return 1;
//        }
       // return base * powerRecursive(base , power -1);
        return power == 0? 1 : base * powerRecursive(base , power -1);
    }
}
