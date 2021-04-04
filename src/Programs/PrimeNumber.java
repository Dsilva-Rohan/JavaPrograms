package Programs;

// Check the prime number for given value
public class PrimeNumber
{
	public static void CheckPrimeNumber(int number)
	{
		boolean isprime=true;		
		  if(number<2)
		  	  System.out.println("the given number is not a valid");
		  else
		  {	  
		for(int i=2; i<number; i++)
		{		
			if(number%i==0)
			{
				System.out.println("Given number is not prime:   "+number);
				isprime=false;
				break;
			}
		}
		if(isprime==true)
		{
		  System.out.println("Given number is Prime number:  "+number);	
	    }
	}
	}
    public static void main(String args[])
    {
    	   CheckPrimeNumber(6);
    	   StringBuilder builder=new StringBuilder("hello");  
           builder.reverse();  
           System.out.println(builder);  
    }	
}
