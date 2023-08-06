package com.bov.synchronization;

public class Test1 
{
	public synchronized static void main(String[] args) 
	{
		MyThread t = new MyThread();
		Thread t1 = new Thread(t);
		t1.start();
		
		for(int i=0; i<50; i++)
		{
			System.out.println("main thread is executing");
		}
	}
}
