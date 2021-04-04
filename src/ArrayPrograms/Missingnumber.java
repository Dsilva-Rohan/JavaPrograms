package ArrayPrograms;

public class Missingnumber
{
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,6,7};
		int missingsum=0;
		int allsum=0;
		for(int i=0; i<a.length; i++)
		{
			
			missingsum=missingsum+a[i];
		}
		
		System.out.println("missingsum :"+missingsum);
	
	  for(int j=1;j<=7;j++)
	  {
		
		allsum=allsum+j;
	  }
	  System.out.println("allsum:"+allsum);
	  int findnumber=allsum-missingsum;
	  System.out.println("Missing number is :"+findnumber);
	  
	}

}
