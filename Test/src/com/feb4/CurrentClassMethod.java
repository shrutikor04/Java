package com.feb4;

class A{
	void show() {
		System.out.println("This is show method");
		
	}
	void disp() {
		this.show();
		System.out.println("This is disp mehtod");
	}
}

public class CurrentClassMethod {

	public static void main(String[] args) {
		A a1=new A();
		a1.disp();
		

	} 

}
