package com.luoExpress.assignment_15;

public class Q2 {
	public static void main(String[] args) {
		System.out.println(getPropertyGetMethodName("name"));
		
	}
	
	
	
	public static String getPropertyGetMethodName(String property){
		 return  "get"+property.substring(0, 1).toUpperCase().concat(property.substring(1).toLowerCase());
		
	}

}
