import java.util.Scanner;﻿



class Square
{
public static void main(String []args)
{
float side;
double area;
double perimeter;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the side of the square : ");
side = sc.nextFloat();
area = side * side;
perimeter = 4 * side;
System.out.println("The area of the square is : "+area+" and the perimeter of the square is : "+perimeter);
}
}