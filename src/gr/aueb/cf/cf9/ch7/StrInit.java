package gr.aueb.cf.cf9.ch7;

/**
 * Δήλωση και αρχικοποίηση (Populate)
 * ενός{@link String}
 */

public class StrInit {
    public static void main(String[] args) {
        String s = "Athens";  // popular
        String s2 = new String("Athens");   // non popular
        String s3 = "";
        String S4 = null;
        boolean isEmpty;

        //isEmpty = s3.length() == 0;
        isEmpty = s3.isEmpty();


        System.out.println(s);
        System.out.println("Length:" + s.length());
        System.out.printf("City: %s\n", s);

    }
}
