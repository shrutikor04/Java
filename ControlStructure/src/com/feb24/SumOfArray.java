package com.feb24;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		
		int[] arr=new int[] {3,4,5,6,7,8};
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			//sum=sum+arr[i];
		}
		System.out.println("The sum of array elements is:"+sum);
	}

}
