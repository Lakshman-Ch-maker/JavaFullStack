package com.bov.methodoverloading;

public class Test {
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.add();
		sample.add(14,13);
		sample.add(12,13,14);
		sample.add(45.56f, 34.56f);
	}
}



