package edu.vcentry.classesHallthisbasics07;

public class Hall {
	
	public String name;
	public int capacity;
	
	public Hall( ) {
		this("Hall Name" , 1000);
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
	public void setcapacity(int age) {
		this.capacity = capacity;
	}

}



