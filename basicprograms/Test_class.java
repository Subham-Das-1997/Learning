package basicprograms;
public class Test_class
{
 static void main(String[] args) 
	{
	 	int no[] = new int[4];
	 		no[0] = 10;
	 		no[1] = 20;
	 		no[2] = 30;
	 		no[3] = 40;
	 		
	 		int myinput = 35;
	 		for(int i=0;i<=3;i++)
	 		{
	 			if(myinput==no[i])
	 			{
	 				System.out.println("The given number is present");
	 			}
	 		}
	}
}