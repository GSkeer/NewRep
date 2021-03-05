package Collections.arraylist;

import java.util.ArrayList;

public class ArrayListchall {

public static void main(String[] args) {

	ArrayList<String> myList = new ArrayList<String>();
	
	myList.add("one");
	myList.add("Two");
	myList.add("Four");

}

public static void set(String oldvalue,String newValue,ArrayList<String>myList){
	int indexOfOldValue = myList.indexOf(oldvalue);
	
	if(indexOfOldValue!=-1) {
		myList.set(indexOfOldValue, newValue);
		System.out.printf("%s replaced by %s\n",oldvalue,newValue);
	}else {

		System.out.printf(oldvalue + "Not Found");
}

	System.out.println(myList);
}

public static ArrayList<String> setAndReturn(String oldvalue,String newValue,ArrayList<String>myList){
	int indexOfOldValue = myList.indexOf(oldvalue);
	
	if(indexOfOldValue!=-1) {
		myList.set(indexOfOldValue, newValue);
		System.out.printf("%s replaced by %s\n",oldvalue,newValue);
	}else {

		System.out.printf(oldvalue + "Not Found");
}

	System.out.println(myList);
}

return myList;
