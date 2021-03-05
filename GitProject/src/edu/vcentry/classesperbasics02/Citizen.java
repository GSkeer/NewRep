package edu.vcentry.classesperbasics02;

public class Citizen {

	public static void main(String[] args) {
  
		Person kumar = new Person("Ravi kumar", 25);
		
		System.out.printf("Name is %s \n" , kumar.getname());
		System.out.printf(" Age is %d \n",  kumar.getage());
		
		
		decorator();
      Person Neo = new Person();
		
		System.out.printf("Name is %s \n" , Neo.getname());
		System.out.printf(" Age is %d \n",  Neo.getage());

	}
   private static void decorator() {
	   System.out.println("\n ******************\n");   
   }
}
