package com.myclass.Composition;

public class A {
	int a;
	int b;
	
	B bobj;  // using our own class
	
	public A(int a, int b,B bobj) {
		super();
		this.a = a;
		this.b = b;
		this.bobj = bobj;
	}

	public int getA() {
		return a;
	}

	

	public int getB() {
		return b;
	}

	public B getbobj() {
		return bobj;
	}
	
	}
