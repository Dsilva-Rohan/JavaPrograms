package Programs;

public class PrimeNumberUpto100 
{
	public static void PrimeNumber100(int number)
	{
		
		int i;
		for(i=2; i<=number; i++)
		{
			boolean isprime=true;
			
			for(int j=2; j<i; j++) 
			{
				if(i%j==0)
				{
					isprime=false;
					break;
				}
		
			}
			if(isprime==true)
			{
				System.out.println("list of Prime number is: "+i);
			}
			
		}
		
	}
	
	public static void main(String args[])
	{
		PrimeNumber100(100);
	}
}
	

