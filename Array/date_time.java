package Array;
import java.util.*;

public class date_time 
{
	public static void main(String[] args) 
	{
		Date d1 = new Date();					// Current Time in epoch
		System.out.println(d1.getTime());	
		
		Date d2 = new Date(d1.getTime());		// Current time in Human understandable way
		System.out.println(d2);
		
		// Now lets find future time + 6days
		Date d3 = new Date(d1.getTime()+(1000*60*60*24*6));		// 1000*60*60*24 [for 1day]
		System.out.println(d3);
		
		// Now lets find past time - 2days
		Date d4 = new Date(d1.getTime()-(1000*60*60*24*2));		// 1000*60*60*24 [for 1day]
		System.out.println(d4);
	}
}