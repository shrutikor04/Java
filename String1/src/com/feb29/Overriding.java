package com.feb29;

class Employee{
	void show(String name) {
		System.out.println("Employee Name:"+name);
	}
}

class Company{
	void show(String name) {
		System.out.println("Company Name:"+name);
	}
}

class Course{
	void show(String name) {
		System.out.println("Course Name:"+name);
	}
}
public class Overriding {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		Company c1=new Company();
		Course C1=new Course();
		
		e1.show("Shruti");
		c1.show("Capgemini");
		C1.show("COMPUTER SCIENCE");

	}

}
