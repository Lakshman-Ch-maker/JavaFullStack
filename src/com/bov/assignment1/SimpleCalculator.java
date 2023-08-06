package com.bov.assignment1;

/* Simple Calculator: Create a program that prompts the user to enter two numbers and perform basic arithmetic 
operations such as addition, subtraction, multiplication, and division. Use variables to store the user 
inputs and the results of the calculations.*/
import java.util.Scanner;

class SimpleCalculator
{
	public static void main(String args[])
	{
	int a;
	int b;
	int add;
	int sub;
	int mul;
	float div;
	int choice;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a value : ");
	a = sc.nextInt();
	System.out.println("Enter b value : ");
	b = sc.nextInt();
	System.out.println("Enter choice of 1. Add \n 2. Subtract \n 3. Multuply \n 4. Division \n Enter choice : ");
	choice = sc.nextInt();
	
	switch(choice)
	{
		case 1:
		add = a+b;
		System.out.println("Addition of "+a+" and "+b+" is : " +add);
		break;
		
		case 2:
		sub = a-b;
		System.out.println("Subtraction of "+a+" and "+b+" is : "+sub);
		break;
		
		case 3:
		mul = a*b;
		System.out.println("Multiplication of "+a+" and "+b+" is : "+mul);
		break;
		
		case 4:
		div = a/b;
		System.out.println("Division of "+a+" and "+b+" is : "+div);
		break;
		
		default:
		System.out.println("You have entered incorrectly");
	}
	}
}