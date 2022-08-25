package week3.day2.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
	
//	Declare a String as PayPal India
//		Convert it into a character array
//		Declare a Set as charSet for Character
//		Declare a Set as dupCharSet for duplicate Character
//		Iterate character array and add it into charSet
//		if the character is already in the charSet then, add it to the dupCharSet
//		Check the dupCharSet elements and remove those in the charSet
//		Iterate using charSet
//		Check the iterator variable isn't equals to an empty space
//		print it
		String s="PayPal India";
		char[] c=s.toCharArray();
		Set<Character> charSet=new HashSet<Character>();
		//Set<Character> dupCharSet=new HashSet<Character>();
		for(int i=0;i<c.length;i++)
		{
			charSet.add(c[i]);
		}
	
		List<Character> l1=new ArrayList<Character>();
		l1.addAll(charSet);
		for(int i=0;i<l1.size();i++)
		{
			if(l1.get(i)!=' ')
			{
				System.out.println(l1.get(i));
			}
		}
	}

}
