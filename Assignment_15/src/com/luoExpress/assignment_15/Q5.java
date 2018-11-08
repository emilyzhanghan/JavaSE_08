package com.luoExpress.assignment_15;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		System.out.println("please enter");
		
		while(true){
			Scanner scanner = new Scanner(System.in);
			String str = scanner.nextLine();
			if(str.equals("end")){
				System.out.println("Over");
				break;
			}
	
		String str1="abcdeghabc";
		String str2="abc";
		System.out.println(deleteSubString(str1,str2));
		}
		
		
		
	}
	public static Object[] deleteSubString(String str1,String str2) {
	     int count=0;
		if(!str1.contains(str2)){
			Object[] arr={str1,"0"};
			return arr;
			
		}else{
			do{
			count++;
			StringBuffer sb = new StringBuffer(str1);
			
			
			str1=(sb.delete(sb.indexOf(str2),sb.indexOf(str2)+str2.length())).toString();
		}while(str1.contains(str2));
			Integer Count = new Integer(count) ;
			Object[] arr={str1,Count};
			return arr;
	}
	}


}
