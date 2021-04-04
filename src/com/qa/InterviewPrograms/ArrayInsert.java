package com.qa.InterviewPrograms;

import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args)
	{
		
		int a[]= {10,20,30,40,50,60,0};
		position(a,2,600);
		int i;
		int size=5;
		int insert[]=new int[size];
		
		System.out.println("Enter the element for the array");
		Scanner scan=new Scanner(System.in);
		for(i=0; i<insert.length; i++)
		insert[i]=scan.nextInt();
		
		System.out.println("Array elements");	
		for(i=0; i<insert.length; i++)
		System.out.println(insert[i]);
		
		System.out.println("Enter the location to insert");	
		Scanner scanlocation=new Scanner(System.in);
		int pos=scanlocation.nextInt();
		
		System.out.println("Enter the element to insert");	
		Scanner insertele=new Scanner(System.in);
		int ele=insertele.nextInt();
		
		for(i=insert.length-1; i>pos; i--)
		{
			insert[i]=insert[i-1];
		}
			
		    insert[pos]=ele;
		    
		  System.out.println("After inserting the element");	
		  for(i=0; i<insert.length; i++)
		 System.out.println(insert[i]);	  
			  
		  
	}

	public static void position(int a[],int position, int insertelement) 
	{
		 System.out.println("Before inserting the element");	
		  for(int i=0; i<a.length; i++)
		  System.out.println(a[i]);	
		
		for(int i=a.length-1; i>=position; i--)
		{
			a[i]=a[i-1];
		}
			
		    a[position]=insertelement;
		  
		  System.out.println("After inserting the element");	
		  for(int i=0; i<a.length; i++)
		  System.out.println(a[i]);	  
			  
	}
}
