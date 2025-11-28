package Mypack;
import java.util.*;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number array");
		
		int row=sc.nextInt();
		
		int rows=0;
		int colums = 0;
		int[][] arr=new int[rows][colums];
		
		System.out.println("enter element of 2d array");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<colums;j++)
			{
				arr[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("enter target number");
		int traget=sc.nextInt();
		
		boolean found=false;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<colums;j++)
			{
				if(arr[i][j]==traget)
				{
					System.out.println("traget colums at index");
					found=true;
					break;
				}
			}
			if(found) 
				break;
			
		}
		if(!found)
		{
		
			System.out.println("-1");
		}
		sc.close();
		
		
		
	}

}
