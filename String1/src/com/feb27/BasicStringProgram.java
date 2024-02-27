package com.feb27;

import java.util.Scanner;

public class BasicStringProgram {

	public static void main(String[] args) {
		String name="john";
		System.out.println(name);
		String s=new String("Good Evening");
		System.out.println(s);
		char ch[]= {'M','U','M','B','A','I'};
		String s1=new String(ch);
		System.out.println(s1);
		System.out.println("Size of String:"+s1.length());
		String fname="Shruti";
		String lname="Kor";
		
		System.out.println(fname+lname);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username");
		String username=sc.nextLine();
		
		System.out.println("Enter the Password");
		String password=sc.nextLine();
		
		if(username.equals("Shruti")&& password.equals("SSD")) {
			System.out.println("Login Successfully....");
		}
		else {
			System.out.println("Wrong ....");
		}

	}

}
