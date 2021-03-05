package com.newpackage.b01;

public class Findvalue {

	
	public static void main(String[] args) {
		
		FindQAndR( 5 , -2 );	
		

	}
// use while and - insted of % and /
	private static void FindQAndR( int dividend , int divisor) { 
		 
		
       
     if(dividend < 0) {
    	     
    	      dividend = Math.abs(dividend);
    	   }
    	   
    	   if(divisor < 0) {
    	      
    	      divisor = Math.abs(divisor);
       
    	      int Quotient =0;
    	      int Remainder =0;
       while (dividend >= divisor) {
    	   dividend =  dividend - divisor;
    	   
           System.out.println("Quotient is "+ Quotient);
    	   
    	   System.out.println("Remainder is "+  Remainder);
    	   
    	   
    	   Quotient = Quotient+1;
    	   
    	   
    	}
    	   
       
       Remainder = dividend;
	}

}}
//1 = 6-2 =4(4 divident ,divisor 2 , Q=1)
//2 = 4-2 =4(2 divident ,divisor 2 , Q=2)
//3 = 2-2 =4(0 divident ,divisor 2 , Q=2)
//math.abs (use this with negative values)

//output should work for -5, -2 , 5,2 , -5 ,2 , 5 , -2