package Strings;

public class Stringbuilder
{
	public static void builder(String s)
	{
		StringBuilder build=new StringBuilder(s);
		StringBuilder reversing;
		reversing=build.reverse();
		System.out.println(reversing);
		
	}
    public static void main(String args[])
    {
    	builder("Professional");
    }
}
