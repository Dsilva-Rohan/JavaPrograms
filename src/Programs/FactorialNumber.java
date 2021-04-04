package Programs;

public class FactorialNumber {
	
	public static void Factorial(int number)
	{
		int fact=1;
		if(number==0)
		{
			System.out.println(1);
		}
		else
		{
		for(int i=2; i<=number; i++)
		{
			fact =fact*i;
		
	} 
		System.out.println("Given number factorial value is:"+fact);
		}
		}	
	public static void main(String args[])
	{
		Factorial(5);
	}
}
