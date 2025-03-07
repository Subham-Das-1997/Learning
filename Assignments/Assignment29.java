package Assignments;
class One
{
	void a() 
	{
	}
}
class Two extends One
{
	void b() 
	{
	}
}
class Three extends Two
{
	void c() 
	{
	}
}
public class Assignment29 extends Three
{
	void d() 
	{
	}
	public static void main(String[] args) 
	{
		One o1 = new Two();			// upcasting c3 -> c4
		o1.a();
		Two t1 = new Three();		// upcasting
		Three t2 = (Three) t1;		// downcasting
		t2.a();
		t2.b();
		t2.c();
	}
}