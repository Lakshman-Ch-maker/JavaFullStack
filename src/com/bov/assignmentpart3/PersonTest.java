package com.bov.assignmentpart3;

/* 

School System Inheritance: Model a school system using inheritance. 
Create a base class "Person" and derived classes such as "Teacher" and "Student." 
Implement functionalities like assigning subjects to teachers and registering students for courses. 
Demonstrate inheritance and polymorphism by accessing and displaying information about different types of people in the school system.

*/

import java.util.Scanner;


class Person
{
	private String[] students={"Anil", "Sunil", "Raju", "Pratish", "Sunitha", "Geetha", "Ganesh"};
	private int[] roll = {13,12,11,10,9,8,7};
	private int[] classname = {1,4,2,3,5,7,8};
	protected int[] courseNum = new int[7];
	protected String course[] = new String[7];
	
	private int[] teacherId = {1,2,3};
	private String[] teachers = {"Rambabu", "Pratap", "Pranitha"};
	private String[] qualification = {"PhD", "PhD", "PhD"};
	protected String[] subjects = new String[3];
	
	
	
	public void showStudent(int rollno)
	{
		int found = 0;
		for(int i=0; i<7; i++)
		{
			if(roll[i] == rollno)
			{
				found = 1;
				System.out.println("Student with roll no.: "+rollno+" is : "+students[i]+" , class name : "+classname[i]+", course number : "+courseNum[i]+", and course is : "+course[i]);
			}
		}
		if(found == 0)
		{
			System.out.println("The student with roll no.: "+rollno+" is not present");
		}
	}
	
	
	public void showTeacher(int id)
	{
		int found = 0;
		for(int i=0; i<3; i++)
		{
			if(teacherId[i] == id)
			{
				found = 1;
				System.out.println("Teacher with Teacher ID: "+id+" is : "+teachers[i]+" and qualification is : "+qualification[i]+" and assigned sunject is : "+subjects[i]);
			}
		}
		
		if(found == 0)
		{
			System.out.println("Teacher with ID : "+id+" is not present.");
		}
	}
	
   int studentFound(String n, int r)
	{
		
		for(int i=0; i<7; i++)
		{
			if(students[i] == n && roll[i] == r)
			{
				
				return i;
			}
		}
		
			
		
		
			return -1;
		
		
	}
	
	
	public void getTeacherInfo()
	{
		for(int i = 0; i < 3; i++)
		{
			System.out.println("Teacher : "+teachers[i]+" \n Qualification : "+qualification[i]);
		}
	}
	
	public void getTeacherInfo(int a)
	{
		System.out.println("Teacher : "+teachers[a]+" \n Qualification : "+qualification[a]);
		
	}
	
	public void getStudentInfo(int a)
	{
		System.out.println("Student : "+students[a]+" \n Roll No. : "+roll[a]+" \n Class Name : "+classname[a]);
	}
	
	
	 int teacherFound(String t, String q)
	{
		
		for(int i=0; i<3; i++)
		{
			if(teachers[i] == t && qualification[i] == q)
			{
			
				return i;
			}
		}
	
		
		return -1;
		
	}
	
	
	
	public void getStudentInfo()
	{
		for(int i = 0; i < 7; i++)
		{
			System.out.println("Student : "+students[i]+" \n Roll No. : "+roll[i]+" \n Class Name : "+classname[i]);
		}
	}
	
	
	
	public void studentStatus(boolean a, int c, String name, int p)
	{
		if(a)
		{
			courseNum[p] = c;
			course[p] = name;
			System.out.println("Student registration success for course number : "+c+" , course name : "+name);
		}
		else
		{
			System.out.println("Student registration failed !!!");
		}
	}
	
	
	public void teacherStatus(boolean a, String t, String subject, int pos)
	{
		if(a)
		{
			subjects[pos] = subject;
			System.out.println("The teacher "+t+" is assigned "+subject);
		}
		else
		{
			System.out.println("Assignment of status failed !!!");
		}
		
	}
}


class Student extends Person
{
	
	public void showStudent(int rollno)
	{
		super.showStudent(rollno);
	}
	
	
	
	public void getStudentInfo(int a)
	{
		super.getStudentInfo(a-1);
	}
	
	
	
	void register(int courseNum, String courseName, String studentName, int rollNo)
	{
		int pos;
		if((pos = studentFound(studentName, rollNo)) != -1)
		{
			studentStatus(true, courseNum, courseName, pos);
		}
		
		else
		{
			studentStatus(false, courseNum, courseName, pos);
		}
	}
}



class Teacher extends Person
{
	String subject;
	
	
	public void showTeacher(int id)
	{
		super.showTeacher(id);
	}
	
	
	
	public void getTeacherInfo(int a)
	{
		super.getTeacherInfo(a-1);
	}
	
	void assign(String subjectName, String teacherName, String qualification)
	{
		int pos;
		if((pos = teacherFound(teacherName, qualification)) != -1)
		{
			teacherStatus(true, teacherName, subjectName, pos);
		}
		
		else
		{
			teacherStatus(false, teacherName, subjectName, pos);
		}
	}
}



class PersonTest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		
		int choice;
		Student s = new Student();
		System.out.println("Student at position 1 : ");
		s.getStudentInfo(1);
		s.register(1, "B Tech", "Anil", 13);
		s.register(2, "Degree", "Sunil", 12);
		
		System.out.println("Do you want to display all students info type \"1\" if yes or \"2\" for individual students info : ");
		
		choice = sc.nextInt();
		
		if(choice == 1)
		{
			s.getStudentInfo();
		}
		else if(choice == 2)
		{
			int stroll;
			
			System.out.println("Enter student roll no.: ");
			stroll = sc.nextInt();
			s.showStudent(stroll);
		}
		else
		{
			System.out.println("Thank you !!! ...");
		}
		
	
		
		
		Teacher t = new Teacher();
		System.out.println("Teacher at popsition 1 : ");
		t.getTeacherInfo(1);
		t.assign("Science", "Rambabu", "PhD");
		t.assign("Math", "Pratap", "PhD");
		
		System.out.println("Do you want to display all teachers info type \"1\" if yes and \"2\" if you want to access individual teacher info: ");
		choice = sc.nextInt();
		
		if(choice == 1)
		{
			s.getTeacherInfo();
		}
		else if(choice == 2)
		{
			int teid;
			System.out.println("Enter teacher ID no.: ");
			teid = sc.nextInt();
			s.showTeacher(teid);
		}
		else
		{
			System.out.println("Thank you !!! ...");
		}
	}
}
