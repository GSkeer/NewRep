package com.newpackage;

public class Findvalue {

	public static void main(String[] args) {
		
		FindQAndR( 5,2);
		

	}
// use while and - insted of % and /
	private static void FindQAndR( int dividend , int divisor) {  
		
       int Q = 0;
       int r =0;
       while (dividend >= divisor) {
    	   dividend = dividend - divisor;
    	   Q = Q + 1;
    	   
    	   System.out.println("Quotient is "+ Q);
    	   
    	   System.out.println("Remainder is "+  dividend);
    	}
    	   
       
   r = dividend;
	}

}
//1 = 6-2 =4(4 divident ,divisor 2 , Q=1)
//2 = 4-2 =4(2 divident ,divisor 2 , Q=2)
//3 = 2-2 =4(0 divident ,divisor 2 , Q=2)
//math.abs (use this with negative values)

//output should work for -5, -2 , 5,2 , -5 ,2 , 5 , -2