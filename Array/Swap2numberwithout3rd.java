package Array;
public class Swap2numberwithout3rd 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		System.out.println("Before swapping a : "+a);
		System.out.println("Before swapping b : "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping a : "+a);
		System.out.println("After swapping b : "+b);
	}
}