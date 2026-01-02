package gr.aueb.cf.cf9.ch7;

public class StrTraverse {
    public static void main(String[] args) {
        String str = "Coding Factory";

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " ");
        }

        // reverse
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i) + " ");
        }
    }
}
