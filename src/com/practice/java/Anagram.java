package com.practice.java;

public class Anagram {
	public static void main(String[] args) {

		String s1 = "LISSENT".toLowerCase();
		String s2 = "SILENTT".toLowerCase();
		int[] a = new int[26];
		if (s1.length() != s2.length()) {
			System.out.println("NO");
		}
		for (int i = 0; i < s1.length(); i++) {
			a[s1.charAt(i)-97]++;
		}
		for (int i = 0; i < s2.length(); i++) {
			if (a[s2.charAt(i)-97] == 0) {
				System.out.println("NO");
			}
		}

	}

}
