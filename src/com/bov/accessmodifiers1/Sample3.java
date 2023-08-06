package com.bov.accessmodifiers1;

import com.bov.accessmodifiers.*;

public class Sample3 extends Sample1{
	
	public static void main(String[] args) {
		
		Sample1 sample1 = new Sample1();
		System.out.println("b value is : "+sample1.b);
		Sample3 sample3 = new Sample3();
		System.out.println("c value is : "+sample3.c);
	}
	

}
