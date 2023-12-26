package Collections;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;



public class LinkedHashSetQuestion1 
{
	
	public static void removeDuplicates(String s) {
		String str[]=s.split(" ");
		LinkedHashSet<String>hs1=new LinkedHashSet();
		LinkedHashSet<String>hs2=new LinkedHashSet();
		for(int i=0;i<str.length;i++) {
			if(!hs1.add(str[i]))
				hs2.add(str[i]);
			else
				hs1.add(str[i]);
		}
		System.out.println(hs2);
		System.out.println("==========================");
		LinkedList<String>li=new LinkedList(hs2);
//		Collections.sort(li);
//		System.out.println(li);
		
		for(int i=0;i<li.size();i++) {
			for(int j=i+1;j<li.size();j++) {
				if(li.get(i).compareTo(li.get(j))>0) {
					String temp=li.get(i);
					li.set(i, li.get(j));
					li.set(j, temp);
				}
			}
		}
		System.out.println(li);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
		removeDuplicates(s);
	}

}
