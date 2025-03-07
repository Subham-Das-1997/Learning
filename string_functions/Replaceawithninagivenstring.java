package string_functions;
public class Replaceawithninagivenstring 
{
	public static void main(String[] args) 
	{
		String name = "abhishek";
		String output = name.replace('a', 'n');
		System.out.println(output);
		
		String output1 = name.replaceAll("h"," ");
		System.out.println(output1);
		
		String name1 = "Subham Kumar";
		String output2 = name1.replaceAll("Kumar", "Das");
		System.out.println(output2);
		
		String name2 = "GroTechMinds";
		String output3 = name2.replaceAll("[a-z]", "");
		System.out.println(output3);
		
		String output4 = name2.replaceAll("[A-Z]", "");
		System.out.println(output4);
	}
}