import java.util.*;

class ExceptionHandling {
    public static void main(String args[]) {
		
        int a = 10;
        int b = 20;
        int c = 30;
   
	   try { 
            int result = (a * b / c + b * c / a);
            System.out.println("Result: " + result);
        } catch(Exception e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch(Exception e) {
           System.out.println("An unexpected error occurred: "+ e);
        }
    }
}
 