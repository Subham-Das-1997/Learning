package Array;
import java.util.Arrays;
public class CheckhowmanyNoandAlphabets {
	public static void main(String[] args) {
		String name = "50 cent";
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
	}
}