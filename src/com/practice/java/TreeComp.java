package com.practice.java;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeComp {
	public static void main(String[] args) {

		Map<String, String> m = new TreeMap<>();
		Comparator<String> com = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return m.get(o1).compareTo(m.get(o2));
			}

		};

		m.put("Devendar", "Reddy");
		m.put("Ashok", "Kumar");
		m.put("Vinay", "Kumar");
		for (Map.Entry<String, String> e : m.entrySet()) {
			System.out.println(e.getKey());
		}

	}

}
