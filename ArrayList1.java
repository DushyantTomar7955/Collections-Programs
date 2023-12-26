package Collections;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("Akshay");
		al.add('c');
		al.add(null);
		al.add(30);
		al.add(40);
		al.add(null);
		al.add(4, "Pragya");
	    ArrayList al2=new ArrayList();
	    al2.add("Prachi");
	    al2.add(40);
		System.out.println(al);
		al.addAll(al2);
		System.out.println(al);
		al.addAll(0, al2);
		System.out.println(al);
		System.out.println(al.contains("Pragya"));
		System.out.println(al.containsAll(al2));
		System.out.println(al.indexOf("Prachi"));
        System.out.println(al.lastIndexOf("Prachi"));
        al.remove(5);
        al.remove(4);
        al.remove(2);
        al.remove(8);
        al.remove(5);
        System.out.println(al);
        al.removeAll(al2);
        System.out.println(al);
        System.out.println(al2);
        al2.clear();
        System.out.println(al2);
        al.set(0, "Prachi Joshi");
        al.set(3, "Prachi Joshi");
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.isEmpty());
        System.out.println(al2.isEmpty());
        System.out.println(al.get(0));
        System.out.println(al.get(3));
        Object []o=al.toArray();
        for(int i=0;i<o.length;i++) {
        	System.out.print(o[i]+" ");
        }
        System.out.println();
        System.out.println("==============");
        for(int i=0;i<al.size();i++) {
        	System.out.print(al.get(i)+" ");
        }
        System.out.println();
        System.out.println("===============");
        for(Object l:al) {
        	System.out.print(l+" ");
        }
        
	}

}
