package week1.day2;

public class Calculator {
	
	//add method to add 3 numbers
	public int add(int num1, int num2, int num3)
	{
		int sum = num1 + num2 + num3;
		return sum;
	}

	//sub method to subtract 2 numbers
	public int sub(int num1, int num2)
	{
		int subtract = num1 - num2;
		return subtract;
	}
	
	//mul method to multiply 2 numbers
	public double mul(double num1, double num2)
	{
		double multiply = num1 * num2;
		return multiply;
	}
	//divide method to divide 2 numbers
	public float divide(float num1, float num2)
	{
		float divideResult = num1 / num2;
		return divideResult;
	}
	
}
