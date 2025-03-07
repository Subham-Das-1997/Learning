package Assignments;
import java.util.Scanner;
public class Assignment22 {
	static void addition()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		double n1 = s1.nextDouble();
		System.out.println("Enter 2nd number: ");
		double n2 = s1.nextDouble();
		double add = n1+n2;
		System.out.println("Add Result: " +add);	
	}
	static void subtraction()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		double n1 = s1.nextDouble();
		System.out.println("Enter 2nd number: ");
		double n2 = s1.nextDouble();
		double sub = n1-n2;
		System.out.println("Subtract Result: " +sub);
	}
	void multiplication()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		double n1 = s1.nextDouble();
		System.out.println("Enter 2nd number: ");
		double n2 = s1.nextDouble();
		double mul = n1*n2;
		System.out.println("Multiply Result: " +mul);
	}
	void division()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		double n1 = s1.nextDouble();
		System.out.println("Enter 2nd number: ");
		double n2 = s1.nextDouble();
		double div = n1/n2;
		System.out.println("Division Result: " +div);
	}
	public static void main(String[] args) 
	{
		addition();
		subtraction();
		Assignment22 a1=new Assignment22();
		a1.multiplication();
		a1.division();
	}

}
