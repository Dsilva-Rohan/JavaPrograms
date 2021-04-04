package interview;

public class interviewprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Input String is AAABGGA
		//OutPut A3B1G2A1
		
		stringcalculate("AUUhYYTOI");

	}

	public static void  stringcalculate(String s)
	{
		int counta=0;
		int counte=0;
		int counti=0;
		int counto=0;
		int countu=0;
		int constantdata=0;
		
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='A')
			{
				counta++;
			}
			else if(s.charAt(i)=='E')
			{
				counte++;
			}
			else if(s.charAt(i)=='I')
			{
				counti++;
			}
			
			else if(s.charAt(i)=='O')
			{
				counto++;
			}
			
			else if(s.charAt(i)=='U')
			{
				countu++;
			}
			else 
			{
				
				constantdata++;
			}
		}
		System.out.println("Given String to count Vowels::"+s);
		System.out.println("count of A::"+counta+"  count of E::"+counte+"  count of I::"+counti+" "
				+ " count of O::"+counto+"  count of U::"+countu+"  Constant::"+constantdata);
			
	}
}
