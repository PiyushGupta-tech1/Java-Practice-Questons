import java.util.*;
Class Table
{
 public static void displayTable(int lowerLimit, int upperLimit) {
		
        for (int i = lowerLimit; i <= upperLimit; i++) {
            if (i % 5 == 0) {
                try {
                    throw new NullPointerException("Divisible by 5");
                } 	catch (NullPointerException e) {
                    System.out.println(e.getMessage());
                }
            } 
			 else {
                for (int j = 1; j <= 10; j++) {
                    System.out.println(i + " * " + j + " = " + (i * j));
                }
                System.out.println(); // Add a separator between tables
            }
        }
    }
}
