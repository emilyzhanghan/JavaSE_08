package com.luoExpress._08;

public class Q1 {
	public static void main(String[] args) {

		int count = 0;

		for (int i = 9999; i >= 1000; i--) {
			int a = i % 10;
			int b = i % 100 / 10;
			int c = i / 100 % 10;
			int d = i / 1000;

			if (a + c == b + d) {
				System.out.print(i + "  ");
				count++;
				if (count % 5 == 0) {
					System.out.println();

				}
			}

		}
	}

}
