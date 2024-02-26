package com.edubridge.decisionmaking;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		int weight=sc.nextInt();
		if(age>=18 && weight>=45)
		{
			System.out.println("Eligible to donate the blood.");
		}
		else 
		{
			System.out.println("Not Eligible to donate the blood.");
		}
		sc.close();
	}

}
