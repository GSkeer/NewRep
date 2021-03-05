package com.myclass.Compositionroom;

import java.io.ObjectInputStream.GetField;

public class CreateRoom {

	public static void main(String[] args) {
		
		
	
		Electronics TV = new Electronics("televison","LG" ,"LCD");
        Wall wall1  = new Wall("Pink","East");
        Wall wall2  = new Wall("Pink","West");
        Wall wall3  = new Wall("Pink","North");
        Wall wall4  = new Wall("Pink","South");
        Furniture sofa = new Furniture("sofa","newfur","sea blue");
        
        
        Room Hall = new Room(TV,wall1,sofa);
        
        
        System.out.println(Hall.getElectronics().getProduct());
        System.out.println(Hall.getElectronics().getManufatures());
        System.out.println(Hall.getWall().getDirection()); 
        System.out.println(Hall.getWall().getColour()); 
        
       
        
      
        
        
	}

}
