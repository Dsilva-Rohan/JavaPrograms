package Programs;

public class ArmstrongUpto1000 
{
   public static void armstronglimit(int number)
   {
	   int reminder;
	   int arm=0;
	   int n;
	   for(int i=1; i<=number; i++)
	   {
		 
		   n=i;
		   while(n>0)
		  {
	
		   reminder=n%10;
		   n=n/10;
		   arm=arm+(reminder*reminder*reminder);
		  }  
		   if(arm==i)
		   {
			   System.out.println("Armstrong number is:"+arm);
		   }
		   arm=0;
	
   }
   }  
   public static void main(String args[])
   {
	   armstronglimit(1000);
   }
}
