package Assignments;
import java.util.Scanner;
public class Assignment23 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("Do you want to print 1? (true/false): ");
		boolean printOne = s1.nextBoolean();

		System.out.print("Do you want to print 100? (true/false): ");
		boolean printHundred = s1.nextBoolean();

		for (int i = 1; i <= 100; i++) {
			if ((i == 1 && !printOne) || (i == 100 && !printHundred)) {
				continue;
			}
			System.out.println(i);
			s1.close();
		}
	}
}
