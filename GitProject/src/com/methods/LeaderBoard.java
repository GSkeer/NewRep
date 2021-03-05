package com.methods;

public class LeaderBoard {

	public static void main(String[] args) {
		LeaderBoard("keerthana" , 2000);
		LeaderBoard("ABC" , 2000);
		LeaderBoard(1000 , "abc");
	 
	 
	 
	}

	private static void LeaderBoard(String name , int score) {
		if(score >= 1000) {
			 System.out.println(name + "s" +"1st position");
		 }else if (score < 1000 ) {
			 System.out.println(name + "s" +"2nd position");

		}else {
			System.out.println("no position");
		}
		
		private static void LeaderBoard(int score , String name) {
			if(score >= 1000) {
				 System.out.println(name + "s" +"1st position");
			 }else if (score < 1000 ) {
				 System.out.println(name + "s" +"2nd position");

			}else {
				System.out.println("no position");
			}
			
			private static void LeaderBoard(String name , int score) {
				LeaderBoard(score ,name);
				}
		
	}

}}
