package string_functions;
public class matchesfunction 
{
	public static void main(String[] args) 
	{
		String name = "surekha";
		boolean s1 = name.matches("..r(.*)"); 		// checking 3rd character is r
		boolean s2 = name.matches("(.*)e(.*)");		// (.*) for multiple words | . for single word
		System.out.println(s1);
		System.out.println(s2);
	}
}