package gr.aueb.cf.cf9.ch3;

import com.sun.jdi.PathSearchingVirtualMachine;

/**
 * Δίνουμε αρχική τιμή, τελιή τιμή και βήμα αύξησης
 * και υπολογίζεται το πλήθος των επαναλήψεων
 */

public class GenericWhileApp {
    public static void main(String[] args) {
        int i = 1;
        int endVal = 10;

        while (i <= endVal) {
            System.out.println("i = " +i);
            i++;
        }
        System.out.println("Επαναλήψεις / loops/ Iterations: " + (i- 1)) ;
    }
}
