package com.bov.interfaces;

public class IciciBank implements Bank
{

	
	public void deposit()
	{
		System.out.println("you can deposit upto 10 lakhs");
		
	}

	
	public void withdraw() 
	{
		
		System.out.println("you can withdraw upto 8 lakhs");
	}

	
	public void loan() 
	{
		
		System.out.println("you can take loan upto 5 lakhs");
	}

	
	public void interest() 
	{
	System.out.println("interest is 2% per annum");
		
	}
	
	
}
