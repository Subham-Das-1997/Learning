package encapsulation;
class Authentication
{
	private int age = 18;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String username = "subhamd894@gmail.com";
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	private String password = "Das@1997";
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
public class Getter_Setter 
{
	public static void main(String[] args) 
	{
		Authentication a1 = new Authentication();
		a1.setAge(1);
		a1.setUsername("test@gmail.com");
		a1.setPassword("password");
		System.out.println(a1.getAge());
		System.out.println(a1.getUsername());
		System.out.println(a1.getPassword());
	}
}