package Array;
import java.util.Arrays;
public class CheckifStringcontainsonlyDigits {
	public static void main(String[] args) {
		String name = "12345f";
		int noofchar = 0;
		int noofint = 0;

		char a1[] = name.toCharArray();
		System.out.println(Arrays.toString(a1));

		for (int i = 0; i < a1.length; i++) {
			boolean answer = Character.isAlphabetic(a1[i]);
			if (answer == true) {
				noofchar++;
			} 
			else {
				noofint++;
			}
		}
		System.out.println("The number of alphabets are : "+noofchar);
		System.out.println("The number of numeric value are : "+noofint);
			if(noofchar>0) 
			{
				System.out.println("String is not made of numeric");
			}
			else
			{
				System.out.println("String is made of numeric");
			}
		}
	}