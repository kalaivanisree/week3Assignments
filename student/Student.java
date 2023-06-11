package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName()
	{
		System.out.println("Raja");
	}
	
	public void studentDept()
	{
		System.out.println("Computer Science");
	}
	
	public void studentId()
	{
		System.out.println("234");
	}
	
	
	public static void main(String[] args) {
		 
		Student sd=new Student();
		sd.collegeName();
		sd.deptName();
		sd.studentName();
		sd.studentDept();
		sd.studentId();
		
		
		
		

	}

}
