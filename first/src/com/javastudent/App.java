package com.javastudent;

public class App {
	
	public static void main(String[] args) {
		//math object//
		
		int a=10 ; int b=11;
		
		System.out.println(Math.PI);
		System.out.println(Math.max(a, b));
		System.out.println(Math.min(a, b));
		System.out.println(Math.log10(a));
		System.out.println(Math.multiplyExact(a, b));
		System.out.println(Math.sqrt(49));
		System.out.println(Math.sqrt(-9));
		System.out.println(Math.abs(-9));
		double getNumber = (int)Math.random()*100;
		System.out.println(getNumber);
		
	}
}