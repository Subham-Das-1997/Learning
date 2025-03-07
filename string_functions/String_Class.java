package string_functions;
public class String_Class
{
	public static void main(String[] args) 
	{
		String name="Srilanka";																			// a.length()
		int a1 = name.length();
		System.out.println(a1);					
		
		System.out.println(name.charAt(6)); 															// a.charAt(index)
		
		String name1 = " is my neighbour country";
		System.out.println(name.concat(name1)); 														// concat
		
		System.out.println(name.concat("Manish"));
		
		System.out.println("Manish".concat(" ").concat("Kumar"));
		
		System.out.println("Manish".concat(" ").concat("Kumar").concat(" ").concat("Tiwari"));
		
		System.out.println(name.indexOf('S')); 															// a.indexOf('char')
	
		System.out.println(name.trim());
		String a2="          I Love My Friends          ";
		System.out.println(a2);
		System.out.println(a2.trim());																	// a.trim()
	}
}