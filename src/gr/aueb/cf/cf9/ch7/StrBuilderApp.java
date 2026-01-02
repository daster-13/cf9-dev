package gr.aueb.cf.cf9.ch7;

/**
 * concat becomes efficient with StringBuilder
 */

public class StrBuilderApp {
    public static void main(String[] args) {
        String concatStr = "";
        long timeStart = 0L;
        long timeEnd = 0L;
        double elapseTime = 0.0;

        timeStart = System.currentTimeMillis();
        for (int i = 1; i <= 100_000; i++){
            concatStr = concatStr + i;
        }


        timeStart = System.currentTimeMillis();
        elapseTime =(timeEnd -timeStart) / 1000.0;
        System.out.println("Elapse time: " + elapseTime + " seconds");

        //String Builder
        StringBuilder sb = new StringBuilder(); // mutable
        timeStart = System.currentTimeMillis();
        for (int i = 1; i <= 100_000; i++){
            sb.append(i);
        }


        timeStart = System.currentTimeMillis();
        elapseTime =(timeEnd -timeStart) / 1000.0;
        System.out.println("Elapse time: " + elapseTime + " seconds");



    }
}
