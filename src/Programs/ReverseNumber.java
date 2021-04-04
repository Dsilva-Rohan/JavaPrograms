package Programs;

public class ReverseNumber
{

 public static void ReverseNumber(int number)
 {
	 int sum=0;
	 while(number>0)
	 {
		 int reminder=number%10;
		 sum=(sum*10)+reminder;
		 number=number/10;  	 
	 }
	 
	 System.out.println("Reverse of given number:  "+sum);
 }
 
 public static void main(String args[])
 {
	 ReverseNumber(4586);
 }
}
