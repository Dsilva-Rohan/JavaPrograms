/**
 * 
 */
package static_programs;

/**
 * @author rohan
 *
 */
public class Static_Programs 
{
   static
   {
	   System.out.println("This is a static block execution");
   }
   
   static
   {
	   System.out.println("This is a 2nd static block execution");
   }
   
   static
   {
	   System.out.println("This is a 3rd static block execution");
   }
   
   public static void main(String args[])
   {
	   System.out.println("This is static main  Method");
	   test();
	   
   }
   
   static
   {
	   System.out.println("This is a 4rd static block execution");
   }
   
   public static void test()
   {
	   System.out.println("This is static method");
	   test2();
   }
   
   public static void test2()
   {
	   System.out.println("This is a 2nd static method");
	   
   }
}