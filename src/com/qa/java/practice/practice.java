package com.qa.java.practice;

public class practice
{

	public static void calldata(String name)
	{
		String addingdot="";
		for(int i=0; i<name.length(); i++)
		{
			
			addingdot=addingdot+name.charAt(i);
			if(i==name.length()-1)
			break;
			addingdot=addingdot+".";
			
		}
		System.out.println(addingdot);
		
	}
	
	public static void calculate(String name)
	{
		String adding="";
		int count=0;
		for(int i=0; i<name.length(); i++)
		{
			adding=adding+name.charAt(i);
			if(name.charAt(i)==name.charAt(i)+1)
			{
				count++;
				
				
			}
			else
			System.out.println(adding);
			
		
		}
		
		
	}
	public static void main(String[] args)
	{
		 calldata("Christopher");
		 calculate("adsagsdfgfd");

	}

}
