package com.feb29;

class Vehicle{
	void Speed(int s) {
		System.out.println("Speed Of Vehicle:"+s);
	}
}

class Car extends Vehicle{
	void Speed(int s) {
	System.out.println("Speed Of Car:"+s);
	}
}
class Bus extends Vehicle{
	void Speed(int s) {
	System.out.println("Speed Of Bus:"+s);
	}
}
class Bicycle extends Vehicle{
	void Speed(int s) {
		System.out.println("Speed Of Bicycle:"+s);
		
	}
}

public class DynamicDispatch {

	public static void main(String[] args) {
		Vehicle v1,v2,v3;
		v1=new  Car();
		v2=new Bus();
		v3=new Bicycle();
		
		v1.Speed(100);
		v2.Speed(20);
		v3.Speed(50);
		

	}

}
