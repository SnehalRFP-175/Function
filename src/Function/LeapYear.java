package Function;
 import java.util.*;
public class LeapYear 
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year-->");
		int year=sc.nextInt();
		
		if(year%4==0 && year%100==0 && year%400==0) 
		{
			System.out.println(+year+"-->The Year is leap Year");
		}
		else
		System.out.println(+year+"-->The Year is not leap Year");
	}

}
