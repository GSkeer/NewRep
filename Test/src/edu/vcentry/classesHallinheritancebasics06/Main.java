package edu.vcentry.classesHallinheritancebasics06;

import edu.vcentry.classesperbasics02.Person;

public class Main {

	public static void main(String[] args) {
		
    MarrigeHall marriagehall = new  MarrigeHall ();
     marriagehall.purpose();

     Hall Newhall = new Hall();
     Newhall.setcapacity(1500);
     
     System.out.printf(" capacity is %d \n",  Newhall.getcapacity());
    
}

}
