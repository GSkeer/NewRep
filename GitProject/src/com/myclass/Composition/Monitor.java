package com.myclass.Composition;

public class Monitor {
	
	private String manufacturer;
	private String model;
	private int size;
	
	
	private Resolution resolution;
	
	public Monitor (String manufacturer, String model ,int size, Resolution resolution) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.size =size;
		this.resolution = resolution;
	}

	
	public  Resolution getResolution() {
		return this.resolution;
	}
	
	public String  getmanufacturer() {
		return this.manufacturer;
	}


	public int getSize() {
		return size;
	}


	
	public String getManufacturer() {
		return manufacturer;
	}


	public String getModel() {
		return model;
	}

	public void DrawImage () {
		
		System.out.println(" Draw a new image in PC");
		
	}
}
