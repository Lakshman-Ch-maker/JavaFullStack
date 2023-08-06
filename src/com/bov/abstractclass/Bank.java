package com.bov.abstractclass;

public abstract class Bank 
{
	
	void deposit()
	{
		System.out.println("you can deposit upto 10 lakhs");
	}
	
	void withdraw()
	{
		System.out.println("you can withdraw upto 8 lakhs");
	}
	
	abstract void loan();
	abstract void interest();
}
