package com.myclass.Composition;

public class Case {
	
	private String model;
	private String manufacturer;
	private String power;
	private Dimension dimension;
	
	public Case(String model, String manufacturer, String power,  Dimension dimension) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.power = power;
		this.dimension = dimension;
	}
	public String getModel() {
		return model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public String getPower() {
		return power;
	}
	public Dimension getDimension() {
		return dimension;
	}
	
public void powerOn () {
		
		System.out.println("PC is switched on" );
		
}

public void Poweroff () {
	
	System.out.println(" PC is switched off");
	
}
		
}


