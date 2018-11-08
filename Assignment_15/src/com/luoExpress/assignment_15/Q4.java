package com.luoExpress.assignment_15;

import java.util.Scanner;



public class Q4 {
	public static void main(String[] args) {
		System.out.println("please enter");
		
		while(true){
			Scanner s = new Scanner(System.in);
			String str =s.nextLine() ;
			if(str.equals("end")){
				System.out.println("Over");
				System.exit(0);
				
			}else{
				char[] arr1=change(str);
				String str1=new String(arr1);
				System.out.println(str1);
			}
			
		}
		
		
	}
	
public static char[] change(String str){
	char[] arr=str.toCharArray();
	int count=0;
	for(int i=0;i<arr.length;i++){
		if(arr[i]>='A'&&arr[i]<='Z'){
			arr[i]=(char)(arr[i]+32);
			count++;
			
		}
		else if(arr[i]>='a'&&arr[i]<='z'){
			arr[i]=(char)(arr[i]-32);
			count++;
		}
		else{
			arr[i]='*';
		}
		
	}System.out.println(count);
	
	
	return arr;

}
}

