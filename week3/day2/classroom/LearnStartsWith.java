package week3.day2.classroom;

import java.util.ArrayList;
import java.util.List;

public class LearnStartsWith {
	public static void main(String[] args) {
		List<String> myList=new ArrayList<String>();
		myList.add("Karthi");
		myList.add("Arun");
		myList.add("Dev");
		myList.add("Selva");
		myList.add("Anbu");
		myList.add("Sekar");
		for(int i=0;i<myList.size(); i++)

		{
			String s=myList.get(i);
			if(s.startsWith("S"))
			{
				System.out.println(s);
			}
		}
	}

}
