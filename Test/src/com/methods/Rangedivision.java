package com.methods;

public class Rangedivision {

	public static void main(String[] args) {
		
		
	Range(0 ,25);
	
	
		

	}

	private static void  Range( int Start , int end ) {
	    
		
		for (int i = Start ; i <= end ; i++) {
		
		if ((i % 2==0) && (i % 5==0) ) {
			
			System.out.println("Number divisable by both 2 and 5  " + i);
			
			
		}
		else  if ((i % 2==0) && (!(i % 5==0) )) {
			
			System.out.println("Number divisable by  2 and not by 5  " + i);
			
			
		}else {
			
			System.out.println("condition fails " + i);}
		
		
			
			
				
				
				
				
			}
			
				
				
		
	}
		

}
