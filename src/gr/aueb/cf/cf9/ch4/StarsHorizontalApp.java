package gr.aueb.cf.cf9.ch4;

/**
 * θέλουμε να εκτυπώνει δέκα οριζόντια αστρακια(*)
 */
public class StarsHorizontalApp {
    public static void main(String[] args) {

        //Horizontal stars
        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }


        //Vertical stars

        for (int i = 1; i <= 10; i++) {
            System.out.println("*");
        }

        // Grid 10x10

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 1,2,3...... stars
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {     // Το εσωτρικό for ελέγχεται από το εξωτερικό for
                System.out.print("*");
            }
            System.out.println();


        }
        //10,9,8.......stars
        for (int i = 10; i <= 10; i--) {
            for (int j = 1; j <= i; j++) {     // Το εσωτρικό for ελέγχεται από το εξωτερικό for
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
