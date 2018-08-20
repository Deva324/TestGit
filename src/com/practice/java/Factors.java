package com.practice.java;

public class Factors {

	public static void main(String[] args) {
		int[] a = new int[] { 2,4};
		int[] b = new int[] { 16, 32, 96 };
		int max = b[0];
		int lc = lcm(a);
		int gc = gcd(b);
		int j = 1;
		int count = 0;
		solve(5, new int[] { 1, 2, 1, 3, 2 }, 3, 2);
		for (int i = lc; i <= max; i = lc * j) {
			if (gc % i == 0) {
				count++;
			}
			j++;
		}
		System.out.println(count);
System.out.println(1<<2);
	}

	static int solve(int n, int[] s, int d, int m) {
		// Complete this function
		int sum[] = new int[n + 1];
		int count = 0;
		sum[0] = 0;
		for (int i = 0; i < n; i++) {
			sum[i + 1] = sum[i] + s[i];
		}

		for (int i = 0; i <= n - m; i++) {
			if (sum[i + m] - sum[i] == d) {
				count++;
			}
		}
		return count;

	}

	private static int gcd(int[] input) {
		int result = input[0];
		for (int i = 1; i < input.length; i++)
			result = gcd(result, input[i]);
		return result;
	}

	private static int lcm(int a, int b) {
		return a * (b / gcd(a, b));
	}

	private static int gcd(int a, int b) {
		while (b > 0) {
			int temp = b;
			b = a % b; // % is remainder
			a = temp;
		}
		return a;
	}

	private static int lcm(int[] input) {
		int result = input[0];
		for (int i = 1; i < input.length; i++) {
			result = lcm(result, input[i]);
		}
		return result;
	}

}
