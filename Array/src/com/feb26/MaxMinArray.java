package com.feb26;

import java.util.Scanner;

public class MaxMinArray {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();	
		int array[]=new int[size];
		
		System.out.println("Enter the elements of array:");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}*/
		int array[]= {10,20,3,40,50,60};
		//Assume the first element is the maximum initially.
		int max=array[0];
		
		//Assume the first element is the minimum initially.
		int min=array[0];
		
		for(int i=1;i<array.length;i++) {
			
			if(array[i]>max) {
				//Update maximum value.
				max=array[i];
			}
			if(array[i]<min) {
				//Update minimum value.
				min=array[i];
			}
		}
		System.out.println("Maximum value: "+max);
		System.out.println("Minimum value: "+min);
	}

}
