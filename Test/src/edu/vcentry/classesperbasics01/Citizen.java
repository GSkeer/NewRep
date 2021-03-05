package edu.vcentry.classesperbasics01;

public class Citizen {

	public static void main(String[] args) {
  
		Person kumar = new Person("Ravi kumar" , 25);
		
		System.out.printf("Name is %s \n" , kumar.getname());
		System.out.printf(" Age is %d \n",  kumar.getage());
		
		System.out.println("\n ******************\n");
		
		//kumar.setName("Ravi kumar");
		//kumar.setAge(21);
		
		//System.out.printf("Name is %s \n" , kumar.getname());
		//System.out.printf(" Age is %d \n",  kumar.getage());

	}

}
