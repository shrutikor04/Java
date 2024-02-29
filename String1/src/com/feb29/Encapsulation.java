package com.feb29;

class Product{
	private int pId;
	private String pname;
	private int Price;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		Product p1=new Product();
		
		p1.setpId(101);
		p1.setPname("Speaker");
		p1.setPrice(2000);
		
		System.out.println(p1.getpId()+" \n "+p1.getPname()+" "+p1.getPrice());

	}

}
