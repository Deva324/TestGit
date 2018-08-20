package com.practice.java;

public class RemoveDe {

	public static void main(String[] args) {
		String s="baab";
		StringBuilder s1 = new StringBuilder(s);

		for (int i = 1; i < s1.length(); i++) {
			if (s1.charAt(i) == s1.charAt(i - 1)) {
				s1 = s1.delete(i - 1, i + 1);
				i = 0;
			}
		}
		if (s1.length() == 0) {
			System.out.println("Empty String");
		} else {
			System.out.println(s1);
		}
	}

}
