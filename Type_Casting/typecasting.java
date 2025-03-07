package Type_Casting;
public class typecasting 
{
	public static void main(String[] args) 
	{
		int not_pi = (int) 3.14;		// narrowing - explicit way
		System.out.println(not_pi);
		
		double weight = 56;				// widening - implicit & explicit both
		System.out.println(weight);
		
		byte a = 63;
		long l = (long)a;
		System.out.println(a);
		System.out.println(l);
	}
}