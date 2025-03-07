package Type_Casting;
class Program2
{
	void add()
	{
		
	}
	void substract()
	{
		
	}
}
public class Upcasting extends Program2
{
	void multiply()
	{
		
	}
	public static void main(String[] args) 
	{
		Program2 p1 = new Upcasting();					// Upcasting implicit
		Program2 p2 = (Program2)new Upcasting();		// Upcasting explicit 
		p1.add();
		p1.substract();
		//p1.multiply();
		
		Upcasting u1 = (Upcasting)p1;
	}
}