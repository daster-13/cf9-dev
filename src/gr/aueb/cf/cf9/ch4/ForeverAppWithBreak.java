package gr.aueb.cf.cf9.ch4;

public class ForeverAppWithBreak {
    public static void main(String[] args) {
        int count = 0;
        final int MAX = 100;

        for(;;){
            System.out.println("forever");
            count++;;
            if (count % 20 == 0) System.out.println();
            if (count ==  MAX) break;

        }
    }

}
