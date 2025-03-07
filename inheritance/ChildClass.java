package inheritance;
class ParentClass
{
	void add() 
	{
		int a=100;
		int b=200;
		System.out.println(a+b);
	}
}
public class ChildClass extends ParentClass			//  Method Overriding
{
	void add()
	{
		super.add();
		// method overriding concept to get the parent class implementation along with child class implementation
		// super keyword to be used in the non static concept
		// it can be at any line in the non static method
		int a=187;
		int b=280;
		System.out.println(a+b);
	}
	public static void main(String[] args) 
	{
		ChildClass c1=new ChildClass();
		c1.add();
	}
}
// we can only override non static methods in Java