class Abc
{
 int a,b;
 class Www
 {
  void display()
  {
   System.out.println("www");
  }
 }
 public static void main(String args[])
 {
  Abc ob=new Abc();
  Www ob1=ob.new Www();
  ob1.display();
  }
 }