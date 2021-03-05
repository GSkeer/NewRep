package edu.vcentry.classesperbasics01;

public class Person {
	public String name;
	public int age;
	
	
	//creating a constructor 
	
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
