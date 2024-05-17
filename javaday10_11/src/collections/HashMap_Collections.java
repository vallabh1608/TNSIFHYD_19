package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//it is like a dictionary format
		HashMap<Integer, String>hm=new HashMap<Integer, String>();
		
		hm.put(1,"coding");
		hm.put(2,"like");
		hm.put(3,"poetry");
		hm.put(4,"should");
		hm.put(5,"be");
		hm.put(6,"short &");
		hm.put(7,"concise");
		
		System.out.println(hm);
		//finding value for key
		System.out.println("value for 1 is: "+hm.get(1));
		
		//traversing through the hashmap
		
		for(Map.Entry<Integer,String>e:hm.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		

	}

}
