package week3.day2.classroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnListDuplicates {
	public static void main(String[] args) {
		List<Integer> numList=new ArrayList<Integer>();
		numList.add(1);
		numList.add(22);
		numList.add(3);
		numList.add(54);
		numList.add(65);
		numList.add(22);
		numList.add(43);
		Collections.sort(numList);
		System.out.println(numList);

		int check=0;
		for(int i=0;i<numList.size();i++)
		{
			if(numList.get(i)==22)
			{
				check++;
			}
		
	}
		System.out.println("22 is present : "+check+ " times");

	}
}
