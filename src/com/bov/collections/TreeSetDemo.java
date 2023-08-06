package com.bov.collections;
import java.util.TreeSet;

public class TreeSetDemo 
{
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>();
		t.add(454);
		t.add(143);
		t.add(232);
		t.add(132);
		t.add(566);
		t.add(566);
		System.out.println(t);
		System.out.println(t.toString());
		System.out.println(t.isEmpty());
		System.out.println(t.getClass());
		System.out.println(t.descendingSet());
		System.out.println(t.hashCode());
		System.out.println(t.hashCode());
		System.out.println(t.clone());
		t.clear();
		System.out.println(t);
		System.out.println(t.toString());
		System.out.println(t.isEmpty());
		System.out.println(t.size());
		
	}
}
