package encapsulation;
class Auth
{
private String username = "subhamd894@gmail.com";
	public void set_username(String username)
	{
		this.username = username;
	}
	public String get_username()
	{
		return username;
	}
	private String password = "Das@1997";
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
public class Facebook 
{
	public static void main(String[] args)
	{
		Auth a1 = new Auth();
		a1.set_username("stbymkt@gmail.com");
		System.out.println(a1.get_username());
	}
}