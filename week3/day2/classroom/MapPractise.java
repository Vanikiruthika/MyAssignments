package week3.day2.classroom;

import java.util.HashMap;
import java.util.Map;

public class MapPractise {
	public static void main(String[] args) {
		String text="testleaf";
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for(int i=0; i<text.length();i++)
		{
			System.out.println(text.charAt(i));
			if(map.containsKey(text.charAt(i)))
			{
				map.put(text.charAt(i), map.get(text.charAt(i))+1);
			}
			else
			{
				map.put(text.charAt(i), 1);
			}
		}
		
		System.out.println("Map :"+map);
	}

}
