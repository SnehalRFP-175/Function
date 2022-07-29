package Function;

import java.util.Scanner;

public class Reverse_num 
{
	    static long reverse(long num){
	        
	      long rev = 0; 
	      long rem;   
	        
	      while(num>0){
	           
	        rem = num%10;
	        rev = (rev*10) + rem;
	        num = num/10;
	      }
	        
	      return rev;
	    }
	      
	    public static void main (String[] args) {
	      
	    	Scanner sc=new Scanner(System.in);         
	    	System.out.print("Enter the number: ");  
	    	int num=sc.nextInt();  
	          
	        System.out.print("Reversed Number is "+ reverse(num));
	    
	}
}
