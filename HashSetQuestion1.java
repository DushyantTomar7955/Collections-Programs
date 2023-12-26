package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetQuestion1 {

	public static void main(String[] args) 
	{
          HashSet hs=new HashSet();
          hs.add(10);
          hs.add("Shivani");
          hs.add(15);
          hs.add("Pragya");
          hs.add(19);
          hs.add("Shivam");
          hs.add(34);
          hs.add("Neha");
          hs.add("Sonali");
          hs.add("Prachi");
          hs.add("Ankita");
          System.out.println(hs);
          
          for(Object o:hs) {
        	  if(o instanceof String) {
        		  String str=(String)o;
        		   if(str.startsWith("S"))
        			   System.out.println(str);	   	   
        	  }
        	  if(o instanceof Integer) {
        	        int i=(int)o;
        	        if(i>10 && i<20) 
        	        	System.out.println(i);    
        	  }
          }
          
          Iterator i=hs.iterator();
          while(i.hasNext()) {
        	  Object o=i.next();
        	  if(o instanceof Integer) {
        		  int n=(int)o;
        		  if(n>10 && n<20)
        			  System.out.println(n);
        	  }
        	  if(o instanceof String) {
        		  String str=(String)o;
        		  if(str.startsWith("S"))
        			  System.out.println(str);
        		  if(str.endsWith("a"))
        			  i.remove();;
        	  }
        	  
          }
          System.out.println(hs);
	
	}

}
