package Type_Casting;
class Grandparent
{
	void add()
	{
		
	}
}
class Parent extends Grandparent
{
	void subtract()
	{
		
	}
}
public class Up_Down_Casting extends Parent
{
	void multiply()
	{
		
	}
	public static void main(String[] args) 
	{
		Parent p1 = new Up_Down_Casting();					// implicit upcast
		Parent p2 = (Parent) new Up_Down_Casting();			// explicit upcast
		p1.subtract();
		p1.add();
		//p1.multiply();
	}
}