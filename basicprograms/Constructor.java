package basicprograms;
public class Constructor 
{
	Constructor()										// Constructor creation
	{
		System.out.println("My Constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		Constructor c1 = new Constructor();				// Constructor got invoked once object is created
	}
}