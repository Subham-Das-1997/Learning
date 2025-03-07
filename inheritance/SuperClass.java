package inheritance;
class ParentClass1
{
	ParentClass1()
	{
		System.out.println("Parent1 Constructor");
	}
}
public class SuperClass extends ParentClass1
{
	SuperClass()
	{
		super();   // super calling statement will also display by default
		System.out.println("Child Constructor");
	}
	public static void main(String[] args)
	{
		new SuperClass();
	}
}
