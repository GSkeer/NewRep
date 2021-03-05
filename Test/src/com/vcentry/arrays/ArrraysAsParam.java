package com.vcentry.arrays;

import java.util.Arrays;

public class ArrraysAsParam {

	public static void main(String[] args) {
		
		int a=4;
		int b=a;
		String[]myStrArray = new String[3];
		printArray(myStrArray);
		for(int i=0; i<myStrArray.length; i++) {
			System.out.println(myStrArray[i]);
		}
     printMyNum(b);
     System.out.println("B after modification");
     System.out.println(b);

		
		
	}

	private static void printMyNum(int c) {
		System.out.println(c);
		c=6;
	}

	private static void printArray(String[] myArray) {
		myArray[0] ="This";
		myArray[1] ="Is";
		myArray[2]	="String Array"	;
		
		System.out.println(Arrays.toString(myArray));
		
	}

}
