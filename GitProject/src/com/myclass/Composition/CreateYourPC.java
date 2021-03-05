package com.myclass.Composition;

public class CreateYourPC {

	public static void main(String[] args) {
		
		Resolution resolution = new Resolution (1980, 1260);
		Monitor monitor = new Monitor ("Samsung", "SMG27InchCurved" ,27,resolution);
		Dimension d1 = new Dimension(20 ,25,30);
		Case theCase =new Case ("A12345","Dell","250v",d1);
		MotherBoard motherboard = new MotherBoard("Intel", "Intel12345" ,4,4,"2.2V");
		
		PC firstPC = new PC(motherboard , monitor, theCase);
	int width =	firstPC.getTheCase().getDimension().getWidth();
	System.out.println("width is" + width);
		
	
//	System.out.println(new PC());
//	System.out.println("width is" + width);

    
		
		
		
//monitor la draw image  method print out drawing image 
	//power on power off in case method syssout power on / power off print 
	// Pc use my pc method ---> power on / load pgm / Draw my image 
	
	//call the  value using use my PC in create PC 
		
		
	
	}

}


//System.out.println(resolution.getHeight());

		//Monitor monitor = new Monitor ("Samsung", "SMG27InchCurved" ,27,resolution);
		
		//System.out.println(monitor.getmanufacturer());
		//Resolution r2 = monitor.getResolution();
		//System.out.println(r2.getHeight());
		//System.out.println(monitor.getResolution().getHeight());
		
		
		//Dimension d1 = new Dimension(20 ,25,30);
		
		//Case C1 = new Case ("A12345","Dell","250v",d1);
		
		
		//Case theCase =new Case ("A12345","Dell","250v",d1);
		//int width =theCase.getDimension().getWidth();
		//System.out.println("width is" + width);