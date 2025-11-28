import java.util.Scanner;
class Student 
{
	int Roll;
	String Name;
public Student getValue()
{
 Scanner sc=new Scanner(System.in);
 Student ob=new Student ();
 System.out.println("Enter your roll No=");
 ob.Rollno=sc.nextInt();
 System.out.print("Enter your Name=");
 ob.Name=sc.next();
 return ob;
 }
 public static void display(Student ob)
 {
 System.out.println("Rollno="+ob.Rollno);
 System.out.println("Name="+ob.Name);
 }
 public static void main(String args[])
 {
	Student ob1=new Student();
	ob1=ob1.getValue();
	display(ob1);
 }
 }
	