package gr.aueb.cf.ch16.callbacks;

public class Main {
    public static  void main(String[] args){
        Printable printable = new Printable() {
            Override
            public void print{
                System.out.println("Hello World!");
            }
        };

        //Lamda expression
        Printable printable2 = () -> System.out.println("Hello World!");
        Printable printable3 =() -> doPrint();

        //Method Reference
        Printable printable4 = Main :: doPrint;
        doWithPrintable(printable);
        doWithPrintable(printable2);
        doWithPrintable(printable3);
        doWithPrintable(printable4);

    }
    public static void doPrint(){
        System.out.println("Hello World");
    }
    public static  void doWithPrintable(Printable printable) {
        printable.print();
    }
}

