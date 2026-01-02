package gr.aueb.cf.cf9.ch3;

/**
 * Sum of 10, from 1 to 10.
 */

public class SumMul {
    public static void main(String[] args) {
        int j = 1;
        int mUl = 1;

        while ( j <= 10) {
            mUl *= j;
            j++;

        }
        System.out.println( "Sum:" + mUl);
    }
}
