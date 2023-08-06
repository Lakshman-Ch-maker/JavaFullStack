package com.bov.encapsulation;

public class Test {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(101);
		employee.setName("Lakshman.Ch");
		employee.setSalary(45000);
		System.out.println("Employee ID : "+employee.getId());
		System.out.println("Employee Name : "+employee.getName());
		System.out.println("Employee Salary : "+employee.getSalary());
	
	 Student student = new Student();
	 student.setId(1);
	 student.setName("Lakshman");
	 student.setClassName("S");
	 
	 System.out.println("Student ID is : "+student.getId());
	 System.out.println("Student Name is : "+student.getName());
	 System.out.println("Student Class Name is : "+student.getClassName());
	 
	}
}
