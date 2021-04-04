package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class hastableTest
{
  
	public void Hasshtabledata()
   {
	   Hashtable<String,String> table=new Hashtable<String,String>();
	   table.put("1", "Hashtable Christopher");
	   table.put("2", "Hashtable Rohan");
	   System.out.println(table);
	   Hashtable<String,String> table2=new Hashtable<String,String>();
	   table2=(Hashtable)table.clone();
   }
	
   public void Hashmap()
   {
	   HashMap<Integer,String> map=new HashMap<Integer,String>();
	   map.put(1,"Christopher Hashmap");
	   map.put(2,"Christopher Hashmap");
	   System.out.println(map);
	   Set s=map.entrySet();
	   System.out.println("Using the Entry Set"+s);
   }
   
   public static void main(String args[])
   {
	   hastableTest t=new hastableTest();
	   ArrayList list=new ArrayList();
	   list.add("Test");
	   t.Hasshtabledata();
	   t.Hashmap();
   }
	   
}
