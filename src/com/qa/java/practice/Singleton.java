package com.qa.java.practice;

public class Singleton
{
	    private static Singleton single_instance = null;  
	    int i;  
	     private Singleton ()  
	     {  
	         i=90;  
	     }  
	     public static Singleton Singletondata()  
	     {  
	         if(single_instance == null)  
	         {  
	             single_instance = new Singleton();  
	         }  
	         return single_instance;  
	     }
		
	}  
	 class main
	 {
		 
	    public static void main (String args[])  
	    {  
	        Singleton first = Singleton.Singletondata();  
	        System.out.println("First instance integer value:"+first.i);  
	        first.i=first.i+90;  
	        Singleton second = Singleton.Singletondata();  
	        System.out.println("Second instance integer value:"+second.i);  
	    }  
	}  

	

