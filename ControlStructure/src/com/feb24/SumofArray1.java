package com.feb24;

import java.util.Scanner;

public class SumofArray1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[5];
		System.out.println("Enter Elements of array");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			//sum=sum+arr[i];
		}
		System.out.println("The sum of array elements is:"+sum);
	}

	}


