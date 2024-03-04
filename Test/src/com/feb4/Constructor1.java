
package com.feb4;
class Student{
	String name;
	public Student() {
		name="Mand";
		System.out.println(name);
	}
	Student(String n){
		name=n;
		System.out.println(name);
	}
}

public class Constructor1 {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student("Triveni Katkar");
	

	}

}
