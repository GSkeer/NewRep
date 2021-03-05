package edu.vcentry.classesHallbasics01;

import edu.vcentry.classesperbasics02.Person;

public class Main {

	public static void main(String[] args) {
		
       Hall firstHall = new Hall();
		
       firstHall.setName ("Lake View");
       firstHall.setcapacity(50);
       
       
		System.out.printf("Name is %s \n" , firstHall.getname());
		System.out.printf(" Age is %d \n",  firstHall.getcapacity());
	}

}
