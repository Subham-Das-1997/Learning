package Array;
public class Checkspecialcharacarepresentornot 
{
	public static void main(String[] args) 
	{	
		int count_of_digit = 0;
		int count_of_alpha = 0;
		int count_of_space = 0;
		
		String input = "auto batch 28";
		char c1[] =	input.toCharArray();
		for(int i=0 ; i<input.length() ; i++)
		{
			//boolean alpha = Character.isAlphabetic(c1[i]);
			if(Character.isAlphabetic(c1[i])==true)
			{
				count_of_alpha++;
			}
			if(Character.isDigit(c1[i])==true)
			{
				count_of_digit++;
			}
			if(Character.isWhitespace(c1[i])==true)
			{
				count_of_space++;
			}
		}
		System.out.println(count_of_alpha);
		System.out.println(count_of_digit);
		System.out.println(count_of_space);
		
		if(input.length()==(count_of_alpha+count_of_digit+count_of_space))
		{
			System.out.println("No Special Characters");
		}
		else
		{
			System.out.println("It is having special characters");
		}
		int count = input.length()-(count_of_alpha+count_of_digit+count_of_space);
		System.out.println("Count of special character is : "+count);
	}
}