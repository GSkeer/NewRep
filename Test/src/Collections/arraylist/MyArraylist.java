package Collections.arraylist;

import java.util.ArrayList;

public class MyArraylist {

	public static void main(String[] args) {

		ArrayList<String> myList = new ArrayList<String>();
		myList.add("one");
		myList.add("Two");
		myList.add("Four");

		System.out.println(myList);

		System.out.println("***********************");

		myList.add(2, "Three");

		System.out.println(myList);

		String replacedIteam = myList.set(1, ":2:");
		System.out.printf("Item replaced is %s\n", replacedIteam);

		System.out.println(myList);

		String removedIteam = myList.remove(3);
		System.out.printf("Item removed is %s\n", removedIteam);
		System.out.println(myList);

		myList.remove("Three");
		System.out.printf("****** removed Three******");
		System.out.println(myList);

	}

}
