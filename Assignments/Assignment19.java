package Assignments;
public class Assignment19 {
	public static void main(String[] args) 
	{
		for(int i=1;i<=500;i++)
		{
			System.out.println(i);
			if(i%3==0)
			{
				System.out.println("Computer"+i);
			}
			if(i%5==0)
			{
				System.out.println("Mouse"+i);
			}
			if(i%3==0 && i%5==0)
			{
				System.out.println("Computer & Mouse"+i);
			}
		}
	}
}
