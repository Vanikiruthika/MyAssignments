package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,7,6,8};

		// Sort the array	
		// loop through the array (start i from arr[0] till the length of the array)
		// check if the iterator variable is not equal to the array values respectively
		// print the number
		// once printed break the iteration
		
		Arrays.sort(arr);
		for(int i=1;i<= arr.length;i++)
		{
			if(i !=arr[i-1])
			{
				System.out.println(" Missing element in array = " + i);
				break;
			}
		}
	}

}
