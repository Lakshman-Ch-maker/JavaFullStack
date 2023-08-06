package com.bov.assignmentpart3;

/* Employee Inheritance: Design an employee management system using inheritance. 
Create a base class "Employee" and derived classes such as "Manager," "Developer," and "Tester." 
Each derived class should have specific attributes and methods, along with common attributes like name and salary. 
Implement functionality to calculate the total salary of all employees. */

class Employee
{
	private int id;
	private String name;
	private float salary;
	
	void setId(int id)
	{
		this.id = id;
	}
	int getId()
	{
		return id;
	}
	void setName(String name)
	{
		this.name = name;
	}
	String getName()
	{
		return name;
	}
	void setSalary(float salary)
	{
		this.salary = salary;
	}
	float getSalary()
	{
		return salary;
	}
}

class Manager extends Employee
{
	int id;
	String name;
	float salary;
	
	Manager()
	{
		
	}
	
	Manager(int id, String name, float salary)
	{
		Manager m1 = new Manager();
		m1.setId(id);
		m1.setName(name);
		m1.setSalary(salary);
	}
}

class Developer extends Employee
{
	int id;
	String name;
	float salary;
	
	Developer()
	{
		
	}
	
	Developer(int id, String name, float salary)
	{
		Developer m2 = new Developer();
		m2.setId(id);
		m2.setName(name);
		m2.setSalary(salary);
	}
}

class Tester extends Employee
{
	int id;
	String name;
	float salary;
	
	Tester()
	{
		
	}
	
	Tester(int id, String name, float salary)
	{
		Tester m3 = new Tester();
		m3.setId(id);
		m3.setName(name);
		m3.setSalary(salary);
	}
}

class EmployeeTest
{
	public static void main(String args[])
	{
		Manager m = new Manager(1,"Girish",65000);
		System.out.println("Manager ID is : "+m.getId());
		System.out.println("Manager Name is : "+m.getName());
		System.out.println("Manager Salary is : "+m.getSalary());
		
		Developer d = new Developer(2,"Rakesh",75000);
		System.out.println("Developer ID is : "+d.getId());
		System.out.println("Developer Name is : "+d.getName());
		System.out.println("Developer Salary is : "+d.getSalary());
		
		Tester t = new Tester(3,"Nitish",70000);
		System.out.println("Manager ID is : "+t.getId());
		System.out.println("Manager Name is : "+t.getName());
		System.out.println("Manager Salary is : "+t.getSalary());
	}
}
