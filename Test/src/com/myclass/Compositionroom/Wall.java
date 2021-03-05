package com.myclass.Compositionroom;

public class Wall {
	
	private String Colour;
	private String direction;
	
	public Wall(String colour, String direction) {
		
		Colour = colour;
		this.direction = direction;
	}

	public String getColour() {
		return Colour;
	}

	public String getDirection() {
		return direction;
	}
	
	

}
