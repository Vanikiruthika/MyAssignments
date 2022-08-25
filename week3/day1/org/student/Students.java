package org.student;

public class Students {
	public void getStudentInfo(int id)
	{
		System.out.println("Student id :"+id);
	}
	
	public void getStudentInfo(int id, String name)
	{
		System.out.println("student id :"+id);
		System.out.println("Student Name: "+ name);
	}
	public void getStudentInfo(String email,long phoneNumber)
	{
		System.out.println("Student email :"+ email);
		System.out.println("Student Phonenumber: "+phoneNumber);
	}
	public static void main(String[] args) {
		int id=7120656;
		String name="Vanikiruthika";
		String email="vanikiruthikad@gmail.com";
		long phoneNumber=9095157744l;
		Students studObj=new Students();
		studObj.getStudentInfo(id);
		studObj.getStudentInfo(id, name);
		studObj.getStudentInfo(email, phoneNumber);
		
		
	}

}
