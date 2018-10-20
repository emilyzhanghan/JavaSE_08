package com.luoExpress.assignment;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Demo demo = new Demo();
		System.out.println(demo.add(a,b));
		System.out.println(demo.compare(a, b));
		demo.Table9x9();
	

	}


}
