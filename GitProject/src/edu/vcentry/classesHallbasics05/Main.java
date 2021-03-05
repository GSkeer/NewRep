package edu.vcentry.classesHallbasics05;

import edu.vcentry.classesperbasics02.Person;

public class Main {

	public static void main(String[] args) {
		
       //Hall firstHall = new Hall("Lake view" , 50);
		
       //firstHall.setName ("Lake View");
       //firstHall.setcapacity(50);
       
       
		System.out.println(new Hall().getname());
		System.out.println(new Hall().getcapacity());
		System.out.println(new Hall("Lake view" , 1500).getname());
		System.out.println(new Hall("New Hall", 2500).getcapacity());

	}

}
