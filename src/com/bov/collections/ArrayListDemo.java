package com.bov.collections;

import java.util.ArrayList;


public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(121);
		al.add(141.34);
		al.add('d');
		al.add(null);
		al.add("test");
		al.add(121);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(2));
		al.remove(4);
		System.out.println(al);
		System.out.println(al.toString());
		System.out.println(al.getClass());
		System.out.println(al.hashCode());
		System.out.println(al.isEmpty());
		al.clear();
		System.out.println(al.size());
		System.out.println(al);
		System.out.println(al.isEmpty());
	}
}
