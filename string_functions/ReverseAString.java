package string_functions;
public class ReverseAString 
{
	public static void main(String[] args) 
	{
		String s = "Subham";
		for(int i=s.length()-1;i>=0;i--)		
		{
			char c1 = s.charAt(i);
			System.out.println(c1);
		}
	}
}