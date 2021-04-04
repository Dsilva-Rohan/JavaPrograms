package Strings;

public class PalindromString 
{ 
	public static void palindrom(String s)
	{
		String temp=s;
		int length=s.length();
		String reverse="";
		for(int i=length-1; i>=0; i-- )
		{
			reverse=reverse+s.charAt(i);
			
		}
		if(temp.contentEquals(reverse))
		{
			System.out.println("Given String is palindrom: "+reverse);
		}
		else
		{
			System.out.println("Given String is not a palindrom: "+reverse);
		}
		
	}
	
	public static void main(String args[])
	{
		palindrom("Christopher");
	}
  
}
