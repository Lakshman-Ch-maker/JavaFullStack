package com.bov.methodoverloading;

public class Sample {
	void add()
	{
		System.out.println("Here is an example of method overloading");
	}
	
	void add(int a, int b)
	{
		int c = a+b;
		System.out.println("a+b value is :"+c);
	}
	
	void add(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println("a+b+c value is : "+d);
	}
	
	void add(float a, float b)
	{
		float c = a+b;
		System.out.println("addition of decimal values : "+c);
	}
}
