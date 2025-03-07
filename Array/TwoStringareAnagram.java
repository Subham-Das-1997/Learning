package Array;
import java.util.Arrays;
public class TwoStringareAnagram
{
	public static void main(String[] args)
	{
		String s1 = "listen";
		String s2 = "silent";
		if(s1.length()!=s2.length())
		{
			System.out.println("They are not anagram");
		}
		else
		{
			char c1[] = s1.toCharArray();  // [l,i,s,t,e,n]
			Arrays.sort(c1);
			char c2[] = s2.toCharArray();  // [s,i,l,e,n,t]
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			
			if(Arrays.equals(c1, c2))
			{
				System.out.println("They are anagram");
			}
			else
			{
				System.out.println("They are not anagram");
			}
		}
	}
}