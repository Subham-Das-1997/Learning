package Array;
import java.util.Arrays;
public class findOutTheIndex 
{
	public static void main(String[] args) 
	{
		int roll[] = {10, 20, 30, 40};
		int myinput = 30;
		for(int i=0 ; i<=3 ; i++)
		{
			if(roll[i]==myinput)
			{
				System.out.println("Number Present at index : " +i);
			}
		}
	}
}