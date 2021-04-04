package StarPattern;

public class PrintStar
{
   public static void main(String args[])
   {
	   PrintStar star=new PrintStar();
	   int row=5;
	   int col=5;
	   star.PrintingData(row,col);
	   CombineStar(row,col);
   }
	   
     public void PrintingData(int row, int col)
     {
      for(int i=0; i<row; i++)
	   {
		   for(int j=0; j<=i; j++)
		   {
			   System.out.print("*");	   
		   }
	       System.out.println();  
	   }
	   
	   System.out.println("--------------------");
	   
	   for(int i=0; i<row; i++)
	   {
		   for(int j=col; j>i; j--)
		   {
			   System.out.print("*");
			   
		   }
		  System.out.println(""); 
	   }
     }
    
     public static void CombineStar(int row, int col)
     {
    	 System.out.println("---------Combine Star-----------");
    	 for(int i=0; i<row; i++)
    	 { 
    		for(int j=0; j<=i; j++)
    		{
    		   System.out.print("*");
    	    }
            
    		 System.out.println();
    	 }
    	 
    	 
    	 for(int i=0; i<row; i++)
    	 {
    		 for(int j=col; j>=i; j--)
    		 {
    			 System.out.print("*");
    		 }
    		 System.out.println(); 
    	 }
         
      }
    }
