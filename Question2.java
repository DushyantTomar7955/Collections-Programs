package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Question2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add("Shivam");
		al.add("Sonali");
		al.add("Shivani");
		al.add(15.07f);
		al.add("Harshita");
		al.add(19.45f);
		al.add("Neha");
		al.add("Prachi");
		for(Object o:al) {
			if(o instanceof Integer) 
				System.out.println(o);	
			if(o instanceof Float)	
			    System.out.println(o);
			if(o instanceof String) {
			        String str=(String)o;
			        if(str.startsWith("S"))
			        	System.out.println(str);
			        if(str.endsWith("a"))
			        	System.out.println(str);
			}
		}

	}

}
