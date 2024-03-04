package com.feb4;

class Employee{
	int id;
	String name;
	public Employee() {
		System.out.println("This is default constructor");
		}
	public Employee(int i,String n) {
		
		System.out.println(i+" "+n);
	}
}
public class Constructor {

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee(101,"Jhon");
	
	}

}
