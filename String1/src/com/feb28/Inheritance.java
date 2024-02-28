package com.feb28;

class AccountHolder{
	void info(String accNo,String name) {
		System.out.println("Account Number:"+accNo+"\nAccount Name:"+name);
	}
}
class Bank extends AccountHolder {
	void getRoi(double roi) {
		System.out.println("Bank Interse:"+roi);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountHolder a1=new AccountHolder();
		a1.info("112", "Shruti");
		Bank b1=new Bank();
		b1.getRoi(3.6);
		b1.info("142", "Triveni"); 

	}

}
