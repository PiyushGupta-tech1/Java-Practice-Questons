import java.util.*;
 public Class maxarray {
    public static void main (String[] args)
	{ 
	  int[] arr={2,3,-8,7,-1,2,3};
	  int maxsum=Integer.min_value;
	  for(int i=0; i<arr.length; i++)
	  {
	   int sum=0; 
	   for(int j=1; j<arr.length; j++)
	   {
	    sum = sum+arr[j];
		maxsum=math.max(sum,maxsum);
		}
	   }
	   system.out.println(maxsum);
	  }
	 }