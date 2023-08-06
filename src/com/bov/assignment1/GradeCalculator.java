package com.bov.assignment1;

/* Grade Calculator: Develop a program that calculates the average grade of a student based on individual test scores. 
Prompt the user to enter the number of tests and the corresponding scores. 
Use variables to store the input values and calculate the average. */

import java.util.Scanner;

class GradeCalculator
{
	public static void main(String args[])
	{
		int nt;
		int total = 0;
		float average;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of test scores : ");
		nt = sc.nextInt();
		int testScore[] = new int[nt];
		testScore = new int[nt];
		for(int i=0; i<nt; i++)
		{
			System.out.println("Enter test score "+(i+1));
			testScore[i] = sc.nextInt();
			total = total + testScore[i];
		}
		
		average = total/nt;
		
		System.out.println("The total score is : "+total+" and average score is : "+average);
		
		if(average >=80)
		{
			System.out.println("The grade is : Distinction");
			
		}
		
		else if(average <80 && average >=60)
		{
			System.out.println("The grade is : A-Grade");
		}
		
		else if(average <60 && average >=50)
		{
			System.out.println("The grade is : B-Grade");
		}
		
		else if(average <50 && average >= 40)
		{
			System.out.println("The Grade is : C-Grade");
			
		}
		
		else
		{
			System.out.println("You have not qualified the exam");
		}
		
	}
}