package com.bov.controlstatements;

import java.util.Scanner;

public class CheckAge {
	void calculate()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		if(age >= 18)
		{
			System.out.println("Given person is eligible to vote");
			
		}
		
		else
		{
			System.out.println("Given person is not eligible to vote");
		}
		
	}
	
	public static void main(String args[])
	{
		CheckAge age = new CheckAge();
		age.calculate();
	}
}

