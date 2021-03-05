package com.myclass.Compositionroom;

public class Room {
	private Electronics electronics;
	private Wall wall;
	private Furniture furniture;
	
	public Room(Electronics electronics, Wall wall, Furniture furniture) {
		super();
		this.electronics = electronics;
		this.wall = wall;
		this.furniture = furniture;
	}

	public Electronics getElectronics() {
		return electronics;
	}

	public Wall getWall() {
		return wall;
	}

	public Furniture getFurniture() {
		return furniture;
	}
	
	

}
