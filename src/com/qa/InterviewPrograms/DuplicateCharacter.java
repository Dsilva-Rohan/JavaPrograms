package com.qa.InterviewPrograms;

import java.util.HashMap;  
import java.util.Map;  
import java.util.Set; 

public class DuplicateCharacter
{
		    public static void Duplicate(String str)
		    {  
	          Map<Character, Integer> baseMap = new HashMap<Character, Integer>();  
	          char[] charArray = str.toCharArray(); 
	          
	         for (Character ch : charArray)
	         { 
	            if (baseMap.containsKey(ch))
	            {  
	                baseMap.put(ch, baseMap.get(ch) + 1);  
	            } 
	            else
	            {  
	                baseMap.put(ch, 1);  
	            }  
	        }
	         
	        Set<Character> keys = baseMap.keySet();  
	        
	        for (Character ch1 : keys)
	        {  
	            if (baseMap.get(ch1) >= 1)
	            {  
	                System.out.print(ch1+""+ baseMap.get(ch1));  
	            }  
	        }  
	    }  

	public static void main(String[] args)
	{
		
        Duplicate("AKBCAKK");

	}

}
