package com.practice.java;

public class PassbyValue {
	public static void swap(Integer i, Integer j) {
		Integer temp = new Integer(i);
		i = j;
		j = temp;
	}

	public static void main(String[] args) {
		Integer i = new Integer(10);
		Integer j = new Integer(20);
		swap(i, j);
		System.out.println("i = " + i + ", j = " + j);
		Object obj= new Object();
		new PassbyValue().clear(obj);
		System.out.println(obj.hashCode());
	}

	private Object clear(Object obj) {
		obj=null;
		return obj;
		
	}
	

}
