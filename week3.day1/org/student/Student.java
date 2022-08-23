package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department{
	public void studentName()
	{
		System.out.println("Vanikiruthika");
		
	}
	public void studentDept() 
	{
		System.out.println("Elecronics And Communication Engineering");
	}
	public void studentId()
	{

		System.out.println("06BEC56");
	}
	
	public static void main(String[] args) {
		
		System.out.println("College obj:");
		
		College collegeObj=new College();
		collegeObj.collegeName();
		collegeObj.collegeCode();
		collegeObj.collegeRank();
		
		System.out.println("Department object");
		Department depObj=new Department();
		depObj.deptName();
		depObj.collegeName();
		depObj.collegeCode();
		depObj.collegeRank();
		
		System.out.println("Student object");
		Student studentObj=new Student();
		studentObj.studentName();
		studentObj.studentDept();
		studentObj.studentId();
		studentObj.collegeName();
		studentObj.collegeCode();
		studentObj.collegeRank();
		studentObj.deptName();
	}
}
