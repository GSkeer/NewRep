package Collections.arraylist;

import java.util.ArrayList;

public class MyArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();

		myList.add("one");
		myList.add("Two");
		myList.add("Four");

		System.out.println("My Array list contains One(True or False) -" + myList.contains("one"));
		
		System.out.println("Index of mylist");
		
		if(myList.indexOf("Two")>=0) {
			
		System.out.println("My Array list contains Two");
} else {
	System.out.println("My Array list do not contain Two");
}
		ArrayList<String> mynewList = new ArrayList<String>();
		mynewList.addAll(myList);
		mynewList.add(2,"Three");
		System.err.println("My New List is" +mynewList);
		
		
		
} 
}
