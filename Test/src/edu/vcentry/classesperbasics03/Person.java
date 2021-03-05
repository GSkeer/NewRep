package edu.vcentry.classesperbasics03;

public class Person {
	public String name;
	public int age;
	
	
	//creating a constructor  overloading
	
	public Person( ) {
	this.name = "New Born";
	this.age =0;
	}
	
	public Person( String name , int age) {
		this.name = name;
		this.age = age;
		}
	
	public String getname() {
		return name;
		}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getage() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
