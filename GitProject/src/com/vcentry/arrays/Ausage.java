package com.vcentry.arrays;

public class Ausage {

	public static void main(String[] args) {
		A aobj = new A(2,3);
		A bobj =aobj;
		bobj.a =23;
		 System.out.println(bobj.a);
	}

}
