package Assignments;
import java.util.Scanner;
public class Assignment26 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int number;

		System.out.println("Enter numbers to add (Press 0 to stop):");

		System.out.print("Enter a number: ");
		number = scanner.nextInt();
		sum += number;

		if (number != 0) {
			System.out.println("Current Sum: " + sum);
			main(null);
		}

		System.out.println("Final Sum: " + sum);
		scanner.close();
	}
}