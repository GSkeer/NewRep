package edu.vcentry.classesperpolymorphism;

public class Citizen {
//tried super and poly in this same class
	
	public static void main(String[] args) {

	Indian indian = new Indian();
	indian.eats();
	indian.canVote();
	
	Person person1 = new Person();
	person1.eats();
	
	// complile time type   // Run time time   
	Person person2 =    new Indian ( "keera", 20 , "AADHAAR12345" , "PAN12345");
	person2.eats();
	
	// Run time type decides the data .
	
	// super class ref variable can point to subclass objects- 
	
	//only during run time /super class ref cannot point to subclass  runtime objects as it causes error
	
	//eg person2.canVote()---will cause complie  time issue 
	
	//eg Indian indian = new Person (); ----> subcalss cannot point to superclass
	
	
	//Indian indian2 = new Indian ("AADHAAR12345" , "PAN12345");
	
	//System.out.println("indina2's anme is" + indian2.getname());
	
	
	
	//multiple inheritance
	
	Indian person3 = new NorthIndian("Singh" , "PAN12345" , "AADHAAR12345" , 38);
	person3.eats();
	person3.canVote();

	}

	private static void decorator() {
		System.out.println("\n ******************\n");
	}
}
