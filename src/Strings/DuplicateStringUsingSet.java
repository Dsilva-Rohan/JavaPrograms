package Strings;

import java.util.HashSet;
import java.util.Set;

public class DuplicateStringUsingSet 
{
	public static void main(String Args[])
	{
		
		String arraydata[]= {"Selenium","Java","C#","Python","Python"};
		Set<String> setarray=new HashSet<String>();
		for(int i=0; i<arraydata.length; i++)
		{
			if(setarray.add(arraydata[i])==false)
			{
				System.out.println("Duplicate array"+arraydata[i]);
			}
		}
		
		
	}

}
