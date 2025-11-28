import java.util.*;
class Program
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the value of a");
  int a=sc.nextInt();
  System.out.println("enter the value of b");
  int b=sc.nextInt();
  System.out.println("enter the value of c");
  int c=sc.nextInt();
  System.out.println("final Result");
  int res=(a+b-c);
  System.out.println("Result"+res);
  sc.close();
  }
 }