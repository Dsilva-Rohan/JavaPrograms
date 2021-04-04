package static_programs;

public class StaticBlock_Initialization
{
	
	static String name="Mangalore";
	String dataname;
	int i;
   static
   {
	   StaticBlock_Initialization block=new StaticBlock_Initialization();
	   
	   block.i=30;
	   name="Bengaluru";
	   System.out.println("Static block Data initiaization  "+block.dataname);
	   System.out.println("Static block Data initiaization  "+block.i);
	   System.out.println("Static block Data initiaization  "+name);
	  
   }

}
