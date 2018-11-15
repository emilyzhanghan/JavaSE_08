package com.luoExpress._18;


import java.util.Arrays;

public class FindArray {
	public static void main(String[] args) {
		int[] arr={0,1,7,8,4,6,5,2};
		System.out.print(find(arr));
	
		
		
	}

public static int find(int[] arr){
	
	int targetnum=-1;
	Arrays.sort(arr);
	for (int i = 0; i < arr.length-1; i++) {
		if(arr[i+1]==arr[i]+1){
			continue;
		
	}else{
		targetnum=arr[i]+1;
		
	}
}
	return targetnum;
}
}
