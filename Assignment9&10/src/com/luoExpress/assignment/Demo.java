package com.luoExpress.assignment;

public class Demo {
	
	public double add (double a, double b){
		return a + b;
		
	}
	
	public boolean compare (double a, double b){
		return a == b;
		
	}
	
	public void Table9x9 (){
		for (int i = 1; i < 10; i++){
			for (int j = 1; j< i+1; j++){
				System.out.print(i+"*"+j+"="+(i*j)+" ");
			}
			System.out.println();
		}
	}
}
