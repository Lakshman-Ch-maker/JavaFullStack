package com.bov.accessmodifiers;


public class Sample1 {

private int a = 45;
public int b = 46;
public int c = 47;
int d = 48;

public void show()
{
	System.out.println("private data cannot be accessed outside the class");	
	System.out.println("a value is : "+a);	

}

public static void main(String[] args) {
	Sample1 sample1 = new Sample1();
	System.out.println("b value is : "+sample1.b);
}

}
