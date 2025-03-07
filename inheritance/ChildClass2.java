package inheritance;
class ParentClass2
{
	void add()
	{
		int a=100;
		int b=200;
		System.out.println(a+b);
	}
}
public class ChildClass2 extends ParentClass2
{
	void add()
	{
		int a=187;
		int b=280;
		System.out.println(a+b);
	}
	public static void main(String[] args) 
	{
		ChildClass2 c1=new ChildClass2();
		c1.add();
	}
}
