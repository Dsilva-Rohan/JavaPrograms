package InterviewPrograms;

public class ReverseString
{
  public static void reverse(String r)
  {
	  int len=r.length();
	  String reverse="";
	  for(int i=r.length()-1; i>=0; i--)
	  {
		 
		  reverse=reverse+r.charAt(i);  
	  }
	  System.out.println("Reverse string is"+reverse);
  }
  public static void main(String args[])
  {
	  reverse("Selenium");
	  
  }
}
