package com.bov.wrapperclasses;

public class WrapperDemo {

	public static void main(String[] args) {
		int a = 45;
		//Integer x = Integer.valueOf(a);
		Integer x = a; // boxing
		System.out.println("After converting primitive to object: "+x);
		
		Integer m = new Integer(40);
		// int n = m.intValue();
		int n = m; // unboxing
		System.out.println("After converting wrapper class to primitive : "+n);
	}
}
