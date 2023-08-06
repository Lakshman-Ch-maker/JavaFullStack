import java.util.Scanner;

class Rhombus
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

double d1;
double d2;

double area;

System.out.println("Enter diagonal - 1 of Rhombus: ");
d1 = sc.nextDouble();
System.out.println("Enter diagonal - 2 of Rhombus: ");
d2 = sc.nextDouble();
area = 0.5*d1*d2;

System.out.println("The area of the Rhombus is: "+area);
}
}
