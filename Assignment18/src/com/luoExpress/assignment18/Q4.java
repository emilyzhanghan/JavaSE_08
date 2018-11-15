package com.luoExpress.assignment18;

public class Q4 {
	public static void main(String[] args) {
		String s="Hello,my name is John,I'm 6 years old";
		System.out.print(segments(s));
		

	}
	
	public static int segments(String s){
		String regex="\\s|,";
		String[] result=s.split(regex);
		return result.length;
		
		
	}
	

}

