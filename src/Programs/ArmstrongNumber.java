package Programs;

public class ArmstrongNumber
{

	public static void Armstrong(int number)
	{
	 
	    int temp=number;
		int cube=0;
		while(number>0)
	  {
		int reminder=number%10;
		number=number/10;
	    cube=cube+(reminder*reminder*reminder);
	  }
	  
	  if(temp==cube)
	  {
	    System.out.println("The given number is armstrong number: "+cube);
	    
	  }
	  else 
	  {
		  System.out.println("The given number is not armstrong number");
	  }
	
   }
	
  public static void main(String args[])
  {
	  Armstrong(153);
  }
}
