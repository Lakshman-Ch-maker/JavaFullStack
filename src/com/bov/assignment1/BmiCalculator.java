package com.bov.assignment1;

/* BMI Calculator: Create a program that calculates the Body Mass Index (BMI) based on user input for weight and height. 
Display the calculated BMI along with an appropriate message indicating the weight category. 
Utilize variables to store the weight, height, and BMI values. */

import java.util.Scanner;

class BmiCalculator
{
	public static void main(String args[])
	{
			float weight;
			float height;
			float bmi;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter height in centimeters: ");
			height = sc.nextFloat();
			height = height/100;
			System.out.println("Enter weight in KGs :");
			weight = sc.nextFloat();
			
			bmi = weight / (height*height);
			
			System.out.println("The body mass index is : "+bmi+" kg/m2");
			
			if(bmi < 18.5)
			{
				System.out.println("You are under-weight");
			}
			else if(bmi <= 24.9 && bmi >= 18.5)
			{
				System.out.println("You are in Healthy-weight");
			}
			else if(bmi <= 29.9 && bmi >= 25)
			{
				System.out.println("You are over-weight");
			}
			else if(bmi <= 34.9 && bmi >= 30)
			{
				System.out.println("You are obese");
			}
			else if(bmi <= 39.9 && bmi >= 35)
			{
				System.out.println("You are severely obese");
			}
			else if(bmi >= 40)
			{
				System.out.println("You are morbidity obese");
			}
	}
}