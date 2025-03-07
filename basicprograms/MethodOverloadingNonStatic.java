package basicprograms;
public class MethodOverloadingNonStatic 
{
	void add(int a)
	{
		System.out.println(a);
	}
	void add(double b)
	{
		System.out.println(b);
	}
	static void add()
	{
		System.out.println("No Parameter");
	}
	public static void main(String[] args) 
	{
		MethodOverloadingNonStatic m1 = new MethodOverloadingNonStatic();
		m1.add(12);
		m1.add(56.4);
		add();
	}
}
