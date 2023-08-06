package com.bov.assignmentpart3;

/* Shape Inheritance: Create a class hierarchy representing different shapes, such as "Circle," "Rectangle," and "Triangle." 
Each shape should have common attributes like area and perimeter, as well as specific attributes and methods. 
Implement inheritance and polymorphism to calculate and display the area and perimeter of different shapes.  */

class Shape
{
	void perimeterShow(double perimeter)
	{
		System.out.println("The perimeter is "+perimeter);
	}
	
	void areaShow(double area)
	{
		System.out.println("The Area is : "+area);
	}
	
	void sides()
	{
		System.out.println("This has 0 sides");
	}
	
	void sides(int a)
	{
		System.out.println("This has "+a+" sides");
	}
}

class Circle extends Shape
{
	int radius;
	double perimeter;
	double area;
	
	Circle()
	{
		
	}
	
	Circle(int radius)
	{
		this.radius = radius;
		perimeter = 2*3.14*radius;
		area = 3.14*radius*radius;
	}
	
	void sides()
	{
		super.sides();
		System.out.println("Circle has 0 sides");
	}
}

class Rectangle extends Shape{
	int length;
	int width;
	float perimeter;
	float area;
	
	Rectangle()
	{
		
	}
	
	Rectangle(int l, int w)
	{
		this.length = l;
		this.width = w;
		perimeter = 2*(l+w);
		area = l*w;
	}
}

class Triangle extends Shape
{
	int side;
	int height;
	double perimeter;
	double area;
	
	Triangle()
	{
		
	}
	
	Triangle(int side, int height)
	{
		perimeter = 3*side;
		area = 0.5*side*height;
	}
	
	
}


class Test
{
	public static void main(String args[])
	{
		Circle c = new Circle(3);
		
		c.sides();
		c.perimeterShow(c.perimeter);
		c.areaShow(c.area);
		
		Rectangle r = new Rectangle(4,5);
		r.sides(4);
		r.perimeterShow(r.perimeter);
		r.areaShow(r.area);
		
		Triangle t = new Triangle(2,4);
		t.sides(3);
		t.perimeterShow(t.perimeter);
		t.areaShow(t.area);
		
		
	}
}

