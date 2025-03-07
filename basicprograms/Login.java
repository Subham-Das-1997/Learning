package basicprograms;
public class Login 
{
	Login()
	{
		System.out.println("1");
	}
	Login(String a)
	{
		this();
		System.out.println("2");
	}
	Login(char b)
	{
		this("Manish");
		System.out.println("3");
	}
	Login(int a)
	{
		this('A');
		System.out.println("4");
	}
	Login(int a, int b, int c)
	{
		this(10);
		System.out.println("5");
	}
	public static void main(String[] args)
	{
		new Login(1,2,3);
	}
}
