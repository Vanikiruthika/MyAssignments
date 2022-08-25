package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
	/*
	 * Pseudo Code
	 *input: int[] a={3,2,11,4,6,7};
	 *        int[] b={1,2,8,4,9,7};
	 *output:2,4,7
	 *
	 * a) Declare An Array for {3,2,11,4,6,7};	 
	 * b) Declare another Array for {1,2,8,4,9,7};
	 * c) create a two empty Lists - list1 & list2
	 * c) Declare for loop iterator from 0 to array a.length and add into list1
	 * d) Declare for loop iterator from 0 to array b.length and add into another list2
	 * e) Compare Both list1 & list2 using a nested for loop
	 *    1)Print the matching number
	 *  
	 */
	public static void main(String[] args) {
		
	// Declare An Array for {3,2,11,4,6,7};	 
	// Declare another Array for {1,2,8,4,9,7};
	int[] a={3,2,11,4,6,7};
	int[] b={1,2,8,4,9,7};
	//create a two empty Lists - list1 & list2
	List<Integer> l1=new ArrayList<Integer>();
	List<Integer> l2=new ArrayList<Integer>();
	//Declare for loop iterator from 0 to array a.length and add into list1
	for(int i=0;i< a.length;i++)
	{
		l1.add(a[i]);
	}
	//Declare for loop iterator from 0 to array b.length and add into another list2
	for(int i=0;i< b.length;i++)
	{
		l2.add(b[i]);
	}
	System.out.println(l1);
	System.out.println(l2);
	System.out.println("Matching numbers: ");
	// Compare Both list1 & list2 using a nested for loop
	//Print the matching number
	for(int i=0; i<l1.size();i++)
	{
		for(int j=0;j<l2.size();j++)
		{
			if(l1.get(i)==l2.get(j))
			{
				System.out.println(l1.get(i));
			}
		}
	}
}
}
