package basicprograms;
import java.util.Scanner;
 class ScannerClass
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		byte smallerinput = s1.nextByte();			// byte values
		short s2 = s1.nextShort();					// short values		 
		int s3 = s1.nextInt();						// integer values
		long s4 = s1.nextLong();					// long values
		float s5 = s1.nextFloat();					// float values
		double s6 = s1.nextDouble();				// double values
		boolean s7 = s1.nextBoolean();				// boolean values
		String s8 = s1.next();						// String values
		
		System.out.println("Enter 1st number: ");
		int n1 = s1.nextInt();
		System.out.println("Enter 2nd number: ");
		int n2 = s1.nextInt();
		int Sum = n1+n2;
		System.out.println("Output: " +Sum);
	}
}
