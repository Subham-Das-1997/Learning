package exception_handling;
public class ExceptionProg1 
{
	public static void main(String[] args) 
	{
		try 
		{
		int c = 1/0;	// issue line so it will in try block
		System.out.println(c);
		}
		catch(ArithmeticException a1) // handled the exception
		{
			 System.out.println("Since the infinity cannot be store in int datatype");
		}
	}
}