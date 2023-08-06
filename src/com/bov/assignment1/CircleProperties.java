package com.bov.assignment1;

/* Circle Properties: Design a program that calculates and displays various properties of a circle, 
such as its radius, diameter, circumference, and area. Prompt the user to enter the radius, 
and use variables to store the calculations. */
import java.util.Scanner;

class CircleProperties
{
	public static void main(String args[])
	{
	float radius;
	float diameter;
	double circumference;
	double area;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter radius of the circle : ");
	radius = sc.nextFloat();
	
	diameter = radius * 2;
	circumference = 2 * 3.14 * radius;
	area = 3.14 * radius * radius;
	
	System.out.println("Diameter of the circle is : "+diameter);
	System.out.println("Circumference of the circle is : "+circumference);
	System.out.println("Area of the circle is : "+area);
	}
}

