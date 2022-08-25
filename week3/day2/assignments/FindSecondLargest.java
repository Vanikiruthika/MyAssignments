package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	public static void main(String[] args) {
		
		
		// Here is the input
				
				//       output= 7;

				/*
				 * Pseudo Code: 
				 * a) Create a empty Set Using TreeSet
				 * b) Declare for loop iterator from 0 to data.length and add into Set 
				 * c) converted Set into List
				 * d) Print the second last element from List
				 * 
				 * 
				 */
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		//Create a empty Set Using TreeSet
		Set<Integer> set1=new TreeSet<Integer>();	
		//Declare for loop iterator from 0 to data.length and add into Set
		for(int i=0;i<data.length;i++)   
		{
			set1.add(data[i]);
		}
		System.out.println("Data in set : "+set1);

		List<Integer> list1=new ArrayList<Integer>();
		//convert Set into List
		list1.addAll(set1); 
		System.out.println("Data in list : "+list1);
		int listSize = list1.size();
		System.out.println(listSize);
		//Print the second last element from List
		System.out.println("2nd largest element : "+ list1.get(listSize-2)); 
	}

}
