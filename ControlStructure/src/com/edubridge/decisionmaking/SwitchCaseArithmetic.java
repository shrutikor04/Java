package com.edubridge.decisionmaking;

import java.util.Scanner;

public class SwitchCaseArithmetic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice");
		int ch=sc.nextInt();
		System.out.println("Enter A");
		int a=sc.nextInt();
		System.out.println("Enter B");
		int b=sc.nextInt();
		
		switch(ch){
		case 1:
			int i=a+b;
			System.out.println("Addition"+i);
			break;
		
		case 2:
			int j=a-b;
			System.out.println("Substraction"+j);
			break;
			
		case 3:
			int k=a/b;
			System.out.println("Division"+k);
			break;
		
		case 4:
			int l=a*b;
			System.out.println("Multiplication"+l);
			break;
			
			default:
				System.out.println("Wrong choice");
			
		}
		

	}

}
