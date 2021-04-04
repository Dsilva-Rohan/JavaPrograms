package com.qa.InterviewPrograms;

import java.util.Scanner;

public class Occurences
{
  public static void main(String args[])
  {
	  
	  int value=occurences("Bangalore", "a");
	   System.out.println("Occurences are::::->"+value);
	  
	  System.out.println("Enter a String");
	   Scanner scan=new Scanner(System.in);
	   String inputstring=scan.nextLine().toUpperCase();
	   System.out.println("Given String is "+inputstring);
	  
	   
	   System.out.println("Enter a character");
	   Scanner scan2=new Scanner(System.in);
	   String charstr=scan2.next().toUpperCase();
	  
	   String str3=inputstring.replace(charstr,"");
	   
	   int orginalstring=inputstring.length();
	   int updatedstrig=str3.length();
	   
	   int finaloccurence=orginalstring-updatedstrig;
	   System.out.println("Given character:::->"+charstr+" Occurences are::::->"+finaloccurence);
	
  }
  
  public static Integer occurences(String data, String c)
    {
	   String str3=data.replace(c,"");
	   
	   int orginalstring=data.length();
	   int updatedstrig=str3.length();
	   
	   int finaloccurence=orginalstring-updatedstrig;
	 
	   System.out.println("GivenString:::->"+data+" Given character:::->"+c);
	   return finaloccurence;
  }

}

