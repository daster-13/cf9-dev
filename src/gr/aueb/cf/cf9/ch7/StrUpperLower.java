package gr.aueb.cf.cf9.ch7;

public class StrUpperLower {
    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "athens";

        // equalIgnoreCase() με Normalization σε uppercase

        boolean isEqual = s1.toUpperCase().equals(s2.toUpperCase());
        boolean IsEqual2 = s1.toLowerCase().equals(s2.toLowerCase());


    }
}
