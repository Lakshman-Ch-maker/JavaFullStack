package com.bov.controlstatements;

import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age ??");
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
}
