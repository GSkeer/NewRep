package com.myclass.Composition;

public class Main {

	public static void main(String[] args) {
		B b1 = new B(5);
		
		
		A a2 = new A (2,3,b1);
		
		//System.out.printf("My local A is %d\n" , localA);
		//System.out.printf("My local A is %d\n" , b1.getc());
	}

}
