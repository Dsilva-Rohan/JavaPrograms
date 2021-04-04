package Strings;

public class DuplicateStrings
{
  public static void main(String args[])
  {
	  String StringArray[]= {"Java","Selenium","C#","Python","JavaScript","Selenium"};
	  
	  for(int i=0; i<StringArray.length; i++ )
	  {
		  for(int j=i+1; j<StringArray.length; j++)
		  {
			  if(StringArray[i].contentEquals(StringArray[j]))
			  {
				  System.out.println("String which found as Duplicate"+StringArray[i]);
				  
			  }
		  }
	  }
  }
}
