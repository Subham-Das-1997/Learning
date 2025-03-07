package basicprograms;
public class ThisKeyword 
{
	int age;		// global variable 	
	String name;	// global variable
	double salary;	// global variable
	void add(int age, String name, double salary)
	{
		this.age=age;  // this keyword
		System.out.println("98");
		System.out.println("Ram");
		System.out.println("7654.76");
	}
	public static void main(String[] args)
	{
		ThisKeyword t1=new ThisKeyword();
		t1.add(21, "Subham", 8765.87);
		System.out.println(t1.age); // global variable is not assigned so it will take default value = 0
	}
}