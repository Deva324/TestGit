package com.practice.java;

public class TestInner {
	public static void main(String[] args) {

	}

	private boolean test = true;

	class Inner {
		void tst() {
			if (TestInner.this.test) {
				System.out.println("Test");

			}
		}
	}
}
