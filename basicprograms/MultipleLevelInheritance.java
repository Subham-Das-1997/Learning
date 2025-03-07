package basicprograms;
interface Username
{
	void username();
}
interface Password
{
	void password();
}
public class MultipleLevelInheritance implements Username,Password
{
	public static void main(String[] args) 
	{
		MultipleLevelInheritance m1 = new MultipleLevelInheritance();
		m1.username();
		m1.password();
	}
	@Override
	public void password() {
		// TODO Auto-generated method stub
	}
	@Override
	public void username() {
		// TODO Auto-generated method stub	
	}
}
