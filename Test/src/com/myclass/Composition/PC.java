package com.myclass.Composition;

public class PC {
	
 private MotherBoard motherboard;
 private Monitor monitor;
 private Case  theCase;

 
 public PC(MotherBoard motherboard, Monitor monitor, Case theCase) {
	super();
	this.motherboard = motherboard;
	this.monitor = monitor;
	this.theCase = theCase;
}


public MotherBoard getMotherboard() {
	return motherboard;
}


public Monitor getMonitor() {
	return monitor;
}


public Case getTheCase() {
	return theCase;
}
 
 
	
	

}
