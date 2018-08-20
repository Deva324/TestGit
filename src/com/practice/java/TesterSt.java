package com.practice.java;

public class TesterSt {

	static int minimumNumber(int n, String password) {
		boolean hasUpperCase = false;
		boolean hasLowerCase = false;
		boolean hasDigit = false;
		String s1 = "!@#$%^&*()-+";
		boolean hasSp = false;
		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i))) {
				hasDigit = true;
			} else if (Character.isLowerCase(password.charAt(i))) {
				hasLowerCase = true;
			} else if (Character.isUpperCase(password.charAt(i))) {
				hasUpperCase = true;
			} else if (s1.indexOf(password.charAt(i)) != -1) {
				hasSp = true;
			}
		}
		int min = 0;
		if (!hasDigit) {
			min++;
		}
		if (!hasUpperCase) {
			min++;
		}
		if (!hasLowerCase) {
			min++;
		}
		if (!hasSp) {
			min++;
		}
		if ((6 - n) > min) {
			min = 6 - n;
		}

		return min;
	}

	public static void main(String[] args) {
		String password = "hackerrank1";
		int n = password.length();
		int answer = minimumNumber(n, password);
		System.out.println(answer);
	}
}
