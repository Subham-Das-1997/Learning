package Assert;
import java.util.Scanner;
public class Assert_2 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter String : ");
		String input = s1.next();
		
		assert input.isEmpty()==false;
		int size = input.length();
		System.out.println(size);
	}
}
