package string_functions;

public class MoreStringFunction 
{
	public static void main(String[] args) 
	{
		String input1 = "My name is Subham";
		System.out.println(input1.toUpperCase());
		
		String input2 = "My name is Das";
		System.out.println(input2.toLowerCase());
		
		System.out.println(input1.equals(input2));
		
		System.out.println(input1.equalsIgnoreCase(input2));
		
		String a="Ram";
		String b="ram";
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
	}
}
