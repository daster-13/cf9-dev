package gr.aueb.cf.cf9.ch6;

/**
 * Ορίζιε ένα 2D array και κάει Populate τον πίνακα.
 * 2D arrays ορίζοται ως [γραμμή][στήλη].
 */

public class ArrayTwoDim {
    public static void main(String[] args) {
        int[][] grid = new int[2][3]; // δύο γραμμες κια τρεις στήλες
        int[][] grid2 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        grid [0][0] = 1;
        grid [0][1] = 2;
        grid [0][2] = 3;
        grid [1][0] = 4;
        grid [1][1] = 5;
        grid [1][2] = 6;

        for (int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; i++) {
                System.out.print( grid[i][j] + " " );
            }
            System.out.println();
        }

        for (int[] row: grid) {
            for (int el: row) {
                System.out.print(el+ " ");
            }
            System.out.println();
        }
    }
}
