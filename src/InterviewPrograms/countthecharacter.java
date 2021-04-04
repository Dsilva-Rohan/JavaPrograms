package InterviewPrograms;

public class countthecharacter
{
	public static void count(String text)
	 {    
          
        int identifier = 0;      
        for(int i = 1; i < text.length(); i++)
        {    
            if(text.charAt(i) !=' ')    
            	identifier++;    
        }     
        System.out.println("Total number of characters in a string: " + identifier);    
    }   

	public static void main(String[] args) 
	{
		 count("Java is a Programming Language");
	}

}
