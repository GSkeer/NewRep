package com.myclass.Compositionroom;

public class Furniture {
	
	private String product;
	private String manufatures;
	private String  Colour;
	
	public Furniture(String product, String manufatures, String colour) {
		
		this.product = product;
		this.manufatures = manufatures;
		Colour = colour;
	}

	public String getProduct() {
		return product;
	}

	public String getManufatures() {
		return manufatures;
	}

	public String getColour() {
		return Colour;
	}
	
	

}
