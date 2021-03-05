package com.methods;

public class IsPrime {

	public static void main(String[] args) {
		int myNumb = 25;
		
	boolean isprime = isprime(myNumb);
				System.out.println(String.format("%s is prime -%s", myNumb, isprime));

	}

	private static boolean isprime (int myNumb) {
		boolean isprime = true;
		
		if (myNumb <= 1) {
			
			isprime = false;
		}
		
		for (int i =2 ; i < myNumb/2 ; i++) {
			//Math.sqrt(myNumb)can be used for n/2
			
			if (myNumb % i==0) {
		       isprime =false;
		break;
		
	}
		}
		
		return isprime;
	
		
		
	}

}
