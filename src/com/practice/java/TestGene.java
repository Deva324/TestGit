package com.practice.java;

public class TestGene {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {

		testType(GregString.class);
		testType(StairCase.class);
		returnt(new StairCase()).test();
		String t3 = "8";
		String t4 = "567";
		String cc = "TX1";
		if (t4.indexOf(t3) != -1 && cc == "TX1") {
			System.out.println("Tsest");
		}
	}

	public static void testType(Class<?> t)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {

	}

	public static <T> T returnt(T t) {
		return t;
	}

}
