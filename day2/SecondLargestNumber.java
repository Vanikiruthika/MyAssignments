package week1.day2;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numArray= {22,67,98,1,34,58,99};
		int size=numArray.length;
		Arrays.sort(numArray);
		for (int i=0; i< numArray.length;i++)
			System.out.println(numArray[i]);

		System.out.println("size of array" + size);
		System.out.println("2nd largest number: "+ numArray[size-2]);
	}

}
