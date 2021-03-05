package edu.vcentry.classespersuperbasics06;

public class Citizen {
//tried super and poly in this same class
	public static void main(String[] args) {

	Indian indian = new Indian();
	indian.eats();
	
	Person person1 = new Person();
	person1.eats();
	
	
	//Indian indian2 = new Indian ("AADHAAR12345" , "PAN12345");
	
	//System.out.println("indina2's anme is" + indian2.getname());

	}

	private static void decorator() {
		System.out.println("\n ******************\n");
	}
}
