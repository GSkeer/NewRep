package com.methods;

public class LearnLoop {

	public static void main(String[] args) {
    int i = 1;
    while (i <5 ) {
    	if (i < 3) {
    		i++;
    	continue;
    	}
    
    System.out.println(i + ",");
    
    i++;
    
    if(i > 4) {
    break ;
    	
    }

	}

}}
