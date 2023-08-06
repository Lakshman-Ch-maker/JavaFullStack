package com.bov.multithreading;

public class MyThread  extends Thread{
	public void run()
	{
		for(int i=0; i<50; i++)
		{
			System.out.println("child thread is executing");
		}
		
//		public start()
//		{
//			System.out.println("start() is executing");
//		}
//	}
}
}
