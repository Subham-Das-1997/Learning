package basicprograms;
abstract class Country_Class
{	
	abstract void nh_road();  // abstract methods
	static void add()		  // concrete methods
	{
		System.out.println("Some logics are being exposed");
	}
}
abstract class State_Class extends Country_Class
{
	abstract void state_road();
	void subtract()
	{
		System.out.println("Some small logics are being exposed");
	}
}
public class City_Class extends State_Class
{
	void multi()
	{
		
	}
	static void div()
	{
		
	}
	public static void main(String[] args) 
	{
		div();
		City_Class c1=new City_Class();
		c1.multi();
		c1.state_road();
		c1.nh_road();
	}
	void state_road()
	{
		
	}
	void nh_road()
	{
		
	}
}
