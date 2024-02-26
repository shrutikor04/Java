package com.feb24;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		
		//by object
		//return type array name[]=new returntype[array size];
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the size of array:");
		//int size=sc.nextInt();
		int arr[]=new int[5];
		System.out.println("Enter Elements of array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements:");
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			
		}
			System.out.println(arr[2]);	

	}

}

/*arr[0]=10;
arr[1]=20;
arr[2]=30;
arr[3]=40;
arr[4]=50;*/