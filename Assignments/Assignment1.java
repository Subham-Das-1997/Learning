package Assignments;
public class Assignment1 {
	static void one()
	{
		System.out.println("one");
	}
	static void two()
	{
		System.out.println("two");
	}
	void three()
	{
		System.out.println("three");
	}
	void four()
	{
		System.out.println("four");
	}
	public static void main(String[] args) 
	{
		one();
		two();
		Assignment1 a1 = new Assignment1();
		a1.three();
		a1.four();
	}
}