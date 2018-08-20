package com.soap;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {

		String[] arr = new String[] { "Gulab-Jamun", "Gajar-Halwa", "Gulab-Jamun", "Laddu", "Laddu", "Gulab-Jamun" };
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder("");
		sb.reverse();
		int max_count = 1;
		String res = arr[0];
		int curr_count = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1])
				curr_count++;
			else {
				if (curr_count >= max_count) {
					max_count = curr_count;
					res = arr[i - 1];
				}
				curr_count = 1;
			}
		}

		// If last element is most frequent
		if (curr_count >= max_count) {
			max_count = curr_count;
			res = arr[arr.length - 1];

		}
		System.out.println(max_count);
		System.out.println(res);
		test2();
	}

	public static void test2() {
		try {
			test1();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Inside" + e.getMessage());
		}
	}

	public static void test1() throws ArithmeticException,NullPointerException {
		
	}
}
