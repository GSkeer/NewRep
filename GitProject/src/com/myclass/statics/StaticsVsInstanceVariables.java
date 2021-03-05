package com.myclass.statics;

public class StaticsVsInstanceVariables {
	private int instanceVar;   //fields or member var each obj will have a own variable
	public static int staticVariable; // each obl will not have a own variable
	//should be private
	public StaticsVsInstanceVariables() {
		instanceVar += 1;
		staticVariable += 1;
		
	}

	public int getIntanceVar() {
		return instanceVar;
	}

	

	public static int getStaticVariable() {
		return staticVariable;
	}

	
	
	

}
