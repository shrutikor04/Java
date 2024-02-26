package com.feb24;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= new int[4];
		System.out.println("Enter Elements of array");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//int arr[]= new int[] {1,2,3,4};
		System.out.println("original array");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Reverse Array");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}

	}

}
