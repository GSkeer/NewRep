package com.myclass.statics;

public class Main {

	public static void main(String[] args) {
		StaticsVsInstanceVariables obj1 = new StaticsVsInstanceVariables();
		System.out.println("Instance variable 1-" + obj1.getIntanceVar());
		
		System.out.println( "Static variable" + obj1.getStaticVariable());
		
		StaticsVsInstanceVariables obj2 =new StaticsVsInstanceVariables();
        System.out.println( "Instance variable 2-" + obj2.getIntanceVar());
		
		System.out.println("Static variable" + obj2.getStaticVariable());
		
		StaticsVsInstanceVariables obj3 =new StaticsVsInstanceVariables();
           System.out.println("Instance variable 3 -" + obj3.getIntanceVar());
		
		System.out.println("Static variable" + obj3.getStaticVariable());
	}
	
	
	
	//static method accessed using class
	//System.out.println ("static variable accessed using class" + StaticsVsInstanceVariables.getStaticVariable());
	
	//static method using method ---> made public
	
	//System.out.println("static variable accessed using method" + StaticsVsInstanceVariables.getStaticVariable());
	

}
