package Function;

public class Fibonacci 
{
	public static void main(String a[])
	{
	int num1=0,num2=1,num3,i,cnt=10;    
	 System.out.print(num1+" "+num2);
	    
	 for(i=2;i<cnt;++i)    
	 {    
	  num3=num1+num2;    
	  System.out.print(" "+num3);    
	  num1=num2;    
	  num2=num3;    
	 }    

	}
}
