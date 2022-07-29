package Function;

import java.util.Scanner;

class Palindrom
{  
	 public static void main(String args[])
	 {  
	  Scanner sc=new Scanner(System.in); 
	  System.out.println("Enter the Number-->");
	  int num=sc.nextInt(); 
	  int temp=num; 
	  int sum=0;
	  for (int i=0;num>0;i++)
	  {    
	   int r=num%10;  
	   sum=(sum*10)+r;    
	   num=num/10;    
	  }    
	  if(temp==sum)    
	   System.out.println(temp+ " is Palindrome ");    
	  else    
	   System.out.println(temp+" is not Palindrome");    
	}  
	}  