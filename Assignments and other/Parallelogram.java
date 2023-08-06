import java.util.Scanner;

class Parallelogram
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

double base;
double height;

double area;

System.out.println("Enter base of the Parallelogram: ");
base = sc.nextDouble();
System.out.println("Enter height of the Parallelogram: ");
height = sc.nextDouble();
area = 0.5*base*height;

System.out.println("The area of the parallelogram is: "+area);
}
}
