import java.util.*;
Class TableExtendsThread
{ 
 Public void run()
 {
  for(int i=1; i<=10; i++)
  { 
   System.out.println("2*"+i"=" +(2*i));
   try
    {
	  Thread.Sleep(100);
	}
	Catch(Interrupted Exception e)
	 { 
	  System.out.println(e);
	 }
	}
   }
  }