package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add("Akshay");
		hs.add('a');
		hs.add(20);
		System.out.println(hs);
        
		HashSet hs1=new HashSet();
		hs1.add("Ankita");
		hs1.add(30);
		System.out.println(hs1);
		hs.addAll(hs1);
		System.out.println(hs.contains(10d));
		System.out.println(hs.contains("Ankita"));
		System.out.println(hs.containsAll(hs1));
		hs.remove("Ankita");
		System.out.println(hs);
		hs.removeAll(hs1);
		System.out.println(hs);
		hs.clear();
		System.out.println(hs);
		hs.add(20);
		hs.add("King");
		hs.add("Lion");
		System.out.println(hs.size());
		Iterator i=hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		Object o[]=hs.toArray();
		System.out.println(Arrays.toString(o));
		System.out.println(hs.isEmpty());
	}

}
