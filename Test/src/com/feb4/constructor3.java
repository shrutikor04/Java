package com.feb4;

class product{
	int price;
	String pname;
	int quantity;
	String ODate;
	String RDate;
	
	public product(){
		System.out.println("Amazon Product");
	}
	product(int i,String n){
		price=i;
		pname=n;
		System.out.println("Price of product:"+i);
		System.out.println("Name of product:"+n);
		
	}
	product(int i1,String n1,String n2){
		quantity=i1;
		ODate=n1;
		RDate=n2;
		
		System.out.println("Quantity of Product:"+i1);
		System.out.println("Product Order Date:"+n1);
		System.out.println("Product Receive Date:"+n2);
		
	}
}
public class constructor3 {

	public static void main(String[] args) {
		product p1=new product();
		product p2=new product(1000,"Bag+");
		product p3=new product(2,"2/2/2024","2/3/2024");
		
	}

}
