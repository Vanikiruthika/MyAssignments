		package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
	/*
	 * Problem 
	 * 
	 * There will be running number between 1 to 10
	 * One of the unique number will be missing
	 * Find the missing number
	 * 
	 * 
	 */
	
	/*
	 * Psuedocode
	 * 
	 * a) Remove the duplicates using Set
	 * b) Make sure the set is in the ascending order
	 * c) Iterate from the starting number and verify the next number is + 1
	 * d) If did not match, that is the number
	 * 
	 */
	public static void main(String[] args) {
	
		int[] numb= {10,2,1,3,7,6,4,8,9};
		 // a) Remove the duplicates using Set
		 //b) Make sure the set is in the ascending order
		Set<Integer> set1=new TreeSet<Integer>(); 
		for (int i=0; i< numb.length; i++)
		{
			set1.add(numb[i]);
		}
		System.out.println("Data in set1: "+set1);
		// Iterate from the starting number and verify the next number is + 1
		// If did not match, that is the number
		List<Integer> list1=new ArrayList<Integer>();
		list1.addAll(set1);
		for(int i=0;i<list1.size();i++)
		{
			if(list1.get(i)!=i+1)
			{
				System.out.println("Missing Number : "+(i+1));
				break;
			}
			
		}
	}

}
