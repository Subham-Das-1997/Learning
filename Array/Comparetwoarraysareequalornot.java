package Array;

import java.util.Arrays;

public class Comparetwoarraysareequalornot 
{
	public static void main(String[] args)
	{
		int array1[] = new int[2];
		array1[0] = 10;
		array1[1] =	20;
		
		int array2[] = new int[2];
		array2[0] = 10;
		array2[1] =	20;
		
		if(Arrays.equals(array1, array2))
		{
			System.out.println("Both given arrays are equal");
		}
		else
		{
			System.out.println("Both given arrays are not equal");
		}
	}
}