package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(19);
		al.add(19);
		al.add(10);
		al.add(30);
		al.add(40);
		al.add(40);
	
		for(int i=0;i<al.size();i++) {
			boolean b=true;
		  for(int j=i+1;j<al.size();j++) {
			  if(al.get(i)==al.get(j)) {
				  b=false;
				  al.remove(j);
				  al.remove(i);
				  break;Stac
			  }
		  }
		}
		System.out.println(al);
		
	}

}
