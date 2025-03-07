package basicprograms;
public class GlobalVariable 
{
	static int a=10;							// global variable                      
	static int b=20;							// global variable
	
	static void add()
	{
		int a=200;								// local variable
		int add=a+b;							// add is local variable
		System.out.println(add);
	}
	static void sub()
	{
		int sub=a-b;							// sub is local variable
		System.out.println(sub);
	}
	static void mul()
	{
		int mul=a*b;							// mul is local variable
		System.out.println(mul);
	}
	static void div()
	{
		int div=b/a;							// div is local variable
		System.out.println(div);
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
	}
}
