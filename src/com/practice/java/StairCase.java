package com.practice.java;

public class StairCase {

	public static void main(String[] args) {

		int n = 6;
		for (int i = 1; i <= 6; i++) {
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("#");
			}
			System.out.println();
		}

	}

	public void test() {
		String str = "#";
		for (int i = 1; i <= 6; i++) {
			System.out.printf("%" + i + "s", str + "\n");
			str += "#";
		}

	}

}
