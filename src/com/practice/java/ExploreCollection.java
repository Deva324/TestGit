package com.practice.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExploreCollection {
	public static void main(String[] args) {

		List<String> l = new ArrayList<>();
		Set<String> s = new HashSet<>();
		Map<String,String> m = new HashMap<>();
		Hashtable<Object, Object> ht= new Hashtable<>();
		Iterator<String> i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
