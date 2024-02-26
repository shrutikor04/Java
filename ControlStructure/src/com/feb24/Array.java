package com.feb24;

public class Array {

	public static void main(String[] args) {
		
		//By Literal
		//returntype arrayname[]={};
		
		int arr[]= {10,20,30,40};
		
		//index start from 0
		//so 10 will be on 0 index no 20 will be on 1 and so on.
		//arr[] will fetch particular index value
		System.out.println(arr[3]); 
		
		//length is built in method to check size of array
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		} 
		//System.out.println(arr[10]);
	}

}
