package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class HashSetQuestionPrintDuplicates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		HashSet<String> hs=new HashSet();
		HashSet<String>hs2=new HashSet();
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++) {
			if(hs.add(s1[i])==false)
				hs2.add(s1[i]);
			else
				hs.add(s1[i]);
		}
		Iterator i=hs2.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
	}

}
