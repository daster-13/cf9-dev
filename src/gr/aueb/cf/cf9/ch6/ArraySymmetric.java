package gr.aueb.cf.cf9.ch6;

/**
 * Ελέγχει  αν  ένας πίνακα ς ακεραάιων είναι συμμερτρικός ή όχι.
 * Συμμετρικός είναι ένας πίνακας αν διαβάζεται το ίδιο από την αρχή και από το τέλος.
 * για παραδειγμα,[1, 2 ,3, 2, 1]
 */

public class ArraySymmetric {
    public static void main(String[] args) {

    }
    public static Boolean isArraySymmetric(int[] arr) {
      //  Boolean isSymmetric = true;

        for ( int i = 0, j = arr.length-1; i < j; i++ , j--){
            if (arr[i] != arr[j]){
              //  isSymmetric = false;

              //  break;
                return false;
            }

        }
        return  true;

    }
}
