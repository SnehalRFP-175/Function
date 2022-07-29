package Function;

import java.util.Scanner;

public class Even_Odd 
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number-->\n");
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println(num+ " is Even...");
		}
		else
			System.out.println(num+ " is not Even...");
	}

}
