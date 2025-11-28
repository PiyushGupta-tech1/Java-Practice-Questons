import java.util.*;

class Starss {
    public static void main(String[] args) {
        int i, j;
        int rows = 5; // Define the number of rows

        for (i = 0; i < rows; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
