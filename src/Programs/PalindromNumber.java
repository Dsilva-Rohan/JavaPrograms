package Programs;

public class PalindromNumber
{
	public static void palindromnumber(int number)
	{
		int temp=number;
		int sum=0;
		while(number>0)
		{
			int reminder=number%10;
			
			sum=(sum*10)+reminder;
			number=number/10;
		}
		if(sum==temp)
		{
			System.out.println("Given number is Palindrom");
		}
		else
		{
			System.out.println("Given Number is not palindrom");
		}
	}
    
	public static void main(String args[])
	{
		palindromnumber(7777);
	}
}
