package Array;

import java.util.Arrays;
import java.util.Collections;

public class SortingofArrays 
{
	public static void main(String[] args) 
	{
		//String name = "world";
		//char c1[] = name.toCharArray();
		int c1[] = {98,95,21};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(c1));
		
		Arrays.sort(c1);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(c1));
		
		//Arrays.sort(c1, Collections.reverseOrder());
	}
}
