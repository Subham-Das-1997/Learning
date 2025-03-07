package Assignments;
public class Assignment2 
{
	Assignment2()
	{
		System.out.println("No");
	}
	Assignment2(int a)
	{
		System.out.println("int");
	}
	Assignment2(boolean a)
	{
		System.out.println("boolean");
	}
	Assignment2(String a)
	{
		System.out.println("String");
	}
	Assignment2(char a)
	{
		System.out.println("char");
	}
	public static void main(String[] args) 
	{
		new Assignment2();
		new Assignment2(9);
		new Assignment2(true);
		new Assignment2("String");
		new Assignment2('A');
	}
}
