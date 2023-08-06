package com.bov.assignment1;

/*Temperature Conversion: Build a program that converts temperature values between Celsius and Fahrenheit. 
Prompt the user to enter a temperature in one unit and display the converted value in the other unit. 
Utilize variables to store the input and output values. */
import java.util.Scanner;

class TemperatureConversion
{
	public static void main(String []args)
	{
	float celsius;
	float fahrenheit;
	double result;
	int choice;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter from below - \n 1. Celsius to fahrenheit \n 2. Fahrenheit to Celsius \n Enter choice : ");
	choice = sc.nextInt();
	switch(choice)
	{
		case 1:
		System.out.println("Enter temperature in celsius : ");
		celsius = sc.nextFloat();
		result = 1.8 * celsius + 32;
		System.out.println("The temperature "+celsius+" C in fahrenheit is : "+result);
		break;
		
		case 2:
		System.out.println("Enter temperature in fahrenheit : ");
		fahrenheit = sc.nextFloat();
		result = (fahrenheit-32)/1.8;
		System.out.println("Temperature "+fahrenheit+" F in celsius is : "+result);
		break;
		
		default:
		System.out.println("You have entered incorrectly");
	}
	}
	
}
