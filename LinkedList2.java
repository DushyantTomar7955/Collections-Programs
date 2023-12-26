package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(20);
		al.add(10);
		al.add(57);
		al.add(99);
		al.add(99);
		LinkedList l=new LinkedList(al);
		Collections.sort(l);
		Iterator i=l.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println();
		System.out.println("==============");
		 i=l.descendingIterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}

	}

}
