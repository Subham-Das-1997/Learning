package basicprograms;
public class LoginToAmazon
{
	LoginToAmazon()
	{
		this(87);								// this calling statement is to call from one cons to another cons within the same class
		System.out.println("1");
	}
	LoginToAmazon(int a)
	{
		System.out.println("2");
	}
	public static void main(String[] args) 
	{
		new LoginToAmazon();
	}
}