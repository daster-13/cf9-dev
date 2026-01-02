package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class    FactorialApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int result = 1;
        int i = 0;

        System.out.println("Παρακαλώ δώστε έναν αριθμό: ");
        number = scanner.nextInt();

        while(i <= number){
            result *= i;
            i++;
        }
        System.out.printf("%d! = %d%n", number,result);

    }

}
