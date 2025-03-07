package Assert;
import java.util.Scanner;
public class Assertion 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the Input : ");
		int input = s1.nextInt();
		assert input>=10:"Hey here input is lesser than 10 so I have to fail you";
		int a = 100;
		int b = 200;
		int sum = a + b;
		System.out.println(sum);
	}
}