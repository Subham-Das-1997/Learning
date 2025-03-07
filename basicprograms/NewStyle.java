package basicprograms;
public class NewStyle 
{
	NewStyle ()
	{
		System.out.println("This is my constructor");
	}
	public static void main(String[] args) 
	{
		NewStyle n1 = new NewStyle();					// 1st way to create an object
		
		//or
		
		new NewStyle();									// 2nd way to create an object to call when only constructor is present
	}
}