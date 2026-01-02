package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Calculates Hours to Minutes and Second for a given number of hours.
 */

public class HoursToMinSec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int HOURS_TO_MINUTES = 60;
        final int HOURS_TO_SECONDS = 3_600;
        int inputTimeInHours = 0;
        int timeInSeconds = 0;
        int timeInMinutes = 0;

        System.out.println("Παρακαλώ εισάγετε την ώρα:");
        inputTimeInHours = scanner.nextInt();
        timeInSeconds = inputTimeInHours * HOURS_TO_SECONDS;
        timeInMinutes = inputTimeInHours * HOURS_TO_MINUTES;

        System.out.printf( "Η ώρα  %d είναι %,d λεπτά και %,d δευτερολεπτα%n",inputTimeInHours,timeInMinutes,timeInSeconds);

    }
}
