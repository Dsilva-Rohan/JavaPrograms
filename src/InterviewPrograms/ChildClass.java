package InterviewPrograms;

public class ChildClass extends polymorphism
{
	 public void run() 
	   {
	      System.out.println("This is the child class Method");
	      
	   }
	 public void close() 
	   {
	      System.out.println("This is the child class Method");
	      
	   }
	 
	 
	 final static public void main(String args[])
   {
		polymorphism parent=new ChildClass();
		parent.run();
		
   }
}
