package com.bov.collections;
import java.util.HashSet;


public class HashSetDemo {
	public static void main(String[] args) {
		HashSet h = new HashSet<>();
		h.add(121);
		h.add("qreqf");
		h.add('d');
		h.add(45.454);
		h.add(null);
		h.add(121);
		System.out.println(h);
		System.out.println(h.toString());
		System.out.println(h.size());
		System.out.println(h.getClass());
		System.out.println(h.hashCode());	
		System.out.println(h.contains(454));
		System.out.println(h.isEmpty());
		h.clear();
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		System.out.println(h);
	}

}
