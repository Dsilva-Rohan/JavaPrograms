package Collections;

import java.util.ArrayList;
import java.util.Iterator;



public class ListIteration 
{

	public static void main(String[] args)
	{
		ArrayList<String> item=new ArrayList<String>();
		item.add("Mango");
		item.add("Apple");
		item.add("Orrange");
		item.add("Nuts");
		item.add("Dates");
		
		item.forEach(data->{
		System.out.println(data);
		});
		
		//---------------------------
		
	 Iterator<String>it=item.iterator();
	 Iterator<String> alldata=null;
	  while(it.hasNext())
	  {
		   alldata=it;
		   System.out.println("Iteration  "+alldata);
	  }
		
	  Iterator<String>its=item.iterator();
	  its.forEachRemaining(data->{
		  System.out.println(data);
	  });
	  
	  System.out.println("For Each Data ");
	  for(String fordata:item)
	  {
		  System.out.println(fordata);
	  }
	  System.out.println("For normal loop index ");
	  for(int i=item.size()-1; i>=0; i--)
	  {
		  String allitem=item.get(i);
		  System.out.println(allitem);
	  }
	}  
	}


