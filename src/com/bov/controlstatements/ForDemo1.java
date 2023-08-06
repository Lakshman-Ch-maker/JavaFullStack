package com.bov.controlstatements;

public class ForDemo1 {
	public static void main(String[] args) {
		int a[] = {12, 14, 15, 18, 20, 22, 26, 30, 32};
		
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
		
		
//		for(int i =0; i<a.length; i++)
//		{
//			System.out.println(a[i]);
//		}
		
		for(int a1 : a)
		{
			System.out.println(a1);
		}
	}
}




