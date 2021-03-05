package edu.vcentry.classesperpolymorphism;

public class NorthIndian extends Indian {
	
	
	private String aadhaar;
	private String pan; 
	
	
	public NorthIndian(String name, String aadhaar, String pan, int age) {
		super(name ,age ,aadhaar , pan);
		
	}
	
public void eats () {
		
		System.out.printf("%seats chapathi\n" , getname() );
}
	
	}
	
	




