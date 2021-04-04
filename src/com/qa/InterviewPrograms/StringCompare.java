package com.qa.InterviewPrograms;

public class StringCompare {

	public static void main(String[] args)
	{
	   Stringcheck("Bangalore","Mangalore");

	}

	public static void Stringcheck(String s1, String s2)
	{
		int flag=0;
		if(s1.length()==s2.length())
		{
		   
			for(int i=0; i<s1.length(); i++)
		   {
			 if(s1.charAt(i)!=s2.charAt(i))
			 {
				System.out.println("Given String is not equal"+"  "+ s1+"  " + s2);
				flag=1;
				break;
			}
           
		  }
	      if(flag==0)
	      {
	    	 System.out.println("Given String is "+"  "+ s1+"  " + s2);
	      }
	  }
	  else
	  {
		  System.out.println("Size of the String are not equal");
	  }	
   }
	
}
