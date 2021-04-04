package static_programs;

public class StaticInstance
{

	   static
	   {
		   System.out.println("This is static block");
		   
	   }
	   
	   {
		   System.out.println("Instance Initialisation");
	   }
	   
	   StaticInstance()
	   {
		   System.out.println("This is the constructor");
	   }
	     
	   public  static final int x=10;
	   
	   public static void main (String args[])
	   {
		  
		   StaticInstance st=new StaticInstance();
		   System.out.println(StaticInstance.x);
		   System.out.println("Main Method");
	   }

  }



