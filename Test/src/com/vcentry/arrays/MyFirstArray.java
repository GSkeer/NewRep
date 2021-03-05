package com.vcentry.arrays;

import java.util.Arrays;

public class MyFirstArray {

	public static void main(String[] args) {
		int myArray[] = new int[3];
		//myArray = {1,2,3]---> CANNOT BE DONE for above method
		
		//double[]d = new double[2];
		
		//System.out.println(d[0]);---->0.0 will be printed
		
	 //double[]d = {1.0,2.0};
	 //System.out.println(d[0]);

	for(int i=0; i<3; i++) {
	
		myArray[i]=i*3;
		
		//System.out.println(myArray);----> address will be printed
	
	}
	
	
	for(int i=0; i<3; i++) {
		
		myArray[i]=i*3;
		
	System.out.println(myArray[i]);
	
	System.out.println("Lenth of the Array" + myArray.length);
	System.out.println(Arrays.toString(myArray));
	
	}
	
}

	
	
	
	
	
	
	
	
}



