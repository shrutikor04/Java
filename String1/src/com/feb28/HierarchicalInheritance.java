package com.feb28;

class Student{
	String name="Shruti";
	String Address="Thane";
	int RollNo=17;
	String Qaulification="BSC CS";
	
}

class Course extends Student{
	String cName="JAVA FullStack";
	int fees=2000;
}

class Placement extends Student{
	String CompName="J.P.Morgan";
	String ctc="5lakh";
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		Course c1=new Course();
		System.out.println("Name of Student:"+c1.name);
		System.out.println("Address of Student:"+c1.Address);
		System.out.println("RollNo of Student:"+c1.RollNo);
		Placement p1=new Placement();
		System.out.println("Company Name:"+p1.CompName+"\nCTC:"+p1.ctc+"\nCourse Fees:"+c1.fees+"\nQualification of Student: "+p1.Qaulification);

	}

}
