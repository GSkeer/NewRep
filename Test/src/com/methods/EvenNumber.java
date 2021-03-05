package com.methods;

public class EvenNumber {

	public static void main(String[] args) {
		//Allevennumbers(10);
		//NewMethods(10 , 40);
		Allevennumbers(10, 40, "evenodd");
		
		//All even numbers between 20 and 40

	}

	private static void NewMethods(int start, int end) {

		for (int i = start ; i <= end ; i++) {
			
			if(i %2 ==0)
			
			System.out.println("The even number is = " + i  );
		}
		// TODO Auto-generated method stub
		
	}

	private static void Allevennumbers(int end) {
		
		NewMethods(0 , end);
		
		
		
		//for (int i=0; i <= end ; i++) {
			
			//if(i %2 ==0)
			
			//System.out.println("The even number is = " + i  );
		}
	
	//private static void Allevennumbers(int start, int end , String data ,String data2 ) {
		
//for (int i = start ; i <= end ; i++) {
			
			//if(i %2 ==0) {
			
			//System.out.println("The even number is = " + i  );
		//}
			//else if  ((i % 3 ==0)){
			
			//System.out.println("The odd number is = " + i );
		//}
	//}

private static void Allevennumbers(int start, int end , String evenodd ) {
	
for (int i = start ; i <= end ; i++) {
	
	if (evenodd=="EVEN") {

			if(i %2 ==0) {
			
			System.out.println("The even number is = " + i  );
		}}
			else if  ((i % 2 != 0)){
			
			System.out.println("The odd number is = " + i );
		}
	}
		
	}
}


