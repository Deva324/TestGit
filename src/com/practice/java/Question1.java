package com.practice.java;

public class Question1 {

	public static void main(String[] args) {
		int n = 5;
		int j = 0;
		while (j < n) {
			printRow(n, j);
			j = j + 2;
		}
		j = checkEven(n, j);
		while (j >= 1) {
			printRow(n, j);
			j = j - 2;
		}

	}

	private static int checkEven(int n, int j) {
		if (n % 2 == 0) {
			--j;
		} else {
			j = j - 3;
		}
		return j;
	}

	private static void printRow(int n, int j) {
		for (int i = 1; i <= n; i++) {
			if (i % n != 0) {
				System.out.print((n * j) + i + "*");
			} else {
				System.out.println((n * j) + i);
			}

		}

	}

}
