package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList l=new LinkedList<>();
		l.add("Pragya");
		l.add(10);
		l.add('c');
		l.add(99.08f);
		l.add("Mango");
		System.out.println(l);
		l.addFirst("Prachi");
		l.addLast("Neha");
		l.add("Sonali Sharma");
		l.add('c');
		System.out.println("===============================");
		System.out.println(l);
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        l.offerFirst("Prachi Joshi");
        l.offerLast("Sonali Sharma");
        System.out.println(l);
        l.remove();
        System.out.println(l);
        System.out.println("===============================");
        l.removeFirstOccurrence("Sonali Sharma");
        System.out.println(l);
        l.removeLastOccurrence('c');
        System.out.println("===============================");
        System.out.println(l);
        System.out.println("===============================");
        l.removeLast();
        System.out.println(l);
        System.out.println("===============================");
        Iterator i=l.descendingIterator();
        while(i.hasNext()) {
        	System.out.print(i.next()+" ");
        }
        i=l.iterator();
        System.out.println();
        System.out.println("===============================");
        while(i.hasNext()) {
        	System.out.print(i.next()+" ");
        }
        
	}

}
