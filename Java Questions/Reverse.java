	import java.util.*;
	public class Reverse
		{
		public static void main(String[] args) {
			int[] arr = {1, 2, 3, 4, 5, 6};
			int start = 2;
			int end = 4;
			
			// Reverse the array within the range [start, end]
			while (start < end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
			
			// Print the modified array
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	}
