package week3.day2.assignments;

import java.util.HashSet;
import java.util.Set;
public class PrintDuplicateNumbers {
	public static void main(String[] args) {
		

		/*
		 * Problem Statement : Print only duplicate values
		 * Expected output: 4 and 8
		 * 
		 * How to solve?
		 * 1) Regular for loop
		 * 2) Using Set
		 * 
		 * Using Set 
		 * 
		 * a) Add every element into Set
		 * b) If it is already there in the Set -> Print duplicate
		 * 
		 */
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		
		//2) Using Set
		Set<Integer> set1=new HashSet<Integer>();
		for (int i=0;i< data.length;i++)
		{
			if(set1.contains(data[i]))
			{
		 System.out.println("Duplicate element : "+data[i]);
			}
			else
			{
				set1.add(data[i]);
			}
		}
	}
}
