//index-Yes
//heterogeneous - Yes
//null - Yes
//duplicates - yes
//dynamic - yes
//sorting - yes
package collection_interface;
import java.util.ArrayList;
public class One
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add("Subham");
		a1.add("Das");
		a1.add("Archita");
		a1.add("Mandal");
		a1.add(11);
		a1.add(21);
		a1.add(31);
		a1.add(41);
		a1.add(null);
		a1.add("Subham");
		a1.add("Das");
		a1.add("Archita");
		a1.add("Mandal");
		a1.add(11);
		a1.add(21);
		a1.add(31);
		a1.add(41);
		a1.add(null);
		System.out.println(a1);
	}
}