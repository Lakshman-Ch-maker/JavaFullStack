package com.bov.exceptionhandling;

import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a value : ");
			int a = sc.nextInt();
			System.out.println("Enter b value : ");
			int b = sc.nextInt();
			try
			{
				int  c = a/b;
				System.out.println("a/b value is : "+c);
			}
			catch(Exception e)
			{
//				System.out.println("you cannot divide by zero");
//				e.printStackTrace();
				
				
			//	System.out.println(e);
				
			System.out.println("The message is : "+e.getMessage());

			}
			finally
			{
				System.out.println("Exception is raised and handled");
			}
			
			int d = a+b;
			int e = a-b;
			int f = a*b;
			
			
			System.out.println("a+b value is : "+d);
			System.out.println("a-b value is : "+e);
			System.out.println("a*b value is : "+f);
	}
}
