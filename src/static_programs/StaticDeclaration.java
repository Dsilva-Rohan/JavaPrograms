package static_programs;

public class StaticDeclaration
{
   static
   {
	   System.out.println("This is static block");
	   
   }
   
     
   public  final int x=10;
   
   public static void main (String args[])
   {
	   StaticDeclaration st=new StaticDeclaration();
	   System.out.println(st.x);
   }

}
