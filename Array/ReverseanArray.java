package Array;
import java.util.Arrays;
public class ReverseanArray 
{
	public static void main(String[] args) 
	{
		int age[] = {10, 20, 30, 40, 50};
		int reverseage[] = new int[age.length];
		int k=0;
		for(int i=age.length-1 ; i>=0 ; i--)
		{
						reverseage[k] = age[i];
						k++;
		}
		System.out.println(Arrays.toString(age));
		System.out.println(Arrays.toString(reverseage));
	}
}