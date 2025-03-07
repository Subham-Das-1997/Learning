package basicprograms;
public class SIB
{
	static   // SIB Block will execute 1st
	{
		System.out.println("Hi");
	}
	public static void main(String[] args) // Main Method
	{
		System.out.println("Hi I am main method");
		new SIB();
	}	
	
	{
		System.out.println("This is IIB"); // IIB
	}
}