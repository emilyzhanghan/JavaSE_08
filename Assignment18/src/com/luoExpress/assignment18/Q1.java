package com.luoExpress.assignment18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1 {
	public static void main(String[] args) {
		String string = "cbaebabacd";
		String pString = "abc";
		System.out.print(Anagrams(string, pString));
	}

	public static List<Integer> Anagrams(String s, String p) {
		List<Integer> ls = new ArrayList<Integer>();

		char[] parr = p.toCharArray();
		Arrays.sort(parr);
		System.out.println(parr);
		for (int i = 0; i < s.length() - p.length(); i++) {
			char[] substring = (s.substring(i, i + p.length())).toCharArray();
			Arrays.sort(substring);

			if (Arrays.equals(parr, substring)) {

				ls.add(i);
			}

		}
		return ls;

	}
}
