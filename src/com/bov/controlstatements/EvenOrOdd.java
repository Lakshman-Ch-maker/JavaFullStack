package com.bov.controlstatements;

import java.util.Scanner;

public class EvenOrOdd
{
	void say()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num = sc.nextInt();
	
	if(num >= 0)
	{
		System.out.println("The number is positive");
	}
	else
	{
		System.out.println("The number is negative");
	}
	
	}
	
	public static void main(String args[])
	{
		EvenOrOdd e = new EvenOrOdd();
		e.say();
	}
}
