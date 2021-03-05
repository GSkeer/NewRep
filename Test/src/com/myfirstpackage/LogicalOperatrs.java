package com.myfirstpackage;

public class LogicalOperatrs {

	public static void main(String[] args) {
		int myMathsScore = 35;
		
		int mySciScore   =35;
		
	int total =myMathsScore + mySciScore ;
	if((myMathsScore >=80) && (mySciScore>=80)) {
			
			System.out.println("Distinction");
		}
		else if ((myMathsScore + mySciScore) > 160) {
			
			System.out.println("Distinction");
	}
		else if ((total < 120) || (myMathsScore == 35) || (mySciScore == 35)) {
			
			System.out.println("Not good");
		}
     else if ((myMathsScore + mySciScore) < 160 || (myMathsScore + mySciScore)>= 120 ) {
			
			System.out.println("First calss");
     }
			
			

}
}
