package com.bov.assignment1;

/* Time Conversion: Develop a program that converts time from seconds to hours, minutes, and seconds. 
Prompt the user to enter the time in seconds, and use variables to store 
the calculated values for hours, minutes, and remaining seconds. */

import java.util.Scanner;

class TimeConversion
{
	public static void main(String args[])
	{
		
	int seconds;
	int hours;
	int minutes;
	int remainingSeconds;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter time in seconds : ");
	seconds = sc.nextInt();
	remainingSeconds = seconds % 60;
	minutes = (seconds % 3600) / 60;
	hours = seconds / 3600;
	
	System.out.println("The time is "+hours+" hours "+minutes+" minutes and "+remainingSeconds+" seconds");
	
	}
}