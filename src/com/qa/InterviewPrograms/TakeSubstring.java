package com.qa.InterviewPrograms;

import java.util.HashSet;
import java.util.Set;

public class TakeSubstring 
{
    public static void main(String args[])
   {
    	String h=collectsubstring("ABCDEFAMNIVOXZ");
    	System.out.println("Given data is ABCDEFA Substring data is  "+h);
    	
    	int number=reversenumber(4567);
    	System.out.println("Given number revers is "+number);
    	
    	long orginalnumber=7777;
    	long reversenumber=palindromnumber(orginalnumber);
    	System.out.println("Given number revers is "+orginalnumber);
 	   
 	   if(orginalnumber==reversenumber)
 	   {
 		   System.out.println("Given number is palindrom   "+reversenumber);
 		   
 	   }
 	   else 
 	   {
 		   System.out.println("Given number is not palindrom  "+reversenumber);
 	   }
 	 
   }
   
    //Generate substring from given string till the next char repeated.
   public static String collectsubstring(String str)
   {
	   Set<Character> stringdata=new HashSet<Character>();
	   String tillnow="";
	   String substring="";
	   
	   for(int i=0; i<str.length(); i++)
	   {
		   char kk=str.charAt(i);
		   if(stringdata.contains(kk))
		   {
			   tillnow=""; 
			   stringdata.clear();
		   }
		   else
		   {
			   stringdata.add(kk);
			   tillnow=tillnow+kk;
		   }
		      
		   if(tillnow.length()>substring.length())
		   {
			   substring=tillnow;
		   }
			   
	   }
	   return substring;
	   
   }
   
   //
   public static int reversenumber(int number)
   {
	   int reminder=0;
	  
	   int reverse=0;
	   while(number>0)
	  {
	   reminder=number%10;
	   number=number/10;
	   reverse=reverse*10+reminder;
	  }
	   return reverse;
	   
   }
   
   //function to generate reverse number
   public static long palindromnumber(long number)
   {
	  long orginalnumber=number;
	   long reminder=0;
	   long reverse=0;
	   while(number>0)
	   {
		   reminder=number%10;
		   number=number/10;
		   reverse=(reverse*10)+reminder;
	   }
	    return reverse;
   }
  
}


