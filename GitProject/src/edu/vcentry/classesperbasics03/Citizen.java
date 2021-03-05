package edu.vcentry.classesperbasics03;

public class Citizen {

	public static void main(String[] args) {
  
		//Person kumar = new Person("Ravi kumar", 25);
		
		//one time object is created as it is not ref
		//2 objects are created 
		
		System.out.println(new Person().getname());
		System.out.println(new Person ().getage());
		
		
		System.out.println(new Person("Ravi kumar", 25).getname());
		System.out.println(new Person("Ravi", 24).getname());
		System.out.println(new Person("Ravi", 24).getname());
		//similar to giving ref
		//new given its a single obj 
		
		
		
		decorator();
      

	}
   private static void decorator() {
	   System.out.println("\n ******************\n");   
   }
}
