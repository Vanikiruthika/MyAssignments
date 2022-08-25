package week3.day2.assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {
	public static void main(String[] args) {
		//PrintUniqueCharacter
		/*
		 * Problem
		 * 
		 * a) Take your name as input
		 * b) Print all unique characters only (any order)
		 * 
		 * Input:  babu
		 * Output: a u 
		 * 
		 */

		/*
		 * Psuedocode
		 * 
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 * 
		 */
		
		String name="Vanikiruthika";
		char[] charArray;
		//Convert String to Character array
		charArray=name.toCharArray();
		System.out.println(charArray);
		//Create a new Set -> HashSet
		Set<Character> set1=new HashSet<Character>();
		//Add each character to the Set and if it is already there, remove it
		for(int i=0; i<charArray.length; i++)
		{
			if(set1.contains(charArray[i]))
			{
				continue;
			}
			else
			{
				set1.add(charArray[i]);
			}
		}
		//Finally, print the set
		System.out.println(set1);
		
	}

}
