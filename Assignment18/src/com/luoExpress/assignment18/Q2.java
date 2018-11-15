package com.luoExpress.assignment18;

import java.util.Arrays;


public class Q2 {
public static void main(String[] args) {
	char[] chars={'c','c','c','c','c','c','c','c','c','c','c'};
	System.out.print(compress(chars));
}

	
	

	public static int compress(char[] chars) {
		Arrays.sort(chars);
		StringBuffer sb = new StringBuffer(new String(chars));

		for (int i = 1; i < sb.length(); i++) {
			if (sb.charAt(i-1) != sb.charAt(i)) {

				int count = (i)
						- (sb.indexOf(Character.toString(sb.charAt(i-1))));
				
				if (count != 1) {
					sb.replace(
							sb.indexOf(Character.toString(sb.charAt(i-1))) + 1,
							sb.lastIndexOf(Character.toString(sb.charAt(i-1)))+1,
							Integer.toString(count));
				}

			} if(sb.charAt(i-1) == sb.charAt(i)&&i==sb.length()-1){
				int count = (i+1)
						- (sb.indexOf(Character.toString(sb.charAt(i))));
			
				if (count != 1) {
					sb.replace(
							sb.indexOf(Character.toString(sb.charAt(i))) + 1,
							i+1,
							Integer.toString(count));
				}
			}
		}
		
		return sb.length();

	}
}
