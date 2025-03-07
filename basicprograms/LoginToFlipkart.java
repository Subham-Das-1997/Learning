package basicprograms;
public class LoginToFlipkart 
{
	LoginToFlipkart()
	{
		System.out.println("1");
	}
	LoginToFlipkart(int a)
	{
		this();
		System.out.println("2");
	}
	public static void main(String[] args)
	{
		new LoginToFlipkart(100);
	}
}


// super() calling statement - impli & expli
// this() calling statement  - expli