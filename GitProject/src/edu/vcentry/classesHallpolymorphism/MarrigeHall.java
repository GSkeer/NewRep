package edu.vcentry.classesHallpolymorphism;

public class MarrigeHall extends Hall  {
	
	private int diningroom;
	private int guestroom;
	
	
	
	public MarrigeHall() {
		super("secondhall" ,50);
	}


public MarrigeHall(int diningroom, int guestroom) {
		super ("thirdhall" , 100);
		this.diningroom = diningroom;
		this.guestroom = guestroom;
	}
	

public MarrigeHall(String name ,int capacity , int diningroom, int guestroom) {
	super ("name" , capacity);
	this.diningroom = diningroom;
	this.guestroom = guestroom;
}
	
	
public void purpose () {
	  
	  System.out.printf("%s is used for every new celebrations \n" ,getname());
}
	
	
	
	
	

}
