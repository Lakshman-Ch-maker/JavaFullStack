package com.bov.variables;

public class Variables {

		int a = 45; // instance
	int b = 15; // instance

	static int x = 20;	// static
	static int y = 15;	// static

	void add()
	{
		int m = 12; // local
		int n = 15; //local
		int p = m+n;  // local
	System.out.println("addition of local variables : "+p);
	}
	public static void main(String args[])
	{
	// int c = a+b;
	Variables vd = new Variables();
	int c = vd.a + vd.b;
	System.out.println("addition of instance variables : "+c);
	int z = x+y;
	System.out.println("addition of static variables : "+z);
	vd.add();

	}
	

}
