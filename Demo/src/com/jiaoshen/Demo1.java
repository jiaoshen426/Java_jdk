package com.jiaoshen;

public class Demo1 {
	public static void main(String[] args) {
		//String
		String a="abc";
		String b="abc";
		System.out.println(a==b);
		
		String a1="a"+"bc";
		String b1="abc";
		System.out.println(a1==b1);
		
		String temp2="c";
		String a2="ab"+temp2;
		String b2="ab"+temp2;
		System.out.print("a2==b2:");
		System.out.println(a2==b2);
		
		final String temp3="c";
		String a3="ab"+temp3;
		String b3="ab"+temp3;
		System.out.print("a3==b3:");
		System.out.println(a3==b3);
		
		//包装类
		short i=5;
		i+=2;
		
	}

}
