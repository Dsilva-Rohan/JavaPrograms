package InterviewPrograms;

public class duplicateString
{
	public static void main(String Args[])
	{
		String s[]= {"java","Selenium","Java"};
        
		for(int i=0;i<s.length; i++)
		{
			for(int j=i+1; j<s.length; j++)
			{
				if(s[i].equalsIgnoreCase(s[j]))
				{
				  System.out.println("The Strings are equal"+s[i]);
			    }
		}
	  }
	}	 
}
