//sorting - yes
package collection_interface;
import java.util.ArrayList;
import java.util.Collections;
public class Two 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add(43);
		a1.add(57);
		a1.add(11);
		a1.add(27);
		a1.add(31);
		Collections.sort(a1);
		System.out.println(a1);
	}
}