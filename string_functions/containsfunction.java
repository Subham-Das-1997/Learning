package string_functions;
public class containsfunction 
{
	public static void main(String[] args) 
	{
		String name = "Subham Das";
		boolean b1 = name.contains("Das");
		boolean b2 = name.contains("ubha");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(name.lastIndexOf('m'));
		System.out.println(name.replace('u', 'i'));
		System.out.println(name.replaceAll("Subham Das", "SD"));
	}
}