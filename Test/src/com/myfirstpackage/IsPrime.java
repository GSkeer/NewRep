package com.myfirstpackage;

public class IsPrime {

	public static void main(String[] args) {
//		int myNumb = 25;
//		
//		boolean isprime = isprime(myNumb);
//				System.out.println(String.format("%s is prime -%s", myNumb, isprime));
		
		// to print 1st 5 prime numb
		
		int count = 0;
		int i;
		for (i = 10; i < 100; i++) {
		boolean isprime = isprime(i);
		if (isprime) {
			if(count >=5) {
				break;
			}
			System.out.println(String.format("%s is prime -%s", i, isprime));
			count +=1;
		}
			
		}

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
