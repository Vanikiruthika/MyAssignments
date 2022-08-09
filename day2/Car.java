package week1.day2;

public class Car {
	
	public void printCarBrand()
	{
		System.out.println("Car brand : Maruti" );
	}

	public String getCarColour()
	{
		return "Blue";
	}
	public int getCarEngineNumber()
	{
		return 34324234;
	}
	
	public int addTwoNum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public int multiply(int a,int b)
	{
		int c=a*b;
		return c;
	}
	
	//Divide 2 numbers
	public int divide(int a,int b)
	{
		int c=a/b;
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		// print car brand
		Car objCar=new Car();
		objCar.printCarBrand();
		
		//get car colour
		String carColour = objCar.getCarColour();
		System.out.println("Car Colour : "+ carColour);
		
		//get car engine number
		int carEngineNumber = objCar.getCarEngineNumber();
		System.out.println("Car Engine Number : "+ carEngineNumber);

		//add 2 numbers
		int sum=objCar.addTwoNum(10, 20);
		System.out.println("Sum of 2 numbers : "+sum);
		
		//multiply 2 numbers
		int mult=objCar.multiply(12, 5);
		System.out.println("Multiply of 2 numbers : "+mult);
		
		//Divide 2 numbers
		int divide=objCar.divide(68,2);
		System.out.println("Division of 2 numbers : "+ divide);
				
	}

	
}
