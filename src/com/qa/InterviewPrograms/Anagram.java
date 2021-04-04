package com.qa.InterviewPrograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args)
	{
		 
		boolean flag=anagram("kkk","kk");
		System.out.println((flag) ? "anagram" :"not anagrmas");

	}
	
	public static boolean anagram(String a, String b)
	{
		String x=a.replace(" ","").toUpperCase();
		String y=b.replace(" ","").toUpperCase();
		
		char p[]=x.toCharArray();
		char q[]=y.toCharArray();
		
		Arrays.sort(p);
		Arrays.sort(q);
		
		System.out.println(p);
		System.out.println(q);
		
		if(Arrays.equals(p,q))
			
		return true;
		else
		return false;

	}

}
