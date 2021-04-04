package Strings;



public class ReverseString 
{
	
	public static void Strings(String s)
	{
		//String s="Christopher Selenium"
		String reverse="";
		int lenght=s.length();
		for (int i=lenght-1;i>=0; i--)
		{
			
			reverse=reverse+s.charAt(i);	
		}
		System.out.println(reverse);
	}
	
			
public static void main(String args[])
{
	Strings("Selenium");
}


}
