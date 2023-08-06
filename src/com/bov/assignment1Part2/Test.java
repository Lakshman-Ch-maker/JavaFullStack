package com.bov.assignment1Part2;



/* Implement Polymorphism: Extend the vehicle hierarchy assignment by implementing polymorphic behavior. 
Create a method, such as "drive," in the base class, and override it in the derived classes to provide specific implementations. 
Demonstrate polymorphic behavior by invoking the method on different objects of the derived classes. */


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
	
	void drive()
	{
		System.out.println("This is super class drive method");
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
	
	void drive()
	{
		super.drive();
		System.out.println("Try to drive on left lane");
	}
	
	void drive(String a, String b)
	{
		System.out.println("Drive in "+a+" lane first and then"+b+" lane");
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
	
	void drive()
	{
		super.drive();
		System.out.println("Try to drive on left lane");
	}
	
	void drive(String a, String b)
	{
		System.out.println("Drive in "+a+" lane first and then"+b+" lane");
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
	
	void drive()
	{
		super.drive();
		System.out.println("Try to drive on left lane");
	}
	
	void drive(String a, String b)
	{
		System.out.println("Drive in "+a+" lane first and then"+b+" lane");
	}
}

class Test
{
	public static void main(String args[])
	{
		System.out.println("\n The car specs are : ");
		Car c = new Car("Violet");
		
		
		c.tyres(4);
		c.doors(4);
		c.lights(8);
		c.fuel("Diesel");
		c.drive();
		c.drive("Right","Left");
		
		System.out.println("\n The MotorCycle has following specs : ");
		MotorCycle m = new MotorCycle("Green");
		
		
		m.tyres(2);
		m.doors(0);
		m.lights(5);
		m.fuel("Petrol");
		m.drive();
		m.drive("Left","Right");
		
		System.out.println("\n The truck vehicle specs are : ");
		Truck t = new Truck("Magenta");
		
		
		t.tyres(10);
		t.doors(2);
		t.lights(8);
		t.fuel("Petrol");
		t.drive();
		t.drive("Right", "Left");
	}
}
