package Assignments;
public class Assignment3 
{
	void first(int a,int b,int c,double d)
	{
		System.out.println(a+b+c+d);
	}
	void first(double a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	void first(int a,double b,int c)
	{
		System.out.println(a+b+c);
	}
	static void first(String a,char b)
	{
		System.out.println(a+" "+b);
	}
	static void first(char a,String b)
	{
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) 
	{
		Assignment3 a1 = new Assignment3();
		a1.first(1, 2, 3, 1.5);
		a1.first(2.5, 4, 5);
		a1.first(6, 3.5, 7);
		first("Subham",'A');
		first('B',"Das");
	}
}
