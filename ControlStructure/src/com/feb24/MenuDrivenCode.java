package com.feb24;

import java.util.Scanner;

public class MenuDrivenCode {

	public static void main(String[] args) {
		System.out.println("Welcome to Student Management System");
		
		int choice=0;
		do {
			System.out.println("1. Student Information:");
			System.out.println("2. Student Course Ratings:");
			System.out.println("3. Student Eligibility Criteria:");
			System.out.println("4. Exit");
			
			Scanner sc=new Scanner(System.in);
		    choice=sc.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("Enter name:");
				String name=sc.next();
				System.out.println("Enter student name:"+name);
				
				System.out.println("Enter Age:");
				int age=sc.nextInt();
				System.out.println("Enter Student Age:"+age);
				
				System.out.println("Enter Address:"); 
				String address=sc.next();
				System.out.println("Enter Student Address:"+address);
				break;
				
			case 2:
				System.out.println("Student course ratings:");
				double rating=sc.nextDouble();
				if(rating>=4) {
					System.out.println("Good");
				}
				else {
					System.out.println("Need to improve");
				}
				break;
				
			case 3:
				System.out.println("Student Eligibility Criteria:");
				int sa=sc.nextInt();
				if(sa>=50) {
					System.out.println("Eligible for placement");
				}
				else {
					System.out.println("Not Eligible for placement");
				}
				break;
				
			case 4:
				System.out.println("Bye Bye.........");
				break;
				
				default:
					System.out.println("Wrong Input!!!!!!!");
				
			}
		}while(choice!=4);
		}
	}



