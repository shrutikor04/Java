package com.feb29;

class Maths{
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	void add(String a,String b) {
		System.out.println(a+b);
	}
}

public class Overloading {

	public static void main(String[] args) {
		Maths m1=new Maths();
		m1.add(10, 45);
		m1.add(10,20,30);
		m1.add("Shruti", " Kor ");

	}

}
