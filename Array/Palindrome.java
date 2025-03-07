package Array;
public class Palindrome {
	public static void main(String[] args) 
	{
		String input = "Malayalam";
		String output = "";
		
		for(int i=input.length()-1 ; i>=0 ; i--)
		{
			char c = input.charAt(i);
			output = output + c;
		}
			System.out.println(output);
		if(input.equalsIgnoreCase(output))
		{
			System.out.println("Palindrome");
		}
		else 
		{
			System.out.println("Not Palindrome");
		}
	}
}