package basicprograms;
public class MethodOverloading 
{
	//int a =100;
	static void add(int a,double b)  // 1st shop
	{
		System.out.println(a);
		System.out.println(b);
		double c=a*b;
		System.out.println(c);
	}
	static void add(double c,int a)  // 2nd shop
	{
		System.out.println(c);
		System.out.println(a);
		double b=c*a;
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		add(9.3,100);
		add(1100,7.65);
	}
}
