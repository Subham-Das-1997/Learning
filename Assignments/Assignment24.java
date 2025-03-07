package Assignments;
import java.util.Scanner;
 class Assignment24 
{	
	static void AreaOfCircle()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		double r=s1.nextDouble();
		double Area = 3.14*r*r;
		System.out.println("Area of circle: "+Area);
		s1.close();
	}
	public static void main(String[] args)
	{
		AreaOfCircle();
	}
}