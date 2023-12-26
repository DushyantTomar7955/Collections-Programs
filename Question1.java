package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Question1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("Akshay");
		al.add('c');
	    al.add(null);
	    al.add(40.23);
	    Iterator i=al.iterator();
	    while(i.hasNext()) {
	    	System.out.print(i.next()+" ");
	    }
	    System.out.println();
	    System.out.println("============================================================");
		ListIterator l=al.listIterator();
		while(l.hasNext()) {
			System.out.print(l.next()+" ");
		}
		while(l.hasPrevious()) {
			System.out.print(l.previous()+" ");
		}

	}


}