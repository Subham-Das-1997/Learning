package Assignments;

public class Assignment4 
{	
	Assignment4()
	{
		System.out.println("1");
	}
	Assignment4(int a)
	{
		System.out.println("2");
	}
	void add()
	{
		System.out.println("3");
	}
	void add(int a)
	{
		System.out.println("4");
	}
	public static void main(String[] args) 
	{
		new Assignment4();
		new Assignment4(2);
		Assignment4 a1 = new Assignment4();
		a1.add();
		a1.add(1);
	}
}
