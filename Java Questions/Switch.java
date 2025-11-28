import java.util.Scanner;
class Switch
{
 public static void main(String args[])
 {
	Scanner myObj = new Scanner (System.in);
	System.out.println("enter day");
	String day = myObj.nextLine();
	System.out.println("day is " +day);
 }
	
  switch(day)
  {
   case "sun" : System.out.println("sunday"); break;
   case "mon" : System.out.println("Monday"); break;
   case "Tue" : System.out.println("Tuesday"); break;
   case "Wed" : System.out.println("wednesday"); break;
   case "Thu" : System.out.println("Thursday"); break;
   case "Fri" : System.out.println("Friday"); break;
   case "Sat" : System.out.println("Saturday"); break;
}
}
}