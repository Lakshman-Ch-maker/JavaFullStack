package com.bov.controlstatements;

public class Assign1 { // print duplicate elements
	public static void main(String[] args) {
		int a[] = {12,14,15,24,3,12,18,2,24,28,30};
		
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] == a[j])
				{
					System.out.println(a[i]);
				}
			}
			
		}
	}
}
