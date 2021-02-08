package com.myfirstpackage;

public class Operators {

	public static void main(String[] args) {
		int myoperations = 1;
	    int mysecondOper = 4;
	    int result = 1+4;
	    double  myoperationsnew = 1d;
	    double  mysecondOpernew = 4d;
	    
	    
	    System.out.println( "1 + 4  ="  + result);
	    System.out.println( "1 + 4  = 5 "  + (result+0.25));
	    System.out.println( "1 / 4d  = 0.25 "  + (1/4d));
	    
	    myoperations +=4;
	    System.out.println( "myoperations  += 4 ->"  + myoperations );
	    myoperations *=4;
	    System.out.println( "myoperations  *= 4 -> " + myoperations );
	    
	    


	}

}
