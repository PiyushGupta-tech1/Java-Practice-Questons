import java.util.Scanner;
class Normal
{ 
 public static void main(String args[])
 { 
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the value of a ");
 int a=sc.nextInt();
 System.out.println("Enter the value of b ");
 int b=sc.nextInt();
 System.out.println("Enter the value of c ");
 int c=sc.nextInt();
 System.out.println("Final result ");
 int res=(a+b-c);
 System.out.println("Result"+res);
 }
}
