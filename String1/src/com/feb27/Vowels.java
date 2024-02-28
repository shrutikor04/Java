package com.feb27;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//String s= "The rain in the spain";
		//System.out.println("The String is:"+s);
		System.out.println("Enter the Sentence:");
		String s=sc.next();
		int vcount=0,ccount=0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'||s.charAt(i)=='u') 
				vcount++;
				else if(s.charAt(i)>='a' && s.charAt(i)<='z')
					ccount++;
			}
		System.out.println("The total number of vowels is:" +vcount);
		System.out.println("The total number of consonants is:" +ccount);
		}
		

	}


