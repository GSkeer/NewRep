package edu.vcentry.classespersuperbasics06;

public class Person  {
	public String name;
	public int age;
	
	
	//this keyword is used to call one constructor from other.
	
	public Person( ) {
	this("New Born" , 0);
	
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
public void eats () {
		
		System.out.printf("%s eats anything edible \n" , getname() );
}
}
