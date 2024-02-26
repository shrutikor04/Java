package com.edubridge.decisionmaking;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student ID:");
		int studentId=sc.nextInt();
		System.out.println("Enter Student Name:");
		String name=sc.next();
	
		System.out.println("Enter marks m1:");
		int m1=sc.nextInt();
		
		System.out.println("Enter marks m2:");
		int m2=sc.nextInt();
		
		System.out.println("Enter marks m3:");
		int m3=sc.nextInt();
		
		
		int total=m1+m2+m3;
		
		double avg= total/3;
		
		if(avg>=90 && avg<=100) {
			System.out.println("Grade A");

		}
		else if(avg<=80 && avg>=50) {
			System.out.println("Grade B");
		}
		else if(avg<=50 && avg>=35) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Fail");
		}

	}

}
