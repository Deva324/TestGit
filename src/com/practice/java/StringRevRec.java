package com.practice.java;

public class StringRevRec {
	
	public static void main(String[] args) {
		
		System.out.println(byrec("Krishnas"));
	
		for(int i=0;i<6;i=i+1) {
			System.out.print(i+" ");
		}
	}
	
	static String byrec(String s){
		if(s==null||s.length()==1)
			return s;
		return s.charAt(s.length()-1)+byrec(s.substring(0, s.length()-1));
		
	}

}
