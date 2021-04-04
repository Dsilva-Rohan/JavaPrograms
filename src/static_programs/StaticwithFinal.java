package static_programs;

//Static keyword with Final cannot execute static block before main method
//static block always execute before main method.

public class StaticwithFinal
{
    public static void main(String args[])
    {
    	System.out.println(Test.x);
    }
}

class Test
{
	public static final int x=100;
	static
	{
		System.out.println("This is static block");
	}
}