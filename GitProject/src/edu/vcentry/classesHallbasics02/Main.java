package edu.vcentry.classesHallbasics02;

import edu.vcentry.classesperbasics02.Person;

public class Main {

	public static void main(String[] args) {
		
       Hall firstHall = new Hall("Lake view" , 50);
		
       //firstHall.setName ("Lake View");
       //firstHall.setcapacity(50);
       
       
		System.out.printf("Name is %s \n" , firstHall.getname());
		System.out.printf(" Age is %d \n",  firstHall.getcapacity());
	}

}
