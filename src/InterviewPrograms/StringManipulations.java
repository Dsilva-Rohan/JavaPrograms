package InterviewPrograms;

public class StringManipulations
{
	public static void main(String args[])
	{
		
	  String s="Selenium Java"; 
	  String s2="Automation Testing";
	  String k="   gdfhdfhshfdAutomationfgdfgd   fgdfgdfgfTesting    ";
	  String s3="";
	  s3=s.concat(s2);
	  System.out.println("Concatinate::"+s3);
	  int n=s3.length();
	  System.out.println("Length::"+n);
	  System.out.println("Index Of O character::"+s3.indexOf("o"));
	  int b= s.compareTo(s2);
	  System.out.println("Comparing 2 Strings::"+ b); 
	  System.out.println("Indexing value CharAt::"+s3.charAt(15));
	  System.out.println("Index Of E::"+s3.indexOf('e')+1);
	  System.out.println("Index Of Testing"+s3.indexOf("Testing"));
	  System.out.println("equals"+s.equals(s3));
	  System.out.println("content"+s.contentEquals(s3));
	  System.out.println("content"+s.contentEquals(s3));
	  System.out.println("SubString"+s3.substring(21,28));
	  System.out.println("Trimkkkkkkkk::::"+k.trim());
	  System.out.println("Trim Space"+s3.replace(" ",""));
	  
	}

}
