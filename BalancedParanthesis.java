package Collections;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {
	
	public static boolean balanced(String str) {
		Stack<Character> s=new Stack<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[')
				s.push(ch);
			else {
				if(s.isEmpty())
					return false;
				else {
					char poped=s.pop();
					if((poped=='{' && ch!='}') || (poped=='['&& ch!=']') || (poped=='('&& ch!=')'))
						return false;
				}
			}
		}
		return s.isEmpty();
	}

	public static void main(String[] args) {
	    System.out.print("Enter the String: ");
	    Scanner sc=new Scanner(System.in);
	    String s=sc.next();
	    System.out.println(balanced(s));

	}

}
