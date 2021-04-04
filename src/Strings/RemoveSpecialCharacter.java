package Strings;

public class RemoveSpecialCharacter
{
	public static void Specialchar(String s)
	{
		
		s=s.replaceAll("[%^&* 0-9]","");
		System.out.println(s);
		
	}
	
   public static void main(String args[])
   {
	   Specialchar("%%^&%&*0077Selenium Java");
	   Specialchar("%%^&%&*Dil Nache");
	   Specialchar("%%^&%&*Chris Rohan");
   }
   
}