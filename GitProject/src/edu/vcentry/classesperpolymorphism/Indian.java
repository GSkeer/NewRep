package edu.vcentry.classesperpolymorphism;

public class Indian extends Person {
	
	
	private String aadhaar;
	private String pan;
	
	
	
	public Indian() {
		super("Rani" , 24);
	}
 
	//this and super cannot be used in same statement as this /super should be a 1st statement in a constructor


	public Indian(String aadhaar, String pan) {
		super("Gautham" , 22);
		this.aadhaar = aadhaar;
		this.pan = pan;
	}
	
	public Indian(String name , int age ,String aadhaar, String pan) {
		super(name , age);
		this.aadhaar = aadhaar;
		this.pan = pan;
	}
	
public void eats () {
		
		System.out.printf("%s eats dosa \n" , getname() );
		
}
	
	public void canVote () {
		
		if (getage()> 18) {
			
			System.out.printf("%s can vote /n" , getname());
		}
		
		else {
			System.out.printf("%s cannot vote /n" , getname());
		}
	}
	}
