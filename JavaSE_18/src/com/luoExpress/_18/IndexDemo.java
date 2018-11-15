package com.luoExpress._18;

public class IndexDemo {
public static void main(String[] args) {
	int num[]={2,3,6,4};
	//System.out.println(function(num, 5));
	function(num, 9);
}

	public static int[] function(int[] num, int target) {
		int[] index = new int[2];
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[i] + num[j] == target) {
					index[0] = i;
					index[1] = j;
				}

			}
		}

		for (int i = 0; i < index.length; i++) {
			System.out.println(index[i]);
		}
		return index;
	}
}

