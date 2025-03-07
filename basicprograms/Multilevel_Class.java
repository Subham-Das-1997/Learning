package basicprograms;
interface Authentication
{
	void un();
	void pw();
}
abstract class LogintoNyka implements Authentication
{
	abstract void credentials();
	static void OTP()
	{
		System.out.println("OTP's will be provided");
	}
}
public class Multilevel_Class extends LogintoNyka
{
	public static void main(String[] args) 
	{
		Multilevel_Class m1=new Multilevel_Class();
		m1.un();
		m1.pw();
		m1.credentials();
		OTP();
	}

	@Override
	public void un() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void credentials() {
		// TODO Auto-generated method stub
		
	}
}
