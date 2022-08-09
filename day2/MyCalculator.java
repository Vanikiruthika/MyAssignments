package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		
		//create object of Calculator class
		Calculator calObj=new Calculator();
		
		//calling add method of Calculator class and printing addition result
		System.out.println("Sum of 10, 25 and 78 = " + calObj.add(10, 25, 78));
		
		//calling sub method of Calculator class and printing subtraction result
		System.out.println("Subtraction of 54 and 12 = " + calObj.sub(54, 12));
		
		//calling mul method of Calculator class and printing multiplication result
		System.out.println("Multiplication on 12 and 6 = " + calObj.mul(12, 6));
		
		//calling divide method of Calculator class and printing division result
		System.out.println("Division of 50 by 4 = "+ calObj.divide(50, 4));

	}

}
