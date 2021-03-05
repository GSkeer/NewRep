package edu.vcentry.classesHallinheritancebasics06;

public class Hall {
	
	public String name;
	public int capacity;
	
	public Hall( ) {
		this.name = "New Hall";
		this.capacity =1000;
		}
		
		public Hall ( String name , int capacity) {
			this.name = name;
			this.capacity = capacity;
			}
	
	
	
	
	public String getname() {
		return name;
		}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getcapacity() {
		return capacity;
	}
	public void setcapacity(int capacity) {
		this.capacity = capacity;
	}
  public void purpose () {
	  
	  System.out.printf("%s is used for special occasion \n" ,getname());
  }
}



