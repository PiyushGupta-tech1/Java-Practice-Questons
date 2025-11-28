import java.util.*;
class Exception
{
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 try{
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		 int c=sc.nextInt();
		 
		 int result =(a*b/c);
		 System.out.println("result" + result);
         }
		 catch(ArithmeticException ob){
			 System.out.println("error:devide by zero");
		 }
		 catch(InputMismatchException ob){
			System.out.println("error:input integer");
		 }			
	 }   
}
		 