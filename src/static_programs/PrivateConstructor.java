package static_programs;

public class PrivateConstructor 
{
     int age;
	private PrivateConstructor(int age)
	{
		this.age=age;
	}
	
	public static void main(String[] args)
	{
		PrivateConstructor data=new PrivateConstructor(40);
		
		System.out.print("Age of the person:: "+data.age);
		
	}
	  
	public static int call()
	{
		PrivateConstructor data1=new PrivateConstructor(50);
		int i=data1.age;
		return i;
		
	}

}
