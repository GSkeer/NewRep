package edu.vcentry.classespersuperbasics06;

public class NorthIndian {
	
	private String name;
	private String aadhaar;
	private String pan; 
	private int age;
	
	
	
	
	public NorthIndian(String name, String aadhaar, String pan, int age) {
		super();
		this.name = name;
		this.aadhaar = aadhaar;
		this.pan = pan;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadhaar() {
		return aadhaar;
	}
	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}


