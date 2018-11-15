package com.luoExpress._18;

public class NumReverse {
	public static void main(String[] args) {
		reverse(-789);
		
	}
	public static int reverse(int num){
		Integer Num=new Integer(num);
		char[] numarr=Num.toString().toCharArray();
		for (int i = 0; i < numarr.length/2; i++) {
		if(numarr[0]>0&&numarr[0]<=9){
			numarr[i]=numarr[numarr.length-i-1];
			
			
		}
		if(numarr[0]=='-'){
			numarr[i+1]=numarr[numarr.length-i-1];
		}
		
		
		
		
	}
		return Integer.parseInt(numarr.toString());
	}
}

