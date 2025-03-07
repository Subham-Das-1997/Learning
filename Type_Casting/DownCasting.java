package Type_Casting;
class Grandparent
{
	void add()
	{
		
	}
}
class Parent extends Grandparent
{
	void substract()
	{
		
	}
}
public class DownCasting extends Parent
{
	void multiply()
	{
		
	}
	public static void main(String[] args) 
	{
		Parent p1 = new DownCasting();
		p1.add();
		p1.substract(); 
		Grandparent g1 = new DownCasting();
		DownCasting d1 = (DownCasting)g1;
		d1.add();
		d1.substract();
		d1.multiply();
	}
}