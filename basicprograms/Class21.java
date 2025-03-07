package basicprograms;
abstract class AmazonLogic			// Parent Class 
{
	abstract void login();   // overridden - visible to 3rd party company
}
public class Class21 extends AmazonLogic 	// Child Class
{
	public static void main(String[] args) 
	{
		Class21 c1=new Class21();
		c1.login();
	}
	void login() // within the organisation
	{
		System.out.println("Real Logic");
	}
}
