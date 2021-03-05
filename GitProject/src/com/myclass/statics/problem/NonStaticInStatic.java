package com.myclass.statics.problem;

public class NonStaticInStatic {

	public static void main(String[] args) {
		
		NonStaticInStatic ns = new NonStaticInStatic();
		ns.accessMe();
		staticaccessMe();
	}

	private static void staticaccessMe() {
		
		System.out.println("Access static  without  the object");	
	}

	private  void accessMe() {
		System.out.println("Access only with the object");
		
	}

}
