package gr.aueb.cf.cf9.ch5;

public class FloatingExpressions {
    public static void main(String[] args) {
        int intNum =10;
        float floatNum = 10.5f;
        double doubleNum = 1056789;
        double result = 0.0;

        result = intNum + floatNum + doubleNum; // Ολα μετατρέποντια στον μελύτερο τύπο

        System.out.println("Result is: " + result);
        System.out.printf("Result is: %.2f\n, result");
    }
}
