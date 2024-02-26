package com.edubridge.decisionmaking;

import java.util.Scanner;

public class CascadeStatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		int k=sc.nextInt();
		if(i>j && j>k)
			System.out.println("i is greater"+i);
		else if(j>i && j>k)
			System.out.println("j is greater"+j);
		else
			System.out.println("k is greater"+k);

	

}
}
