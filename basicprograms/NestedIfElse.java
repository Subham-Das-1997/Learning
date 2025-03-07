package basicprograms;
public class NestedIfElse 
{
	public static void main(String[] args) 
	{
		int a=100;
		int b=200;
		if(a<b)
		{
			if(a<500)
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("2");
			}
		}
		else
		{
			System.out.println("3");
		}
	}
}
