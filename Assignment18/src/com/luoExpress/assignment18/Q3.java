package com.luoExpress.assignment18;


public class Q3 {
	public static void main(String[] args) {
		
		String s= "fool";
		String t="toke";
		System.out.print(isomorphic(s, t));
		
	}

	

	public static boolean isomorphic(String s, String t){
		if(s.length()!= t.length()) return false;
		StringBuffer sb1 = new StringBuffer(s);
		StringBuffer sb2 = new StringBuffer(t);
		
			for (int i = 0; i < s.length(); i++) {
				for (int j = i+1; i < s.length(); i++){
					if(sb1.charAt(i)==sb1.charAt(j)&&sb2.charAt(i)==sb2.charAt(j));
					else if(sb1.charAt(i)==sb1.charAt(j)||sb2.charAt(i)==sb2.charAt(j)){
						return false;
					
					}
				}
			}
			return true;
	}
	
}
