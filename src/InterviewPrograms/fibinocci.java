package InterviewPrograms;

public class fibinocci
{
    int k=20;
	public static  void fibinocci(int n)
  {
	  int f1=0;
	  int f2=1;

	  System.out.println("fibinocci::"+f1);
	  System.out.println("fibinocci::"+f2);
	 for(int f3=0;f3<=n; f3++)
	 {
		 f3=f1+f2;
		 f1=f2;
		 f2=f3;
		if(f3<=n)
		{	
		  System.out.println("fibinocci::"+f3);
		}  
	 }
  }
  public static void main(String args[])
  {
	  fibinocci(10);
	  
  }
}
