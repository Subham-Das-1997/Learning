package basicprograms;

public class NonStaticMethod {
	void add() 											// Non Static Method
	{
		System.out.println("Addition");
	}
	static void divide()
	{
		System.out.println("Division");
	}
	void multiply()
	{
		System.out.println("Multiplication");
	}
	public static void main(String[] args) {
		NonStaticMethod n1 = new NonStaticMethod(); 	// Creating object, with the help reference variable to call non static method
		n1.add(); 										// calling the non static method
		divide(); 									    // calling the static method
		n1.multiply();
		
	}
}
