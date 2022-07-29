package Function;

import java.util.Scanner;

public class Vowel_Consonant 
{
	public static void main(String a[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Character");
	String ch=sc.next();
	
	switch(ch)
	{
		case "a":
			System.out.println(ch+" is Vowel..");
			break;
		case "e":
			System.out.println(ch+" is Vowel..");
			break;
		case "i":
			System.out.println(ch+" is Vowel..");
			break;
		case "o":
			System.out.println(ch+" is Vowel..");
			break;
		case "u":
			System.out.println(ch+" is Vowel..");
			break;
		default:
			System.out.println(ch+" is Consonant...");
			break;
			
			
	}
	}
}
