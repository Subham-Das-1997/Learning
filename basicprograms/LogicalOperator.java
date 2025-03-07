package basicprograms;
public class LogicalOperator 
{
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		if(a>10 || b>a)
		{
			int sum=100+a+b;
			System.out.println(sum);
		}
		if(a>5 && b>a)
		{
			int sum=100-a-b;
			System.out.println(sum);
		}
		if(!(a>10 || b>a))
		{
			int sum=100*a*b;
			System.out.println(sum);
		}
		if(!(a>5 && b>a))
		{
			int sum=100*a*b;
			System.out.println(sum);
		}
	}
}
