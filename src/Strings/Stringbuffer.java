package Strings;

public class Stringbuffer {
	
	public static void Buffer(String s)
	{
		StringBuffer buffering=new StringBuffer(s);
		StringBuffer reverse;
		reverse=buffering.reverse();
		System.out.println(reverse);
		
	}

	public static void main(String args[])
	{
		Buffer("Christopher");
	}
}
