package com.feb29;
abstract class Bag{
	String type="Fastrack";
	abstract void show();
	
	void color(String color){
		System.out.println("Bag Color"+color);
	}
}
class BagInfo extends Bag{
	void show() {
	System.out.println("This is abstract method");
	
}
}
public class Abstraction {

	public static void main(String[] args) {
		BagInfo b1=new BagInfo();
		
		System.out.println(b1.type);
		b1.show();
		b1.color("Black");
		

	}

}
