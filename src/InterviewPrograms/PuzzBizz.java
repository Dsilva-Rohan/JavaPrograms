package InterviewPrograms;

public class PuzzBizz
{
  public static void checkPUzzBizz(int number)
  {
	  if(number%3==0)
	  {
		  System.out.println("Number is devisabel by 3 BUZZ");
		  
	  }
	  
	   if(number%5==0)
	  {
		  System.out.println("Number is devisabel by 5 PuZZ");
	  }
	   
	     if ((number%5==0) && (number%3==0))
	  {
		  System.out.println("Number is devisabel by 5 and 3 PuZZBUZZ");
	  }
	  
		   
  }
  public static void main(String args[])
  {
	  checkPUzzBizz(15);
  }
}
