package com.bov.constructors;

public class Sample {
		Sample()
		{
			System.out.println("Default constructor.");
			
		}
		
		Sample(int a, int b)
		{
			this();
			int c = a+b;
			System.out.println("a+b value is   :       "+c);
		}
		
		Sample(int a, int b, int c)
		{
			
			this(a,b);
			int d = a+b+c;
			System.out.println("a+b+c value is   :  "+d);
		}
		
		
		
		
		
		
		
}
