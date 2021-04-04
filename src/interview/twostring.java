package interview;

public class twostring {

	public static void main(String[] args)
	{
		 
       twostring("Bangalore","Bangalore");
	}

   public static void twostring(String a, String b)
   {
	   boolean flag=true;
	   for(int i=0;i<a.length();i++)
	   {
		   
			   if(a.charAt(i)==b.charAt(i))
			  
				 
			   
			      flag=true;
			   System.out.println("strings are equal");
		         
			}
			      flag=false;
			      System.out.println("strings are not  equal");
	        
		       
      
      }
}

