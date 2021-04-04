package InterviewPrograms;

import java.util.Arrays;

public class Anagram
{

	   public static void AnagramofString(String string1, String string2)
	   {  
	        
		   boolean flag = true;  
		   
		    String firststrig = string1.replaceAll(" ", "").toUpperCase();  
	        String SecondString = string2.replaceAll(" ", "").toUpperCase();  
	        
	        if (firststrig.length() != SecondString.length())
	        {  
	            flag = false;  
	        } 
	        else 
	        {  
	            char[] firstword = firststrig.toCharArray();  
	            char[] Secondword = SecondString.toCharArray();  
	            
	            Arrays.sort(firstword);  
	            Arrays.sort(Secondword);  
	            
	            Arrays.equals(firstword, firstword);  
	        }  
	        if (flag==true)
	        {  
	            System.out.println(firststrig + " and " + SecondString + " are anagrams");  
	        } 
	        else 
	        {  
	            System.out.println(firststrig + " and " + SecondString + " are not anagrams");  
	        }  
	    }  
	   
	    public static void main(String[] args)
	    {  
	    	AnagramofString("listen", "silent");  
	       
	    }
}
