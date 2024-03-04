package com.feb4;
class User{
	String uname;
	String password;
	public User(String uname,String password) {
		this.uname=uname; // refer the current class
		this.password=password;
		
	}
	void show() {
		System.out.println(uname+" "+password);
	}
}

public class ThisKeyword {

	public static void main(String[] args) {
		
		User u1=new User("john","john123");
		u1.show();

	}

}
