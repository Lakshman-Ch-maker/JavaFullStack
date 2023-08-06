package com.bov.collections;

import java.util.LinkedList;

public class LinkedListDemo 
{
	public static void main(String[] args) {
		LinkedList al = new LinkedList<>();
		al.add(121);
		al.add(141.34);
		al.add('d');
		al.add(null);
		al.add("test");
		al.add(121);
		System.out.println(al);
		System.out.println(al.size());
		al.addFirst(343);
		al.addLast(656);
		System.out.println(al);
		System.out.println(al.getFirst());
		System.out.println(al.getLast());
		al.removeFirst();
		al.removeLast();
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
