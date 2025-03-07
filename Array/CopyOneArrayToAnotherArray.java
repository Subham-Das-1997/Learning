package Array;

import java.util.Arrays;

public class CopyOneArrayToAnotherArray 
{
	public static void main(String[] args) 
	{
		int array1[] = new int[4];
		array1[0]=76;
		array1[1]=79;
		array1[2]=96;
		array1[3]=20;
		
		int array2[] = new int[4];		// new int[array1.length];
		
		for(int i=0 ; i<array1.length ; i++)
		{
			array2[i] = array1[i];
		}
		System.out.println(Arrays.toString(array2));
	}
}
