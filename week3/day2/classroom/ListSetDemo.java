package week3.day2.classroom;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
public class ListSetDemo {
	public static void main(String[] args) {
		int count=0;
		List<Integer> listnew=new ArrayList<Integer>();
		listnew.add(1);
		listnew.add(22);
		listnew.add(3);
		listnew.add(54);
		listnew.add(65);
		listnew.add(22);
		listnew.add(43);
		listnew.add(67);
		listnew.add(98);
		listnew.add(1);
		System.out.println("Duplicate values in list :");
		for(int i=0;i< listnew.size();i++)
		{
			count=1;
			for(int j=i+1;j<listnew.size();j++)
			{
				if(listnew.get(i)==listnew.get(j))
				{
					count++;
				}
			}
			if(count>1)
			{
				
				System.out.println(listnew.get(i) +" count : "+ count);
			}
			
		}
		Set<Integer> set=new LinkedHashSet<Integer>();
		set.addAll(listnew);
		System.out.println("Uniue values in set :");
		System.out.println(set);
		
	}
}