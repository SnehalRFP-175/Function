package Function;

public class PrimeFactors
{
	public static void main(String a[])
	{
		int num=14,factor;
		
		for(int i=1;i*i<=num;i++)
		{
			for(int j=1;j<=num;j++)
			{
				 factor=num/i*i;
				 System.out.println(factor);
			}	
		}		
	}
}
