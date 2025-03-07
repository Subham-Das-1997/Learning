package basicprograms;
public class ConstructorOverloading 
{
	// Constructor Overloading Topic //
	ConstructorOverloading()
	{
		System.out.println("1");
	}
	
	ConstructorOverloading(int a)
	{
		int c=a+9;
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		new ConstructorOverloading(); 	// without parameter
		new ConstructorOverloading(1);	// with parameter
	}
}