package basicprograms;
// how to create a relationship b/w class & interface

interface LoginDetails
{
	void login();
	void logout();
}
public class Addition_Program implements LoginDetails
{
	public static void main(String[] args) 
	{
		Addition_Program a1=new Addition_Program();
		a1.login();
		a1.logout();
	}
	public void login() 
	{
		System.out.println("Your Actual Logic of Login");
	}
	public void logout() 
	{
		System.out.println("Your Actual Logic of Logout");
	}
}