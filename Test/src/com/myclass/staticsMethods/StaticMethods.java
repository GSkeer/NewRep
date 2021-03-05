package com.myclass.staticsMethods;

public class StaticMethods {
	
	private  int instanceVar;   
	public static int staticVariable; 
	//should be private
	
	public StaticMethods() {
		//instanceVar += 1;
		//staticVariable += 1;
		
	}
public static void staticMethod() {  //non static method can access static and non static method vice versa
	//instanceVar += 1;
	
	anotherStaticMethod();
	staticVariable = staticVariable +1;
}
public void instanceMethod() {
	
	instanceVar += 1;
	staticVariable += 1;
	nonstaticmethod();
	anotherStaticMethod();
}

public static void anotherStaticMethod() {
	
	System.out.println("I am static");
}
public void nonstaticmethod() {

}}