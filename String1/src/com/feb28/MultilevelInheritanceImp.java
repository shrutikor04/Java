package com.feb28;
class Vehicle{
	double speed(double s) {
		return s;
	}
	
}
class car extends Vehicle{
	String showColor(String color) {
		return color;
	}
}
class Bike extends car{
	int showPrize(int prize) {
		return prize;
	}
	
}
class bicycle extends Bike{
	int showYearModel(int year) {
		return year;
	}
	
}


public class MultilevelInheritanceImp {

	public static void main(String[] args) {
		bicycle b1=new bicycle();
		System.out.println("The Model Year of bicycle:"+b1.showYearModel(2021));
		System.out.println("The Speed of Vehicle is: "+b1.speed(90.678));
		System.out.println("The color of car is: "+b1.showColor("White"));
		System.out.println("The Prize of Bike is:"+b1.showPrize(100000));

	}

}
