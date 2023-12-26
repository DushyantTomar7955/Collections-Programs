package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) 
	{
	    Map<String,Integer>mp=new HashMap();
	    mp.put("apple",120);
	    mp.put("mango", 130);
	    mp.put("banana",120);
	    System.out.println(mp);
	    System.out.println(mp.size());
	    System.out.println(mp.containsKey("apple"));
	    System.out.println(mp.containsValue(120));
	    mp.remove("apple");
	    System.out.println(mp);
	    mp.remove("mango",130);
	    System.out.println(mp);
	    System.out.println(mp.get("banana"));
	    System.out.println(mp.keySet());
	    System.out.println(mp.values());
	    
	    
	    

	}

	private static HashSet entrySet(Map<String, Integer> mp) {
		// TODO Auto-generated method stub
		return null;
	}

}
