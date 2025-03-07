package Array;
import java.util.*;
public class FutureTime extends Object
{
	public static void main(String[] args) 
	{
		//FutureTime f1 = new FutureTime();
		
		Date d1 = new Date();					// Current Time in epoch
		System.out.println(d1.getTime());
		
		Date d2 = new Date(d1.getTime());		// Future Time in human understandable language
		System.out.println(d2);
		
		String time = d2.toString();			// converting it to string
		
		String date = time.substring(8, 10);
		System.out.println(date);
		
		String month = time.substring(4, 7);
		System.out.println(month);
		
		String year = time.substring(24);
		System.out.println(year);
		
		System.out.println(date+" "+month+" "+year);
	}
}