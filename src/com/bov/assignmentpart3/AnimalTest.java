package com.bov.assignmentpart3;

/* Animal Inheritance: Design an animal hierarchy with a base class "Animal" and derived classes such as "Cat," "Dog," and "Bird." 
Add appropriate methods and attributes to represent different behaviors and characteristics of each animal. 
Implement polymorphism by invoking common methods on objects of different animal types. 
*/



class Animal
{
	void speed(int flyingSpeed)
	{
		System.out.println("The flying speed of the bird is "+flyingSpeed+" km/h");
	}
	
	void speed(double minSpeed, int maxSpeed)
	{
		System.out.println("The minimum speed is "+minSpeed+" m/s and maximum speed is "+maxSpeed+" m/s");
	}
	
	void color(String animalColor)
	{
		System.out.println("The color of the animal is : "+animalColor);
	}
	
	void height(int height)
	{
		System.out.println("The height of the animal is : "+height+" cm");
	}
}

class Cat extends Animal
{
	String name = "Cat";
	int height;
	double minS;
	int maxS;
	String color;
	
	
	Cat(int h, double min, int max, String color)
	{
		this.height = h;
		this.minS = min;
		this.maxS = max;
		this.color = color;
		
		super.height(height);
		super.color(color);
		super.speed(minS, maxS);
	}
	 
}


class Dog extends Animal
{
	String name = "Dog";
	int height;
	double minS;
	int maxS;
	String color;
	
	
	Dog(int h, double min, int max, String color)
	{
		this.height = h;
		this.minS = min;
		this.maxS = max;
		this.color = color;
		
		height(height);
		color(color);
	}
		
	
	void speed()
	{
		System.out.println("The min speed of the animal is : "+minS+" m/s and max speed is : "+ maxS+" m/s");
	}
	
}


class Bird extends Animal
{
	String name = "Bird";
	int height;
	int speed;
	String color;
	
	
	Bird(int h, int speed, String color)
	{
		this.height = h;
		this.speed = speed;
		this.color = color;
		
		height(height);
		color(color);
		speed(speed);
	}
	
		
}


class AnimalTest 
{
	public static void main(String args[])
	{
		Cat c = new Cat(10, 0.1, 15, "White-Brown");
		System.out.println("Animal name : "+c.name);
		
		Dog d = new Dog(15, 0.2, 10, "Brown");
		System.out.println("Animal Name : "+d.name);
		d.speed();
		
		Bird b = new Bird(5, 12, "White");
		System.out.println("Animal Name : "+b.name);
		
	}
}