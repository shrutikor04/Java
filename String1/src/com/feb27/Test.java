package com.feb27;

public class Test {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder();
		
		s.append("java");
		s.append("C#");
		s.append("JavaScript");
		s.append("AWS");
		System.out.println(s);
		s.insert(1,"CSS");
		System.out.println(s);
		s.replace(7,9,"John");
		System.out.println(s);
		s.delete(10,15);
		System.out.println(s);
		s.reverse();
		System.out.println(s);

	}

}
