package com.bov.assignment1;

/* Create a Class Hierarchy: Define a class hierarchy representing different types of vehicles. 
Start with a base class "Vehicle" and create derived classes such as "Car," "Motorcycle," and "Truck." 
Add relevant attributes and methods to each class that capture their unique characteristics. */



 class Vehicle
{
	void tyres(int a)
	{
		System.out.println("The vehicle has "+a+" tyres");
	}
	
	void doors(int b)
	{
		System.out.println("The vehicle has "+b+" doors");
	}
	
	void lights(int c)
	{
		System.out.println("The vehicle has "+c+" lights");
	}
	
	void fuel(String d)
	{
		System.out.println("The vehicle has "+d+" as its fuel");
	}
}

class Car extends Vehicle
{
	String color;
	Car()
	{
		
	}
	
	Car(String c)
	{
		this.color = c;
		System.out.println("This car color is : "+color);
	}
	
	
}

class MotorCycle extends Vehicle
{
	String color;
	MotorCycle()
	{
		
	}
	
	MotorCycle(String c)
	{
		this.color = c;
		System.out.println("This MotorCycle color is : "+color);
	}
	
	
}

class Truck extends Vehicle
{
	String color;
	Truck()
	{
		
	}
	
	Truck(String c)
	{
		this.color = c;
		System.out.println("This Truck color is : "+color);
	}
	
	
}

class Test
{
	public static void main(String args[])
	{
		Car c = new Car("Violet");
		System.out.println("The car specs are : ");
	
		c.tyres(4);
		c.doors(4);
		c.lights(8);
		c.fuel("Diesel");
		
		MotorCycle m = new MotorCycle("Green");
		System.out.println("The MotorCycle has following specs : ");
		
		m.tyres(2);
		m.doors(0);
		m.lights(5);
		m.fuel("Petrol");
		
		Truck t = new Truck("Magenta");
		System.out.println("The truck vehicle specs are : ");
		
		t.tyres(10);
		t.doors(2);
		t.lights(8);
		t.fuel("Petrol");
		
	}
}