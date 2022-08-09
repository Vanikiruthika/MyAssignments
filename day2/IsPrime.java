package week1.day2;

public class IsPrime {
	public static void main(String[] args) {
		
		/*
		 * Iterate through all numbers from 2 to n-1 (input) and 
		 for every number check if it divides n (input). 
		 If we find any number that divides, print not prime.
		 If nothing divides, then print prime

		 */
		int n=25;
		boolean check=false;
		for (int i=2; i<n ; i++)
		{
			if(n%i == 0)
			{
				check=true;
				break;
			}
		}
		if(check==false)
		{
			System.out.println(n+" is a prime number");
			
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}
	}

}
