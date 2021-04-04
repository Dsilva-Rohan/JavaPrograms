package InterviewPrograms;

public class AddigngDot
{  
	public  static void addingdots(String dotvalue)
	{
		String afterdot="";
		for(int i=0; i<dotvalue.length();i ++) 
		{
			afterdot=afterdot+dotvalue.charAt(i);
			if(i==dotvalue.length()-1)
			{
				break;
			}
			afterdot=afterdot+".";
		}
		System.out.println(afterdot);
		
	}
     public static void main(String args[])
    {
    	 AddigngDot add=new AddigngDot(); 
    	 addingdots("hello");
    }
}
