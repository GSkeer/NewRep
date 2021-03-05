package com.myclass.Composition;

public class MotherBoard {
	
	private String manufacturer;
	private String model;
	private int cardsSlots;
	private int ramSlots;
	private String biosVersion;
	
	
	public MotherBoard(String manufacturer, String model, int cardsSlots, int ramSlots, String biosVersion) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.cardsSlots = cardsSlots;
		this.ramSlots = ramSlots;
		this.biosVersion = biosVersion;
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public String getModel() {
		return model;
	}


	public int getCardsSlots() {
		return cardsSlots;
	}


	public int getRamSlots() {
		return ramSlots;
	}


	public String getBiosVersion() {
		return biosVersion;
	}
	
	

}
