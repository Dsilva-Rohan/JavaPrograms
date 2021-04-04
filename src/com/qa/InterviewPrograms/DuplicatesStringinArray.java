package com.qa.InterviewPrograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesStringinArray {

	public static void main(String[] args)
	
	{
		String arrays[]= {"Christopher","Rohan","Dsilva","Mangalore","Bangalore","Christopher", "Bangalore"};
		findduplicates(arrays);
		findduplicatinset(arrays);
		reversestring("Dildar");
		StringPalindrom("Malyalam");
		String s=substringreplace("^&^%&%*%$gdsfgdg");
		System.out.println(s);

	}
     public static void findduplicates(String arrays[])
     {
    	 
    	 for(int i=0; i<arrays.length; i++)
    	 {
    		 for(int j=i+1; j<arrays.length; j++)
    		 {
    			 if(arrays[i].equalsIgnoreCase(arrays[j]))
    			 {
    				 System.out.println("Found the duplicate String   "    +arrays[i]);
    				 
    			 }
    			 
    		 }
    			 
    	 }
    	  
     }
     
     public static void findduplicatinset(String arrays[])
     {
    	 
    	 Set<String> setstring=new HashSet<String>();
    	 for(int i=0; i<arrays.length;i++)
    
    	 {
    		if(setstring.contains(arrays[i])) 
    		{
    			System.out.println(" Set Given String is duplicate "+arrays[i]);
    		}
    		else
    		{
    			setstring.add(arrays[i]);
    		}
    	 }         	 
    	 
     }
     
     public static void reversestring(String name)
     {
    	  String  reversestring="";
    	 for(int i=name.length()-1; i>=0; i--)
    	  {
    		  reversestring=reversestring+name.charAt(i);
    		  
    	  }
           System.out.println(reversestring);
     }
     
     public static void StringPalindrom(String strname)
     {
    	 String reverse="";
    	 for(int i=strname.length()-1; i>=0; i--)
    	 {
    		 reverse=reverse+strname.charAt(i);
       
    	 } 
    	 if(reverse.equalsIgnoreCase(strname))
    	 {
    		 System.out.println("Given string is palindrom  "+reverse);
    		 
    	 }
    	 else
    	 {
    		 System.out.println("Given string is not a palindrom  "+reverse);
    	 }
     }
     
     public static String substringreplace(String s)
     {
    	
    	 s=s.replaceAll("[%&^*$ 0-9]","");
    	 return s;
    	 
     }
	
}
