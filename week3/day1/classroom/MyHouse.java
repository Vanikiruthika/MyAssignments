package week3.day1.classroom;



public class MyHouse {
	public static void main(String[] args) {
		
		System.out.println("Object ceated using class Land");
		Land landObj=new Land();
		landObj.buildBedrooms(3);
		landObj.buildBalcony();
		landObj.buildParking();
		landObj.buildGarden();
		System.out.println();
		//planob dont allow to use buildgarden method as we create object using Plan
		System.out.println("Object ceated using interface Plan");
		Plan planObj=new Land();
		planObj.buildBedrooms(3);
		planObj.buildBalcony();
		planObj.buildParking();
		
		
		
	}

	

}
