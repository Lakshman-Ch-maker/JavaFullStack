package com.bov.runnable;

public class MyThread implements Runnable{
	public void run()
	{
		for(int i=0; i<50; i++)
		{
			System.out.println("child thread executing");
		}
		
	}
}
