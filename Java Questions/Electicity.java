import java.util.Scanner;
	class Electicity
		{
		 int Electicity_Unit;
		 double Current_Load, Assigned_Load,Bill;
		 Electicity()
		 {
			Electicity_Unit=0;
			Current_Load=0;
			Assigned_Load=0;
			Bill=0;
		 }
		 void getValues()
		 {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter Electicity Unit= ");
		 Electicity_Unit=sc.nextInt();
		 System.out.print("Enter Assigned_Load=");
		 Assigned_Load=sc.nextDouble();
		 System.out.print("Enter Current_Load=");
		 Current_Load=sc.nextDouble();
		 }
		 void calculateBill()
		 {
		  if(Electicity_Unit<=100)
				Bill=Electicity_Unit*3;
		  else if(Electicity_Unit>100 && Electicity_Unit<=300)
				Bill=Electicity_Unit*4;
		  else if(Electicity_Unit>300 && Electicity_Unit<=500)
				Bill=Electicity_Unit*5;
		  else	
				Bill=Electicity_Unit*6;
			if(Current_Load>Assigned_Load)
				Bill+=Bill*0.10;
			if(Assigned_Load<=2)
				Bill+=300;
			else if(Assigned_Load>2 &&Assigned_Load<=5)
				Bill+=400;
			else
				Bill+=500;
			if(Bill>3000)
				Bill-=Bill*0.08;
			}
			void showBill()
			{
				System.out.print("Electicity Bill="+Bill);
			}
			public static void main(String args[])
				{
					Electicity ob=new Electicity();
					ob.getValues();
					ob.calculateBill();
					ob.showBill();
				}
			}