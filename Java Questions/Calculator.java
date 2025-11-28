import java.util.*;
	public class Calculator{
		
	public static void main(String[] args)
	{
	 int a,b,c,ch;
	 System.out.println("enter two no");
	 Scanner s=new Scanner(System.in);
	 a=s.nextInt();
	 b=s.nextInt();
	 System.out.println("enter your choice");
	 ch=s.nextInt();
	switch(ch)
	 {
	  case 1:c=a+b;
			System.out.println("Addition"+c);
				break;
	  case 2:c=a-b;
			System.out.println("Substraction"+c);
				break;
	  case 3:c=a*b;
			System.out.println("Multiplication"+c);
				break;
	  default: System.out.println("Invalid Choice");
	 }
	}
   }
